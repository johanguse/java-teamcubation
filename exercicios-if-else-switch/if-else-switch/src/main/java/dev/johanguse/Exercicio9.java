package dev.johanguse;

public class Exercicio9 {

    public static void main(String[] args) {
        int jogosSeguidos = 5;
        boolean adversarioInferior = true;
        boolean jogoClassificatorio = true;

        if (jogosSeguidos >= 5 && (adversarioInferior || jogoClassificatorio)) {
            System.out.println("O técnico deveria poupar o jogador para o próximo jogo.");
        } else {
            System.out.println("O jogador não precisa ser poupado para o próximo jogo.");
        }
    }
}
