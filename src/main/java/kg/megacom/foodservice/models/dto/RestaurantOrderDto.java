package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Order;
import kg.megacom.foodservice.models.entity.Restaurant;
import lombok.Data;

import java.util.Date;
@Data
public class RestaurantOrderDto {
    private Long Id;
    private Restaurant restaurant;
    private Order order;
    private boolean isReady;
    private Date startDate;
    private Date endDate;

}
