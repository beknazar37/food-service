package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.RestaurantOrderRepository;
import kg.megacom.foodservice.mappers.RestaurantOrderMapper;
import kg.megacom.foodservice.models.dto.RestaurantOrderDto;
import kg.megacom.foodservice.models.entity.RestaurantOrder;
import kg.megacom.foodservice.services.RestaurantOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RestaurantOrderServiceImpl implements RestaurantOrderService {

    @Autowired
    RestaurantOrderRepository restaurantOrderRepository;

    @Override
    public RestaurantOrderDto saveRestaurantOrder(RestaurantOrderDto restaurantOrderDto) {

        RestaurantOrder restaurantOrder = RestaurantOrderMapper.INSTANCE.restaurantOrderDtoToRestaurantOrder(restaurantOrderDto);
        restaurantOrder = restaurantOrderRepository.save(restaurantOrder);
        restaurantOrderDto = RestaurantOrderMapper.INSTANCE.restaurantOrderToRestaurantOrderDto(restaurantOrder);

        return restaurantOrderDto;
    }

    @Override
    public List<RestaurantOrderDto> findAllRestaurantOrder() {

        return restaurantOrderRepository.findAll()
                .stream()
                .map(RestaurantOrderMapper.INSTANCE::restaurantOrderToRestaurantOrderDto)
                .collect(Collectors.toList());
    }
}
