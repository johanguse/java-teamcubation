package dev.johanguse;
import java.util.HashMap;
import java.util.Map;

public class ValoresRepetidos04 {

    public static void main(String[] args) {
        int[] numeros = {22, 6, 4, 3, 5, 6, 7, 0, 9, 22, 22, 14, 146, 67, 11, 14};
        Map<Integer, Integer> contador = new HashMap<>();

        for (int numero : numeros) {
            contador.put(numero, contador.getOrDefault(numero, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            int numero = entry.getKey();
            int quantidade = entry.getValue();
            if (quantidade > 1) {
                System.out.println("Número " + numero + " aparece " + quantidade + " vezes.");
            }
        }
    }
}