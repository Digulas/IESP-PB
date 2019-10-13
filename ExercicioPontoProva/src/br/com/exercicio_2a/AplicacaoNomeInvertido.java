package br.com.exercicio_2a;

public class AplicacaoNomeInvertido extends AplicacaoNome {
	
	public Nome construirNome(String nome) {
		String sobrenome = null;

		int pos = nome.indexOf(",");
		if (pos != -1) {
			sobrenome = nome.substring(0, pos).trim();
			nome = nome.substring(pos + 1, nome.length()).trim();
		}

		return new Nome(nome, sobrenome);
	}
}
