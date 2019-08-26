
package modelo;

public class Jogo3D extends JogoDigital {
	
	String console;
	int tipoControle;
	
	public Jogo3D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getTipoControle() {
		return tipoControle;
	}

	public void setTipoControle(int tipoControle) {
		this.tipoControle = tipoControle;
	}
	   
}
