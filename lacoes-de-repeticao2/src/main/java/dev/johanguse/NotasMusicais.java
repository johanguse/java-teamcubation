package dev.johanguse;
import java.util.Scanner;

public class NotasMusicais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota musical (A, B, C, D, E ou F): ");
        char nota = scanner.next().charAt(0);
        nota = Character.toUpperCase(nota);

        String traducao = switch (nota) {
            case 'A' -> "Dó";
            case 'B' -> "Ré";
            case 'C' -> "Mi";
            case 'D' -> "Fá";
            case 'E' -> "Sol";
            case 'F' -> "Lá";
            default -> "Nota inválida";
        };

        System.out.println("A tradução da nota musical " + nota + " é: " + traducao);

        scanner.close();
    }
}

