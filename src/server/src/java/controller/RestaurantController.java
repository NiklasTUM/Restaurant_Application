package controller;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import server.model.Restaurant;
import service.RestaurantService;


@RestController
@ComponentScan(basePackages = {"server.service"})
@Component
public class RestaurantController {

    private final RestaurantService restaurantService;


    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("sayHello")
    public String sayHello() {
        return "Hello World!";
    }


    @PostMapping("restaurants")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    @GetMapping("restaurants")
    public Iterable<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("restaurants/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable("id") int id) {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping("restaurants/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable("id") int id) {
        return restaurantService.deleteRestaurant(id);
    }

    @PutMapping("restaurants/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@RequestBody Restaurant updatedRestaurant, @PathVariable("id") int id) {
        return restaurantService.updateRestaurant(updatedRestaurant, id);
    }

    @GetMapping("restaurants/{name}")
    public ResponseEntity<Restaurant> getRestaurantByName(@PathVariable("name") String restaurantName) {
        return restaurantService.getRestaurantByName(restaurantName);
    }

    public boolean reserveTable() {
        return true;
    }

    public boolean saveCalendarEvent() {
        return true;
    }

    public boolean confirmReservation() {
        return true;
    }

    public boolean cancelReservation() {
        return true;
    }






}
