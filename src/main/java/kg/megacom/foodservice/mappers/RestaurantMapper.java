package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.RestaurantDto;
import kg.megacom.foodservice.models.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE= Mappers.getMapper(RestaurantMapper.class);

    RestaurantDto restaurantToRestaurantDto(Restaurant restaurant);
    Restaurant restaurantDtoToRestaurant(RestaurantDto restaurantDto);
}
