package dev.johanguse;

public class MaiorMenorAltura02 {

    public static void main(String[] args) {
        float[] alturas = {2.87F, 6.87F, 1.75f, 1.25f, 1.00f, 1.70f, 1.98f};
        float maiorAltura = alturas[0];
        float menorAltura = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        System.out.println("A maior altura é: " + maiorAltura);
        System.out.println("A menor altura é: " + menorAltura);
    }
}
