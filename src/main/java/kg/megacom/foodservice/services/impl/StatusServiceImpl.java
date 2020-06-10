package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.StatusRepository;
import kg.megacom.foodservice.mappers.StatusMapper;
import kg.megacom.foodservice.models.dto.StatusDto;
import kg.megacom.foodservice.models.entity.Status;
import kg.megacom.foodservice.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusRepository statusRepository;

    @Override
    public StatusDto saveStatus(StatusDto statusDto) {

        Status status = StatusMapper.INSTANCE.statusDtoToStatus(statusDto);
        status = statusRepository.save(status);
        statusDto = StatusMapper.INSTANCE.statusToStatusDto(status);

        return statusDto;
    }

    @Override
    public List<StatusDto> findAllStatus() {

        return statusRepository.findAll()
                .stream()
                .map(StatusMapper.INSTANCE::statusToStatusDto)
                .collect(Collectors.toList());
    }
}