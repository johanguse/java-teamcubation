package dev.johanguse;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        int numero;

        System.out.println("Digite um número e aperte enter para prosseguir.\nDigite zero para parar\nNúmero: ");
        while ((numero = scanner.nextInt()) != 0) {
            soma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}