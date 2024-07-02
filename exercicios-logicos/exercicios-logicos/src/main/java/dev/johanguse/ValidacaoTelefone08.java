package dev.johanguse;
import java.util.Scanner;

public class ValidacaoTelefone08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de telefone com DDD\nExemplo: 1189752654\n");
        String telefone = scanner.next();

        if (telefone.length() == 10) {
            String ddd = telefone.substring(0, 2);

            try {
                int dddNumero = Integer.parseInt(ddd);

                if (dddNumero >= 11) {
                    System.out.println("Número de telefone válido.");
                } else {
                    System.out.println("Número de telefone inválido: DDD deve ser maior que 11.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Número de telefone inválido: DDD não é um número válido.");
            }
        } else {
            System.out.println("Número de telefone inválido: Deve ter 10 dígitos.");
        }

        scanner.close();
    }
}