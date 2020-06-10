package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Menu;
import lombok.Data;

@Data
public class DishDto {
    private long id;
    private String name;
    private boolean active;
    private float size;
    private String photo;
    private Menu menu;
}
