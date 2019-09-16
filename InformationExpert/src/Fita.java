public class Fita {
	
	public enum Tipo {
		 normal, lancamento, infantil
	}
	
    private String titulo;
    private Tipo codigoDePreco;

    public Fita(String titulo, Tipo codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }
    
    public double obterValorMultaFita(){
		double valorRetorno = 0.0;
		
		if(codigoDePreco.equals(Tipo.normal)){
			valorRetorno = 1.5;
		}else if(codigoDePreco.equals(Tipo.lancamento)){
			valorRetorno = 3.0;
		}else if(codigoDePreco.equals(Tipo.infantil)){
			valorRetorno = 1.5;
		}
				
		return valorRetorno;
	}
	
	public double obterValorFita(){
		double valorRetorno = 0.0;
		
		if(codigoDePreco.equals(Tipo.normal)){
			valorRetorno = 2.0;
		}else if(codigoDePreco.equals(Tipo.lancamento)){
			valorRetorno = 3.0;
		}else if(codigoDePreco.equals(Tipo.infantil)){
			valorRetorno = 1.5;
		}
				
		return valorRetorno;
	}
	
	public int obterDiasFita(){
		
		int  diasFita = 0;		
		if(codigoDePreco.equals(Tipo.normal)){
			 diasFita =2;
		}else if(codigoDePreco.equals(Tipo.lancamento)){
			diasFita =1;
		}else if(codigoDePreco.equals(Tipo.infantil)){
			diasFita =3;
		}			
		return diasFita;
	}
	
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    
    public Tipo getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePrevo(Tipo codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}