package dev.johanguse;
import java.util.Scanner;

public class ContarPositivosNegativos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir? ");
        int quantidade = scanner.nextInt();

        int[] numeros = new int[quantidade];

        System.out.println("Digite os números: ");
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }

        int countPositivos = 0;
        int countNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                countPositivos++;
            } else if (numeros[i] < 0) {
                countNegativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + countPositivos);
        System.out.println("Quantidade de números negativos: " + countNegativos);

        scanner.close();
    }
}
