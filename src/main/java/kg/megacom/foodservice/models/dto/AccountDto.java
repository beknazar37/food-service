package kg.megacom.foodservice.models.dto;

import kg.megacom.foodservice.models.entity.User;
import lombok.Data;
@Data
public class AccountDto {
    private Long id;
    private User user;
    private String login;
    private String password;

}
