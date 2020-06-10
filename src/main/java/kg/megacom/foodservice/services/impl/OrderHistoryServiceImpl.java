package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.OrderHistoryRepository;
import kg.megacom.foodservice.mappers.OrderHistoryMapper;
import kg.megacom.foodservice.mappers.OrderMapper;
import kg.megacom.foodservice.models.dto.OrderDto;
import kg.megacom.foodservice.models.dto.OrderHistoryDto;
import kg.megacom.foodservice.models.entity.OrderHistory;
import kg.megacom.foodservice.services.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    OrderHistoryRepository orderHistoryRepository;

    @Override
    public OrderHistoryDto saveOrderHistory(OrderHistoryDto orderHistoryDto) {

        OrderHistory orderHistory = OrderHistoryMapper.INSTANCE.orderHistoryDtoToOrderHistory(orderHistoryDto);
        orderHistory = orderHistoryRepository.save(orderHistory);
        orderHistoryDto = OrderHistoryMapper.INSTANCE.orderHistoryToOrderHistoryDto(orderHistory);

        return orderHistoryDto;

    }

    @Override
    public List<OrderHistoryDto> findAllOrderHistory() {

        return orderHistoryRepository.findAll()
                .stream()
                .map(OrderHistoryMapper.INSTANCE::orderHistoryToOrderHistoryDto)
                .collect(Collectors.toList());
    }
}