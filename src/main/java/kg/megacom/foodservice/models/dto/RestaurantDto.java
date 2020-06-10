package kg.megacom.foodservice.models.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class RestaurantDto {
    private Long id;
    private String name;
    private boolean active;
}
