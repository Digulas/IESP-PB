import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private String nome;

    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        for (Aluguel f : fitasAlugadas) {

            double valorCorrente = f.obterSubtotal();
            	pontosDeAlugadorFrequente++;
            	
            	if (f.getFita().getCodigoDePreco() == Fita.Tipo.lancamento
                        && f.getDiasAlugada() > 1) {
                        pontosDeAlugadorFrequente++;
                    
            } 

            resultado += "\t" + f.getFita().getTitulo() + "\t"
                    + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } 
        
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
}