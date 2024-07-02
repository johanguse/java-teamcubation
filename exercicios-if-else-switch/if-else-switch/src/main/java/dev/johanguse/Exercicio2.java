package dev.johanguse;

public class Exercicio2 {

    public static void main(String[] args) {
        int numeroCamisa = 11;

        if (numeroCamisa == 1) {
            System.out.println("Posição: Goleiro");
        } else if (numeroCamisa >= 2 && numeroCamisa <= 5) {
            System.out.println("Posição: Defensor");
        } else if (numeroCamisa == 6 || numeroCamisa == 7 || numeroCamisa == 8 || numeroCamisa == 10) {
            System.out.println("Posição: Meio-campo");
        } else if (numeroCamisa == 9 || numeroCamisa == 11) {
            System.out.println("Posição: Atacante");
        } else {
            System.out.println("Número de camisa inválido!");
        }
    }
}

