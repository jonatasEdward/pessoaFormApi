package com.construcao.software.formApi.service;

import com.construcao.software.formApi.dto.PessoaDto;
import com.construcao.software.formApi.exception.custom.PessoaNotFoundException;
import com.construcao.software.formApi.model.Pessoa;
import com.construcao.software.formApi.repostory.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public Pessoa findById(Long id) {
        return this.pessoaRepository.findById(id).orElseThrow(() -> new PessoaNotFoundException("Pessoa não encontrada!"));
    }

    public List<Pessoa> findAll() {
        return this.pessoaRepository.findAll();
    }

    public Pessoa save(PessoaDto pessoaDto) {
        return this.pessoaRepository.save(pessoaDto.mapToEntity());
    }

    public Pessoa update(PessoaDto pessoaDto) {
        if (Objects.isNull(pessoaDto.id())) return this.save(pessoaDto);
        return this.pessoaRepository.save(pessoaDto.mapToEntity());
    }

    public void delete(Long id){
        this.pessoaRepository.deleteById(id);
    }
}
