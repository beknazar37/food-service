package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.DishDto;
import kg.megacom.foodservice.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @PostMapping(value = "/save")
    public DishDto saveDish(@RequestBody DishDto dishDto){

        return dishService.saveDish(dishDto);
    }

    @GetMapping(value = "/list")
    public List<DishDto> getAllDishes(){
        return dishService.findAllDish();
    }
}
