package dev.johanguse;
import java.util.Scanner;

public class AcessoCinema06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a classificação indicativa do filme: ");
        int classificacaoFilme = scanner.nextInt();

        if (idade >= 18 && idade >= classificacaoFilme) {
            System.out.println("Você pode entrar no cinema.");
        } else {
            System.out.println("Você não pode entrar no cinema.");
        }

        scanner.close();
    }
}
