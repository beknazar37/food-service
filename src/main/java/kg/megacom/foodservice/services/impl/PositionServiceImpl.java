package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.PositionRepository;
import kg.megacom.foodservice.mappers.PositionMapper;
import kg.megacom.foodservice.models.dto.PositionDto;
import kg.megacom.foodservice.models.entity.Position;
import kg.megacom.foodservice.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionRepository positionRepository;

    @Override
    public PositionDto savePosition(PositionDto positionDto) {

        Position position = PositionMapper.INSTANCE.positionDtoToPosition(positionDto);
        position = positionRepository.save(position);
        positionDto = PositionMapper.INSTANCE.positionToPositionDto(position);

        return positionDto;
    }

    @Override
    public List<PositionDto> findAllPosition() {

        return positionRepository.findAll()
                .stream()
                .map(PositionMapper.INSTANCE::positionToPositionDto)
                .collect(Collectors.toList());
    }
}