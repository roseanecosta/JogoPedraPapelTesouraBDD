package com.una.jogo.historias.passos;

import com.una.jogo.Jogo;
import static junit.framework.Assert.assertEquals;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 *
 * @author Roseane
 */
public class PassosPedPapTes {

    Jogo jogo;

    @Given("que a primeira jogada for <primeiraJogada>")
    public void primeiraJogada(String primeiraJogada) {
        jogo = new Jogo();
        jogo.setPrimeiraJogada(primeiraJogada);
    }

    @When("a segunda jogada for <segundaJogada>")
    public void segundaJogada(String segundaJogada) {
        jogo = new Jogo();
        jogo.setSegundaJogada(segundaJogada);
    }

    @Then("exibe a seguinte mensagem <mensagem>")
    public void resultado(String mensagem) {
        assertEquals(mensagem, jogo.resultado());
    }
}
