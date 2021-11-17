package br.com.zup.GerenciadordeContas.controllers;

import br.com.zup.GerenciadordeContas.dtos.ContaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {
    private List<ContaDTO> boletos = new ArrayList<>();

    @GetMapping
    public List<ContaDTO> exibirContas() {
        return boletos;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarConta(@RequestBody ContaDTO contaDTO) {
        boletos.add(contaDTO);
    }

    @GetMapping("/(idDaConta)")
    public ContaDTO exibirContaPorNome(@PathVariable String nomeDaConta) {
        for (ContaDTO conta : boletos) {
            if (conta.getNome().equalsIgnoreCase(nomeDaConta)) {
                return conta;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
