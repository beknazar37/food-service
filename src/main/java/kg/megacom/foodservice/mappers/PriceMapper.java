package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.PriceDto;
import kg.megacom.foodservice.models.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE= Mappers.getMapper(PriceMapper.class);

    Price priceDtoToPrice(PriceDto priceDto);
    PriceDto priceToPriceDto(Price price);

    List<Price> pricesDtoToPrices(List<PriceDto> priceDtos);
    List<PriceDto> priceToPriceDtos(List<Price> prices);

}
