package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.PositionDto;

import java.util.List;

public interface PositionService {
    PositionDto savePosition(PositionDto positionDto);
    List<PositionDto>findAllPosition();
}
