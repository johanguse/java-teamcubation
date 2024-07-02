package dev.johanguse;
import java.util.*;

public class NomesRepetidos05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        Set<String> nomesRepetidos = new HashSet<>();
        Set<String> nomesUnicos = new HashSet<>();

        System.out.println("Digite os nomes (digite 'fim' para encerrar):");
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            if (!nomes.add(nome)) {
                nomesRepetidos.add(nome);
            }
        }

        System.out.println("Nomes repetidos:");
        for (String nome : nomesRepetidos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}

