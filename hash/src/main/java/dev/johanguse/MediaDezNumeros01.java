package dev.johanguse;

import java.text.DecimalFormat;

public class MediaDezNumeros01 {

    public static void main(String[] args) {
        int[] numeros = {18, 2, 5, 20, 10, 6, 18, 15, 3, 12, 87, 16};
        int totalDeNumeros = numeros.length;
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;
        DecimalFormat formato = new DecimalFormat("#.##");
        media = Double.valueOf(formato.format(media));

        System.out.println("A média arredondada dos " + totalDeNumeros + " números é: " + media);
    }
}
