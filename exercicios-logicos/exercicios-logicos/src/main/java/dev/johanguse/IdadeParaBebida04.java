package dev.johanguse;
import java.util.Scanner;

public class IdadeParaBebida04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode tomar um gole.");
        } else {
            System.out.println("Você não pode beber!.");
        }

        scanner.close();
    }
}