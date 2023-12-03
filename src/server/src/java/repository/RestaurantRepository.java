package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import server.model.Restaurant;

import java.util.Optional;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

    Optional<Restaurant> findByRestaurantName(String restaurantName);

}
