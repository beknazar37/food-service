package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Restaurant;
import lombok.Data;
@Data
public class MenuDto {
    private Long id;
    private Restaurant restaurant;
    private Data dateCreate;
}
