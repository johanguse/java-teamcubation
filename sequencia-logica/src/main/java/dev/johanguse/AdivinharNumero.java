package dev.johanguse;
import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativa++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você adivinhou em " + tentativa + " tentativas.");
                break;
            }
        }

        scanner.close();
    }
}

