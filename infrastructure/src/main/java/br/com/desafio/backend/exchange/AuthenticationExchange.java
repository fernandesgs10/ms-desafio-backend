package br.com.desafio.backend.exchange;

import br.com.desafio.backend.dto.UserDto;
import br.com.desafio.backend.entity.UserEntity;

import java.util.Optional;

public interface AuthenticationExchange {

    Optional<UserEntity> login(UserDto userDto);

    Optional<UserEntity> refreshToken(Object[] obj);




}
