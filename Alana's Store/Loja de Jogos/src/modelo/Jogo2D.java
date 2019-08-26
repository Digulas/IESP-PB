
package modelo;


public class Jogo2D extends JogoDigital {
	
	String dispositivo;
	int tipoControle;
	
	public Jogo2D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
	}

	public String getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	public int getTipoControle() {
		return tipoControle;
	}

	public void setTipoControle(int tipoControle) {
		this.tipoControle = tipoControle;
	}
    
}
