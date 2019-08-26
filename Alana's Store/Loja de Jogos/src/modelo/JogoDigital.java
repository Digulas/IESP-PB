
package modelo;

public class JogoDigital extends Jogo {
    
    int anoCriacao;
    String produtora;

    public JogoDigital(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
        super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
    }
    
    public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	@Override
    public float calcularTotal(){
		return precoAluguel / quantidadePessoas;};
    
 }
    
