package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto saveOrder(OrderDto orderDto);
    List<OrderDto>findAllOrder();
}
