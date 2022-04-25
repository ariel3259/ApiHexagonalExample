package com.ariel.ApiHexagonalExample.Infrastructure.rest.spring.mapper;

import com.ariel.ApiHexagonalExample.Domain.User;
import com.ariel.ApiHexagonalExample.Infrastructure.rest.spring.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toDomain(UserDto userDto);
}
