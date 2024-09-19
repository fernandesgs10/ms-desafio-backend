package br.com.desafio.backend.mapper;

import br.com.desafio.backend.dto.AccountPaymentDto;
import br.com.desafio.backend.dto.UserDto;
import br.com.desafio.backend.entity.AccountPaymentEntity;
import br.com.desafio.backend.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@Builder
@Component
@AllArgsConstructor
public class AccountPaymentMapper implements Serializable {

    protected final ModelMapper modelMapper;

    public AccountPaymentEntity converterDtoObjectToEntity(AccountPaymentDto accountPaymentDto) {
        return modelMapper.map(accountPaymentDto, AccountPaymentEntity.class);
    }

    public AccountPaymentEntity converterDtoObjectToMongo(AccountPaymentDto accountPaymentDto) {
        return modelMapper.map(accountPaymentDto, AccountPaymentEntity.class);
    }

    public AccountPaymentDto converterEntityObjectToDto(AccountPaymentEntity accountPaymentEntity) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(accountPaymentEntity, AccountPaymentDto.class);
    }
}