package com.construcao.software.formApi.dto;

import com.construcao.software.formApi.model.Pessoa;

public record PessoaDto(
        Long id,
        String nome,
        String email,
        String cpf
) {

    public Pessoa mapToEntity(){
        return Pessoa.builder()
                .id(this.id)
                .nome(this.nome)
                .cpf(this.cpf)
                .email(this.email)
                .build();
    }
}
