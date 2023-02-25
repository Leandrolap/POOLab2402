package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.conta;

public class Main {
    public static void main(String[] args) {
        var c = new conta();
        c.setNumero(10);
        c.setSaldo(100.0);
        c.depositar(50.0);

        System.out.println(c.getSaldo());
    }
}