package com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.repository;

import com.ariel.ApiHexagonalExample.Application.repository.UsersRepository;
import com.ariel.ApiHexagonalExample.Domain.User;
import com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.dbo.UserEntity;
import com.ariel.ApiHexagonalExample.Infrastructure.db.springdata.mapper.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDboRepository implements UsersRepository {

    private final SpringDataUserRepository userRepository;
    private final UserEntityMapper userMapper;

    @Override
    public User findById(Long id) {
        UserEntity userFind = userRepository.findById(id).orElseThrow();
        return userMapper.toDomain(userFind);
    }

    @Override
    public User save(User user) {
        User userSaved = userMapper.toDomain(userRepository.save(userMapper.toDbo(user)));
        return userSaved;
    }
}
