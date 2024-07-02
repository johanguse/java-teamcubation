package dev.johanguse;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean isPrime = true;
        if (numero < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
