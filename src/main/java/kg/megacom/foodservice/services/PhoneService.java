package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.PhoneDto;

import java.util.List;

public interface PhoneService {
    PhoneDto savePhone(PhoneDto phoneDto);
    List<PhoneDto>findAllPhone();
}
