package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.PriceDto;

import java.util.List;

public interface PriceService {
    PriceDto savePrice(PriceDto priceDto);
    List<PriceDto>findAllPrice();
}
