package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.RestaurantOrderDto;
import kg.megacom.foodservice.models.entity.RestaurantOrder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantOrderMapper {
    RestaurantOrderMapper INSTANCE= Mappers.getMapper(RestaurantOrderMapper.class);

    RestaurantOrder restaurantOrderDtoToRestaurantOrder(RestaurantOrderDto restaurantOrderDto);
    RestaurantOrderDto restaurantOrderToRestaurantOrderDto(RestaurantOrder restaurantOrder);


    List<RestaurantOrder> restaurantOrderDtoToRestaurantOrders(List<RestaurantOrderDto> restaurantOrderDtos);
    List<RestaurantOrderDto> restaurantOrderToRestaurantOrderDtos(List<RestaurantOrder> restaurantOrders);
}
