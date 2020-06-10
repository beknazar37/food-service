package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Dish;
import lombok.Data;

import java.util.List;
@Data
public class OrderDetailsDto {
    private Long id;
    private List<Dish> dishes;
    private int amount;
}
