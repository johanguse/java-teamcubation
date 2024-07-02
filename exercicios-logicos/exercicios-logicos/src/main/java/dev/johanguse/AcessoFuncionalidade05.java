package dev.johanguse;
import java.util.Scanner;

public class AcessoFuncionalidade05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você é administrador?\nDigite apenas 'sim' ou 'não'\n");
        String isAdmin = scanner.next();

        if (idade >= 18 && isAdmin.equalsIgnoreCase("sim")) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}