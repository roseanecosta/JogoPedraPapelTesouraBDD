package com.una.jogo;

/**
 *
 * @author Roseane
 */
public class Jogo {

    private String primeiraJogada;
    private String segundaJogada;

    public void setPrimeiraJogada(String primeiraJogada) {
        this.primeiraJogada = primeiraJogada;
    }

    /**
     * @param segundaJogada the segundaJogada to set
     */
    public void setSegundaJogada(String segundaJogada) {
        this.segundaJogada = segundaJogada;
    }

    public String resultado() {
        if ((primeiraJogada.equals("tesoura")) && (segundaJogada.equals("papel"))) {
            return "tesoura corta papel";
        } else if ((primeiraJogada.equals("pedra")) && (segundaJogada.equals("tesoura"))) {
            return "pedra quebra tesoura";

        } else {
            return "opcao inválida";
        }

    }
}
