package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.OrderRepository;
import kg.megacom.foodservice.mappers.OrderMapper;
import kg.megacom.foodservice.models.dto.OrderDto;
import kg.megacom.foodservice.models.entity.Order;
import kg.megacom.foodservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public OrderDto saveOrder(OrderDto orderDto) {

        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepository.save(order);
        orderDto = OrderMapper.INSTANCE.orderToOrderDto(order);

        return orderDto;

    }

    @Override
    public List<OrderDto> findAllOrder() {

        return orderRepository.findAll()
                .stream()
                .map(OrderMapper.INSTANCE::orderToOrderDto)
                .collect(Collectors.toList());
    }
}