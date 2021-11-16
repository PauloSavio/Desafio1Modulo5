package br.com.zup.GerenciadordeContas.controllers;

import br.com.zup.GerenciadordeContas.dtos.ContaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {
    private List<ContaDTO> boletos = new ArrayList<>();

    @GetMapping
    public List<ContaDTO> exibirContas(){
        return boletos;
    }

    @PostMapping
    public void cadastrarConta(@RequestBody ContaDTO contaDTO){

    }
}
