
package modelo;

public class JogoRV extends JogoDigital {

	String tipoCapacete;
	String estereoscopia;
	
	public JogoRV(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
	}

	public String getTipoCapacete() {
		return tipoCapacete;
	}

	public void setTipoCapacete(String tipoCapacete) {
		this.tipoCapacete = tipoCapacete;
	}

	public String getEstereoscopia() {
		return estereoscopia;
	}

	public void setEstereoscopia(String estereoscopia) {
		this.estereoscopia = estereoscopia;
	}
	
	@Override
    public float calcularTotal(){
    return (precoAluguel / quantidadePessoas) + 20;};
}
