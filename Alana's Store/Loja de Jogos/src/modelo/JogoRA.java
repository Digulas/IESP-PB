
package modelo;

public class JogoRA extends JogoDigital{
	
	private String dispositivo;
	private String marcador;
		
	public JogoRA(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora, String dispositivo, String marcador) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		this.dispositivo = dispositivo;
		this.marcador = marcador;
	}

	public String getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	public String getMarcador() {
		return marcador;
	}

	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}
    
}
