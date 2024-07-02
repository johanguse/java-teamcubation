package dev.johanguse;
import java.util.Scanner;

public class VerificacaoMaiuscula07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("A letra é maiúscula.");
        } else {
            System.out.println("A letra não é maiúscula.");
        }

        scanner.close();
    }
}

