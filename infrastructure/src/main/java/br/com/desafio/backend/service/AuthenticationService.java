package br.com.desafio.backend.service;

import br.com.desafio.backend.dto.UserDto;
import br.com.desafio.backend.entity.UserEntity;

import java.util.Optional;

public interface AuthenticationService {

    Optional<UserEntity> login(UserDto userDto);


    Optional<UserEntity> refreshToken(String token, String tokenBearer);




}
