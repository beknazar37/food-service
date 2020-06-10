package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.UserDto;
import kg.megacom.foodservice.models.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);

    List<User> userDtoToUsers(List<UserDto> userDtos);
    List<UserDto> userToUserDtos(List<User> users);
}
