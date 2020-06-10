package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.OrderHistoryDto;
import kg.megacom.foodservice.models.entity.OrderHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderHistoryMapper {
    OrderHistoryMapper INSTANCE= Mappers.getMapper(OrderHistoryMapper.class);

    OrderHistory orderHistoryDtoToOrderHistory(OrderHistoryDto orderHistoryDto);
    OrderHistoryDto orderHistoryToOrderHistoryDto(OrderHistory orderHistory);

    List<OrderHistory> orderHistoryDtoToOrderHistories(List<OrderHistoryDto> orderHistoryDtos);
    List<OrderHistoryDto> orderHistoryToOrderHistoryDtos(List<OrderHistory> orderHistories);
}
