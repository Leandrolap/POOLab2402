package br.newtonpaiva.dominio;

import java.util.Objects;

public class conta {
    private Integer numero;
    private Double saldo;

    public conta(Integer numero)
    {
        this(numero, 0.0);
    }

    public conta(){
        this(null);
    }

    public conta(Integer numero, Double saldo)
    {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar(Double valor){
        return 0.0;
    }

    public Double depositar(Double valor){
        if(valor == null || valor <= 0)
            throw new IllegalArgumentException("Valor incorreto");

        saldo += valor;
        return valor;
    }

    public Integer getNumero(){

        return numero;
    }

    public void setNumero(Integer numero){

        this.numero = numero;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){

        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        conta conta = (conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
