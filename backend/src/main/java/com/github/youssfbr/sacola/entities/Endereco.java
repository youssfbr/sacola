package com.github.youssfbr.sacola.entities;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String cep;
    private String complemento;

}
