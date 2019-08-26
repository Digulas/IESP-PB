
package modelo;

public class Jogo3D extends JogoDigital {
	
	private String console;
	private int tipoControle;

	public Jogo3D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora, String console, int tipoControle) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		this.console = console;
		this.tipoControle = tipoControle;
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
