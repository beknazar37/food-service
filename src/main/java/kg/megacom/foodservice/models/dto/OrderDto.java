package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Customer;
import lombok.Data;

import java.util.Date;
@Data
public class OrderDto {
    private Long id;
    private Date orderDate;
    private double cost;
    private Customer customer;
}
