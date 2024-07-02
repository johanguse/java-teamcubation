package dev.johanguse;
import java.util.Scanner;

public class BonusSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite o número de anos de serviço do funcionário: ");
        int anosServico = scanner.nextInt();

        double bonus;
        if (anosServico > 5) {
            bonus = salarioBase * 0.05;
        } else {
            bonus = salarioBase * 0.02;
        }

        System.out.println("O bônus salarial do funcionário é: R$ " + bonus);

        scanner.close();
    }
}

