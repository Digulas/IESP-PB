package br.com.exercicio_2a;

import java.util.HashSet;
import java.util.Set;

public abstract class AplicacaoNome {
	private Set<Nome> nomes = new HashSet<Nome>();

	public void adicionarNome(String nome) {
		Nome novoNome = construirNome(nome);
		nomes.add(novoNome);
	}

	public abstract Nome construirNome(String nome);

	public void imprimirNomes() {
		for (Nome nome : nomes)
			System.out.println(nome);
	}
}
