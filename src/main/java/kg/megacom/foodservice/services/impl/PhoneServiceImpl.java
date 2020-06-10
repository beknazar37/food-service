package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.PhoneRepository;
import kg.megacom.foodservice.mappers.PhoneMapper;
import kg.megacom.foodservice.models.dto.PhoneDto;
import kg.megacom.foodservice.models.entity.Phone;
import kg.megacom.foodservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    @Override
    public PhoneDto savePhone(PhoneDto phoneDto) {

        Phone phone = PhoneMapper.INSTANCE.phoneDtoToPhone(phoneDto);
        phone = phoneRepository.save(phone);
        phoneDto = PhoneMapper.INSTANCE.phoneToPhoneDto(phone);

        return phoneDto;
    }

    @Override
    public List<PhoneDto> findAllPhone() {

        return phoneRepository.findAll()
                .stream()
                .map(PhoneMapper.INSTANCE::phoneToPhoneDto)
                .collect(Collectors.toList());
    }
}