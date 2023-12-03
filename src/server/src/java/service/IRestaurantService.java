package service;

import org.springframework.stereotype.Service;
import server.model.Restaurant;

@Service
public interface IRestaurantService {

    Iterable<Restaurant> getAllRestaurants();
}
