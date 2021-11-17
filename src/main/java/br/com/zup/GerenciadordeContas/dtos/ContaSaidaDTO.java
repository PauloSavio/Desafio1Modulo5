package br.com.zup.GerenciadordeContas.dtos;

import br.com.zup.GerenciadordeContas.Enums.StatusDaConta;
import br.com.zup.GerenciadordeContas.Enums.TipoDeConta;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaSaidaDTO {

    private Long id;
    private String nome;
    private double valor;
    private TipoDeConta tipoDeConta;
    private LocalDate dataDeVencimento;
    private LocalDateTime dataDePagamento;
    private StatusDaConta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(TipoDeConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public LocalDateTime getDataDePagamento() {
        return dataDePagamento;
    }

    public void setDataDePagamento(LocalDateTime dataDePagamento) {
        this.dataDePagamento = dataDePagamento;
    }

    public ContaSaidaDTO() {
    }
}
