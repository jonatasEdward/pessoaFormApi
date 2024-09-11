package com.construcao.software.formApi.controller;


import com.construcao.software.formApi.dto.PessoaDto;
import com.construcao.software.formApi.model.Pessoa;
import com.construcao.software.formApi.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoa")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PessoaController {

    private final PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> findAll() {
        return this.pessoaService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Pessoa findById(@PathVariable Long id) {
        return this.pessoaService.findById(id);
    }

    @PostMapping
    public Pessoa save(@RequestBody PessoaDto pessoaDto) {
        return this.pessoaService.save(pessoaDto);
    }

    @PutMapping
    public Pessoa update(@RequestBody PessoaDto pessoaDto) {
        return this.pessoaService.update(pessoaDto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(Long id){
        this.pessoaService.delete(id);
    }
}
