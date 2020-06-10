package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);
    List<UserDto> findAllUser();
}
