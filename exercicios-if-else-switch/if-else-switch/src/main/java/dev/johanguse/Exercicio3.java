package dev.johanguse;

public class Exercicio3 {

    public static void main(String[] args) {
        int golsFeitos = 10;
        int golsSofridos = 6;

        int saldoGols = golsFeitos - golsSofridos;

        if (saldoGols > 0) {
            System.out.println("Saldo de gols positivo.");
        } else if (saldoGols < 0) {
            System.out.println("Saldo de gols negativo.");
        } else {
            System.out.println("Saldo de gols neutro.");
        }
    }
}

