package kg.megacom.foodservice.mappers;


import kg.megacom.foodservice.models.dto.PositionDto;
import kg.megacom.foodservice.models.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PositionMapper {

    PositionMapper INSTANCE= Mappers.getMapper(PositionMapper.class);

    Position positionDtoToPosition(PositionDto positionDto);
    PositionDto positionToPositionDto(Position position);

    List<Position> positionDtoToPositions(List<PositionDto> positionsDtos);
    List<PositionDto> positionToPositionDtos(List<Position> positions);
}
