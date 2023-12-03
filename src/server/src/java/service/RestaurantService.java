package service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import server.repository.RestaurantRepository;
import server.model.Restaurant;

import java.util.Optional;

@Service
public class RestaurantService implements IRestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Iterable<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public ResponseEntity<Restaurant> createRestaurant(Restaurant restaurant) {
        if(restaurant.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(restaurantRepository.save(restaurant));
    }

    public ResponseEntity<Restaurant> getRestaurantById( int id) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.findById(id);
        if(restaurantOptional.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(restaurantOptional.get());
    }

    public ResponseEntity<Restaurant> updateRestaurant(Restaurant updatedRestaurant, int id) {
        if(updatedRestaurant.getId() != id) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(restaurantRepository.save(updatedRestaurant));
    }

    public ResponseEntity<Void> deleteRestaurant(int id) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.findById(id);
        if(restaurantOptional.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        restaurantRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Restaurant> getRestaurantByName(String restaurantName) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.findByRestaurantName(restaurantName);
        if(restaurantOptional.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(restaurantOptional.get());
    }








}
