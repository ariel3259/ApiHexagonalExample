package com.ariel.ApiHexagonalExample.Application.repository;

import com.ariel.ApiHexagonalExample.Domain.User;

public interface UsersRepository {
    User findById(Long id);
    User save(User user);
}
