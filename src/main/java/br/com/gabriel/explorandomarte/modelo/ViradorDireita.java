package br.com.gabriel.explorandomarte.modelo;

public class ViradorDireita implements ExecutorMovimento {

	public void executaMovimento(Sonda sonda, PosicionadorSondas posicionadorSondas) {
		
		sonda.viraParaDireita();
	}

}
