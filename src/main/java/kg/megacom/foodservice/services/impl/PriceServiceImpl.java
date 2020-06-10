package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.PriceRepository;
import kg.megacom.foodservice.mappers.PriceMapper;
import kg.megacom.foodservice.models.dto.PriceDto;
import kg.megacom.foodservice.models.entity.Price;
import kg.megacom.foodservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceRepository priceRepository;

    @Override
    public PriceDto savePrice(PriceDto priceDto) {

        Price price = PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        price = priceRepository.save(price);
        priceDto = PriceMapper.INSTANCE.priceToPriceDto(price);

        return priceDto;
    }

    @Override
    public List<PriceDto> findAllPrice() {

        return priceRepository.findAll()
                .stream()
                .map(PriceMapper.INSTANCE::priceToPriceDto)
                .collect(Collectors.toList());
    }
}