package com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.mapper;

import com.ariel.ApiHexagonalExample.Domain.User;
import com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.dbo.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    User toDomain(UserEntity userEntity);
    UserEntity toDbo(User user);
}

