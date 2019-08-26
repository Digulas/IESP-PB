
package modelo;

public abstract class Jogo {
    
    private int idJogo;
    private String nome;
    private int quantidadeJogos;
    protected float precoAluguel;
    protected int quantidadePessoas;

    public Jogo(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.quantidadeJogos = quantidadeJogos;
        this.precoAluguel = precoAluguel;
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeJogos() {
        return quantidadeJogos;
    }

    public float getPrecoAluguel() {
        return precoAluguel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeJogos(int quantidadeJogos) {
        this.quantidadeJogos = quantidadeJogos;
    }

    public void setPrecoAluguel(float precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public abstract float calcularTotal();
            
    @Override
    public String toString() {
        return "Jogo{" + "idJogo=" + idJogo + ", nome=" + nome + ", quantidadeJogos=" + quantidadeJogos + ", precoAluguel=" + precoAluguel + ", quantidadePessoas=" + quantidadePessoas + '}';
    }
    
}
