package dev.johanguse;

public class Exercicio6 {

    public static void main(String[] args) {
        int vezesCapeao = 0;

        switch (vezesCapeao) {
            case 0:
                System.out.println("Seu time não foi campeão!");
                break;
            case 1:
                System.out.println("Campeão");
                break;
            case 2:
                System.out.println("Bicampeão");
                break;
            case 3:
                System.out.println("Tricampeão");
                break;
            case 4:
                System.out.println("Tetracampeão");
                break;
            case 5:
                System.out.println("Pentacampeão");
                break;
            default:
                System.out.println("Número de vezes consecutivas inválido!");
                break;
        }
    }
}


