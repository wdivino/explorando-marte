package br.com.gabriel.explorandomarte.modelo;

public class ViradorEsquerda implements ExecutorMovimento {

	public void executaMovimento(Sonda sonda) {
		
		sonda.viraParaEsquerda();
	}

}
