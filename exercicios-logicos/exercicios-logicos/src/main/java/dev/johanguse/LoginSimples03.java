package dev.johanguse;
import java.util.Scanner;

public class LoginSimples03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String username = scanner.next();

        System.out.print("Digite a senha: ");
        String password = scanner.next();

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Login feito com sucesso!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }

        scanner.close();
    }
}