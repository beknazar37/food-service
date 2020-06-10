package kg.megacom.foodservice.mappers;


import kg.megacom.foodservice.models.dto.StatusDto;
import kg.megacom.foodservice.models.entity.Status;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusMapper {
    StatusMapper INSTANCE= Mappers.getMapper(StatusMapper.class);


    Status statusDtoToStatus(StatusDto statusDto);
    StatusDto statusToStatusDto(Status status);

    List<Status> statusDtoToStatuses(List<StatusDto> statusDtos);
    List<StatusDto> statusToStatusDto(List<Status> statuses);
}
