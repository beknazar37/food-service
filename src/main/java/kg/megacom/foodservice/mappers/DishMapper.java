package kg.megacom.foodservice.mappers;


import kg.megacom.foodservice.models.dto.DishDto;
import kg.megacom.foodservice.models.entity.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DishMapper {

    DishMapper INSTANCE= Mappers.getMapper(DishMapper.class);

    Dish dishDtoToDish(DishDto dishDto);
    DishDto dishToDishDto(Dish dish);

    List<Dish> dishDtoToDishes(List<DishDto> dishDtos);
    List<DishDto> dishToDishDtos(List<Dish> dishes);
}
