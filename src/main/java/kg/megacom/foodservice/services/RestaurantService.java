package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.RestaurantDto;
import kg.megacom.foodservice.models.dto.RestaurantOrderDto;

import java.util.List;

public interface RestaurantService {
    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);
    List<RestaurantDto>findAllRestaurant();
}
