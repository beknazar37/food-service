package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Dish;
import lombok.Data;

import java.util.Date;
@Data
public class PriceDto {
    private Long id;
    private Date startDate;
    private Date endDate;
    private double price;
    private Dish dish;
}
