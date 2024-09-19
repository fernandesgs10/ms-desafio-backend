package br.com.desafio.backend.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeAccountEnum {

    CURRENT(1, "Current"),
    SAVE(2, "Save");

    private final Integer code;
    private final String desc;

}
