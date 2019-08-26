
package modelo;

import java.util.ArrayList;

public class JogoTabuleiro extends Jogo {
    
    String estilo;
    ArrayList<String> adereco = new ArrayList<>();

    public JogoTabuleiro(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
        super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
    }
    
    public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public ArrayList<String> getAdereco() {
		return adereco;
	}

	public void setAdereco(ArrayList<String> adereco) {
		this.adereco = adereco;
	}

	@Override
    public float calcularTotal(){    
    return (precoAluguel / quantidadePessoas) - 10;};
}
