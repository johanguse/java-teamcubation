package dev.johanguse;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite um número e aperte enter para prosseguir" +
                ".\n(para parar digite um número negativo)\nNúmero: ");
        while ((numero = scanner.nextInt()) >= 0) {
            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);
        scanner.close();
    }
}
