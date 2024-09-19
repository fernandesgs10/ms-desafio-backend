package br.com.desafio.backend.infrastructure;

import br.com.desafio.backend.Utils.EncryptionPwUtil;
import br.com.desafio.backend.dto.UserDto;
import br.com.desafio.backend.entity.UserEntity;
import br.com.desafio.backend.exchange.AuthenticationExchange;
import br.com.desafio.backend.repository.AuthenticationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@SuppressWarnings("rawtypes")
@Service
@AllArgsConstructor
public class AuthenticationExchangeImpl implements AuthenticationExchange {

    private final AuthenticationRepository authenticationRepository;

    @Override
    public Optional<UserEntity> login(UserDto userDto) {
        String encryptPassword = EncryptionPwUtil.encrypt(userDto.getPassword());
        Optional<UserEntity> userMongo = authenticationRepository.findByEmailAndPassword(userDto.getEmail(), encryptPassword);
        return userMongo;
    }

    //TODO....
    @Override
    public Optional<UserEntity> refreshToken(Object[] obj) {
        return null;
    }

}
