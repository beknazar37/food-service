package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.PhoneDto;
import kg.megacom.foodservice.models.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PhoneMapper {
    PhoneMapper INSTANCE= Mappers.getMapper(PhoneMapper.class);

    Phone phoneDtoToPhone(PhoneDto phoneDto);
    PhoneDto phoneToPhoneDto(Phone phone);

    List<Phone> phoneDtoToPhones(List<PhoneDto> phoneDtos);
    List<PhoneDto> phonesToPhoneDtos(List<Phone> phones);
}
