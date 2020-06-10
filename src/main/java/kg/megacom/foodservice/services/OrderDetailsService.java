package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.OrderDetailsDto;

import java.util.List;

public interface OrderDetailsService {
    OrderDetailsDto saveOrderDetails(OrderDetailsDto orderDetailsDto);
    List<OrderDetailsDto>findAllOrderDetails();
}
