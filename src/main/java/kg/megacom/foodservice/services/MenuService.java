package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.MenuDto;

import java.util.List;

public interface MenuService {
    MenuDto saveMenu(MenuDto menuDto);
    List<MenuDto> findAllMenu();
}
