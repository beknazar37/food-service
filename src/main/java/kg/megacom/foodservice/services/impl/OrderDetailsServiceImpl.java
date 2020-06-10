package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.OrderDetailsRepository;
import kg.megacom.foodservice.mappers.OrderDetailsMapper;
import kg.megacom.foodservice.models.dto.OrderDetailsDto;
import kg.megacom.foodservice.models.entity.OrderDetails;
import kg.megacom.foodservice.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetailsDto saveOrderDetails(OrderDetailsDto orderDetailsDto) {

       OrderDetails  orderDetails = OrderDetailsMapper.INSTANCE.orderDetailsDtoToOrderDetails(orderDetailsDto);
        orderDetails = orderDetailsRepository.save(orderDetails);
        orderDetailsDto = OrderDetailsMapper.INSTANCE.orderDetailsToOrderDetailsDto(orderDetails);

        return orderDetailsDto;
    }

    @Override
    public List<OrderDetailsDto> findAllOrderDetails() {
        return orderDetailsRepository.findAll()
                .stream()
                .map(OrderDetailsMapper.INSTANCE::orderDetailsToOrderDetailsDto)
                .collect(Collectors.toList());
    }
}