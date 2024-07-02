package dev.johanguse;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        int contador = 0;
        int numero;

        System.out.println("Digite um número e aperte enter para prosseguir.\nDigite um número repetido para parar\nNúmero: ");
        while (true) {
            numero = scanner.nextInt();
            if (!numeros.add(numero)) {
                break;
            }
            contador++;
        }

        System.out.println("Quantidade de números lidos antes do repetido é: " + contador);
        scanner.close();
    }
}
