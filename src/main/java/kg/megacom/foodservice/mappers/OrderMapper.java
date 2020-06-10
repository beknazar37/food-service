package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.OrderDto;
import kg.megacom.foodservice.models.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderDtoToOrder(OrderDto orderDto);

    OrderDto orderToOrderDto(Order order);
}
