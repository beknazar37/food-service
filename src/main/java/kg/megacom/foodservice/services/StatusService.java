package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.StatusDto;

import java.util.List;

public interface StatusService {
    StatusDto saveStatus(StatusDto statusDto);
    List<StatusDto>findAllStatus();

}
