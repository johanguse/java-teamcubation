package dev.johanguse;

public class OrdenarNomes03 {

    public static void main(String[] args) {
        String[] nomes = {"Ziraldo", "Ana", "Bruna", "Beto", "Fernando", "Johan", "Leopoldo", "Leonardo"};

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
                    String temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }

        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

