package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.DishRepository;
import kg.megacom.foodservice.mappers.DishMapper;
import kg.megacom.foodservice.models.dto.DishDto;
import kg.megacom.foodservice.models.entity.Dish;
import kg.megacom.foodservice.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DishServiceImpl implements DishService {

    @Autowired
    DishRepository dishRepository;

    @Override
    public DishDto saveDish(DishDto dishDto) {

        Dish dish = DishMapper.INSTANCE.dishDtoToDish(dishDto);
        dish = dishRepository.save(dish);
        dishDto = DishMapper.INSTANCE.dishToDishDto(dish);

        return dishDto;
    }

    @Override
    public List<DishDto> findAllDish() {

        return dishRepository.findAll()
                .stream()
                .map(DishMapper.INSTANCE::dishToDishDto)
                .collect(Collectors.toList());
    }
}