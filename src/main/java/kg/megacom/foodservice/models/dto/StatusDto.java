package kg.megacom.foodservice.models.dto;

import lombok.Data;

@Data
public class StatusDto {
    private Long id;
    private String name;
    private boolean isActive;
}
