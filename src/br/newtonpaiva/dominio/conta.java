package br.newtonpaiva.dominio;

public class conta {
    private Integer numero;
    private Double saldo;

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
}
