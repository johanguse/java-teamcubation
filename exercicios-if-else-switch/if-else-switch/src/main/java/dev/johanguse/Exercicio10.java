package dev.johanguse;

public class Exercicio10 {

    public enum Classificacao {
        ESTADUAL,
        LIBERTADORES,
        CAMPEAO_ATUAL,
        NAO_CLASSIFICADO
    }

    public static void main(String[] args) {
        String[] times = {"Grêmio", "Internacional", "Juventude", "Palmeiras", "São Paulo", "Flamengo"};

        Classificacao classificacaoGremio = Classificacao.ESTADUAL;
        Classificacao classificacaoInternacional = Classificacao.LIBERTADORES;
        Classificacao classificacaoJuventude = Classificacao.NAO_CLASSIFICADO;
        Classificacao classificacaoPalmeiras = Classificacao.CAMPEAO_ATUAL;
        Classificacao classificacaoSaoPaulo = Classificacao.ESTADUAL;
        Classificacao classificacaoFlamengo = Classificacao.LIBERTADORES;

        System.out.println(times[0] + " irá estrear na: " + determinarFase(classificacaoGremio));
        System.out.println(times[1] + " irá estrear na: " + determinarFase(classificacaoInternacional));
        System.out.println(times[2] + " irá estrear na: " + determinarFase(classificacaoJuventude));
        System.out.println(times[3] + " irá estrear na: " + determinarFase(classificacaoPalmeiras));
        System.out.println(times[4] + " irá estrear na: " + determinarFase(classificacaoSaoPaulo));
        System.out.println(times[5] + " irá estrear na: " + determinarFase(classificacaoFlamengo));
    }

    public static String determinarFase(Classificacao classificacao) {
        return switch (classificacao) {
            case ESTADUAL -> "primeira fase";
            case LIBERTADORES -> "segunda fase";
            case CAMPEAO_ATUAL -> "terceira fase";
            case NAO_CLASSIFICADO -> "Tente novamente o ano que vem!";
            default -> "Classificação inválida";
        };
    }
}

