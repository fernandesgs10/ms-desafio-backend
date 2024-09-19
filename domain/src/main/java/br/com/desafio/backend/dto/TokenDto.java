package br.com.desafio.backend.dto;

import lombok.Data;

@Data
public class TokenDto {

    private String token;

    private String expiresIn;

    public String getToken() {
        return token;
    }

}