package com.ariel.ApiHexagonalExample.Infrastructure.rest.spring.resources;

import com.ariel.ApiHexagonalExample.Application.service.UsersServices;
import com.ariel.ApiHexagonalExample.Infrastructure.rest.spring.dto.UserDto;
import com.ariel.ApiHexagonalExample.Infrastructure.rest.spring.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserResources {

    private final UsersServices us;
    private final UserMapper um;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long id){
        return ResponseEntity.status(200).body(um.toDto(us.getUser(id)));
    }

    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto ud){
        return ResponseEntity.status(200).body(um.toDto(us.saveUser(um.toDomain(ud))));
    }
}
