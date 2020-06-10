package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.OrderDetailsDto;
import kg.megacom.foodservice.models.entity.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    OrderDetailsMapper INSTANCE= Mappers.getMapper(OrderDetailsMapper.class);

    OrderDetails orderDetailsDtoToOrderDetails(OrderDetailsDto orderDetailsDto);
    OrderDetailsDto orderDetailsToOrderDetailsDto(OrderDetails orderDetails);

    List<OrderDetails> orderDetailsToOrderDetailsDtos(List<OrderDetailsDto> orderDetailsDtos);
    List<OrderDetailsDto> orderDetailsDtoToOrderDetails(List<OrderDetails> orderDetails);
}
