package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.conta;

public class Main {
    public static void main(String[] args) {
        var c = new conta(10);
        c.setNumero(10);
        c.setSaldo(100.0);
        c.depositar(50.0);

        conta c2 = new conta(10);
        c2.setNumero(90);
        c2.setSaldo(500.0);

        if (c.equals(c2)) {
            System.out.println("Mesma Conta");
        } else {
            System.out.println("Contas a pagar");
        }

        System.out.println(c.getSaldo());
    }
}