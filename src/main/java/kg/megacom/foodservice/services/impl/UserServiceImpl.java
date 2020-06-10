package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.UserRepository;
import kg.megacom.foodservice.mappers.UserMapper;
import kg.megacom.foodservice.models.dto.UserDto;
import kg.megacom.foodservice.models.entity.User;
import kg.megacom.foodservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto saveUser(UserDto userDto) {

        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = userRepository.save(user);
        userDto = UserMapper.INSTANCE.userToUserDto(user);

        return userDto;
    }

    @Override
    public List<UserDto> findAllUser() {

        return userRepository.findAll()
                .stream()
                .map(UserMapper.INSTANCE::userToUserDto)
                .collect(Collectors.toList());
    }
}