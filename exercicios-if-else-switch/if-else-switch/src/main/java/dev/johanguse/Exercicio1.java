package dev.johanguse;

public class Exercicio1 {

    public static void main(String[] args) {
        int golsTimeA = 2;
        int golsTimeB = 6;

        if (golsTimeA > golsTimeB) {
            System.out.println("Time A venceu com " + golsTimeA + " gols!");
        } else if (golsTimeB > golsTimeA) {
            System.out.println("Time B venceu com " + golsTimeB + " gols!");
        } else {
            System.out.println("Empate!");
            System.out.println("Time A " + golsTimeA + " gols VS Time B " + golsTimeB + " gols!");
        }
    }
}
