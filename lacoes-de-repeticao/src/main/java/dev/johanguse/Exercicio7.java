package dev.johanguse;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Os divisores de " + numero + " são:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

