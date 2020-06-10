package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.Account;
import kg.megacom.foodservice.models.entity.Phone;
import kg.megacom.foodservice.models.entity.Position;
import lombok.Data;

import java.util.List;
@Data
public class UserDto {
    private Long id;
    private Account accaunt;
    private String name;
    private boolean active;
    private Position position;
    private List<Phone> phones;


}
