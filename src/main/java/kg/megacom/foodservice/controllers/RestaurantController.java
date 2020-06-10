package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.RestaurantDto;
import kg.megacom.foodservice.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(value = "/save")
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto){

        return restaurantService.saveRestaurant(restaurantDto);
    }

    @GetMapping(value = "/list")
    public List<RestaurantDto> getAllRestaurant(){

        return restaurantService.findAllRestaurant();
    }

}
