package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.enums.OrderStatus;
import kg.megacom.foodservice.models.entity.Order;
import kg.megacom.foodservice.models.entity.User;
import lombok.Data;

import java.util.Date;
@Data
public class OrderHistoryDto {
    private Long id;
    private Date startDate;
    private Date endDate;
    private User user;
    private Order order;
    private OrderStatus orderStatus;
}
