package ghi.Teste;

import org.junit.Assert;
import org.junit.Test;

public class JogoTest {
  @Test
  public void criarJogo() {
    //Passo: criar um jogo
    Jogo jogo = new Jogo();
    //Assertiva: verificar que o jogo não acabou
    Assert.assertFalse("O jogo iniciou acabado", jogo.acabou());
  }
  
  public void definirPrimeiroJogador() {
	    Jogo jogo = new Jogo();
	    jogo.setMarcaPrimeiroJogadorX(true);
	    Assert.assertTrue("Esperava que o primeiro jogador utilizasse X", jogo.isMarcaPrimeiroJogadorX());
	  }
}
