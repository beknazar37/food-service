package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.OrderHistoryDto;

import java.util.List;

public interface OrderHistoryService {
    OrderHistoryDto saveOrderHistory(OrderHistoryDto orderHistoryDto);
    List<OrderHistoryDto>findAllOrderHistory();
}
