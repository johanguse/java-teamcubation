package dev.johanguse;

public class Exercicio7 {

    public static void main(String[] args) {
        int penaltis = 3;
        int expulsoes = 2;
        int consultasVAR = 7;

        if (penaltis > 2 && expulsoes >= 1 && consultasVAR > 3) {
            System.out.println("O jogo é suspeito de manipulação.");
        } else {
            System.out.println("O jogo não é suspeito de manipulação.");
        }
    }
}

