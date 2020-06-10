package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.MenuDto;
import kg.megacom.foodservice.models.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MenuMapper {
    MenuMapper INSTANCE= Mappers.getMapper(MenuMapper.class);

    Menu menuDtoToMenu(MenuDto menuDto);
    MenuDto menuToMenuDto(Menu menu);

    List<Menu> menuDtoToMenus(List<MenuDto> menuDto);
    List<MenuDto> menuToMenuDtos(List<Menu> menu);
}
