package com.ariel.ApiHexagonalExample.Application.service;

import com.ariel.ApiHexagonalExample.Application.repository.UsersRepository;
import com.ariel.ApiHexagonalExample.Domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class UsersServices {

    private final UsersRepository usersRepository;

    public User getUser(Long id){
        return usersRepository.findById(id);
    }

    public User saveUser(User user){

        return usersRepository.save(user);

    }
}
