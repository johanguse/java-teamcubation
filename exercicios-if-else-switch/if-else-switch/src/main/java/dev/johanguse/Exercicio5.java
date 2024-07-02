package dev.johanguse;

public class Exercicio5 {

    public enum Desempenho {
        FINAIS,
        SEMIFINAIS,
        QUARTAS,
        DESCLASSIFICADO
    }

    public static void main(String[] args) {
        String[] times = {"Grêmio", "Internacional", "Juventude", "Palmeiras", "São Paulo", "Flamengo"};

        Desempenho desempenhoGremio = Desempenho.FINAIS;
        Desempenho desempenhoInternacional = Desempenho.SEMIFINAIS;
        Desempenho desempenhoJuventude = Desempenho.QUARTAS;
        Desempenho desempenhoPalmeiras = Desempenho.DESCLASSIFICADO;
        Desempenho desempenhoSaoPaulo = Desempenho.FINAIS;
        Desempenho desempenhoFlamengo = Desempenho.SEMIFINAIS;

        System.out.println(times[0] + " vai para: " + determinarCompeticao(desempenhoGremio));
        System.out.println(times[1] + " vai para: " + determinarCompeticao(desempenhoInternacional));
        System.out.println(times[2] + " vai para: " + determinarCompeticao(desempenhoJuventude));
        System.out.println(times[3] + " vai para: " + determinarCompeticao(desempenhoPalmeiras));
        System.out.println(times[4] + " vai para: " + determinarCompeticao(desempenhoSaoPaulo));
        System.out.println(times[5] + " vai para: " + determinarCompeticao(desempenhoFlamengo));
    }

    public static String determinarCompeticao(Desempenho desempenho) {
        return switch (desempenho) {
            case FINAIS -> "Série D";
            case SEMIFINAIS -> "Copa do Brasil";
            case QUARTAS -> "Copa Regional";
            case DESCLASSIFICADO -> "Desclassificado das competições";
            default -> "Desempenho inválido";
        };
    }
}

