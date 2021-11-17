package br.com.zup.GerenciadordeContas.controllers;

import br.com.zup.GerenciadordeContas.Services.ContaService;
import br.com.zup.GerenciadordeContas.dtos.ContaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;


    @GetMapping
    public List<ContaDTO> exibirContas() {
        return contaService.pegarTodasAsContas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarConta(@RequestBody ContaDTO contaDTO) {
        contaService.salvarConta(contaDTO);
    }

    @GetMapping("/{nomeDaConta}")
    public ContaDTO exibirContaPorNome(@PathVariable String nomeDaConta) {
        return contaService.buscarConta(String nomeDaConta);
    }

    @PutMapping("/{nomeDaConta}")
    public ContaDTO atualizarConta(PathVariable String nomeDaConta, @RequestBody ContaDTO contaDTO) {
        return contaService.alterarConta(nomeDaConta, contaDTO);
    }
}
