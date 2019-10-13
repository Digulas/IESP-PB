package br.com.visao;

import javax.swing.JOptionPane;

import br.com.exercicio_2a.AplicacaoNome;
import br.com.exercicio_2a.AplicacaoNomeInvertido;
import br.com.exercicio_2a.AplicacaoNomeNormal;

public class Exercicio2aTest {

	public static void main(String[] args) {
		
		String nomeCompleto = JOptionPane.showInputDialog(null, "Digite o nome completo:");

		AplicacaoNome aplicacaoNormal = new AplicacaoNomeNormal();
		AplicacaoNome aplicacaoInvertido = new AplicacaoNomeInvertido();

		for (int i = 0; i < nomeCompleto.length(); i++) {
			if (nomeCompleto.indexOf(",") != -1)
				aplicacaoInvertido.adicionarNome(nomeCompleto);
			else
				aplicacaoNormal.adicionarNome(nomeCompleto);
		}

		aplicacaoNormal.imprimirNomes();
		aplicacaoInvertido.imprimirNomes();

	}

}
