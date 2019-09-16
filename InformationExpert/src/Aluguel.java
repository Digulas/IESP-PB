
public class Aluguel {
	private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }
    
    public double obterSubtotal(){
		double subTotal = fita.obterValorFita();	
		if(diasAlugada > fita.obterDiasFita()){
			subTotal += (diasAlugada - fita.obterDiasFita()) 
					* fita.obterValorMultaFita();
		}
		return subTotal;
	}
    
    public Fita getFita() {
        return fita;
    }
    
    public void setFita(Fita fita) {
		this.fita = fita;
	}
    
    public int getDiasAlugada() {
        return diasAlugada;
    }
    
    public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}
    
}
