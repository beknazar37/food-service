package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.DishDto;

import java.util.List;

public interface DishService {
    DishDto saveDish(DishDto dishDto);
    List<DishDto> findAllDish();
}
