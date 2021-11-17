package br.com.zup.GerenciadordeContas.Services;

import br.com.zup.GerenciadordeContas.dtos.ContaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContaService {

    private List<ContaDTO> boletos = new ArrayList<>();

    public List<ContaDTO> pegarTodasAsContas(){
        return boletos;
    }

    public void salvarConta(ContaDTO contaDTO){
        boletos.add(contaDTO);
    }

    public ContaDTO buscarConta(String nomeDaConta){
        for (ContaDTO conta : boletos) {
            if (conta.getNome().equalsIgnoreCase(nomeDaConta)) {
                return conta;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public ContaDTO alterarConta(String nomeDaConta, ContaDTO contaDTO){
        ContaDTO conta = buscarConta(nomeDaConta);
        conta.setTipoDeConta(contaDTO.getTipoDeConta());

        return conta;
    }
}
