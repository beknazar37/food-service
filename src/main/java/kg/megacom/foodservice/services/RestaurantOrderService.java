package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.RestaurantOrderDto;

import java.util.List;

public interface RestaurantOrderService {
    RestaurantOrderDto saveRestaurantOrder(RestaurantOrderDto restaurantOrderDto);
    List<RestaurantOrderDto>findAllRestaurantOrder();

}
