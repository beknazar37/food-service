package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.MenuDto;
import kg.megacom.foodservice.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping(value = "/save")
    public MenuDto saveMenu(@RequestBody MenuDto menuDto){

        return menuService.saveMenu(menuDto);
    }

    @GetMapping(value = "/list")
    public List<MenuDto> getAllMenu(){

        return menuService.findAllMenu();
    }
}
