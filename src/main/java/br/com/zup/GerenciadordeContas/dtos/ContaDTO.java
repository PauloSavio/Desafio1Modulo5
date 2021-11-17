package br.com.zup.GerenciadordeContas.dtos;

import br.com.zup.GerenciadordeContas.Enums.TipoDeConta;

import java.time.LocalDate;

public class ContaDTO {

    private TipoDeConta tipoDeConta;
    private String nome;
    private double valor;
    private LocalDate dataDeVencimento;

    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(TipoDeConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
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

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public ContaDTO() {
    }
}
