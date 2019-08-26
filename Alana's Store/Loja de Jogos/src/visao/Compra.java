
package visao;

import java.util.ArrayList;
import modelo.Jogo;

public class Compra {

    public static void main(String[] args) {
        
        ArrayList<String> jogo = new ArrayList<>();
        int tempo;
        Cliente rodrigo = new Cliente("Rodrigo", tempo, jogo);
    }
    
public class Funcionario {

     int idFunc;
     String nomeFunc;
     String filial;
       
     public Funcionario(int idFunc, String nomeFunc, String filial) {
    	this.idFunc = idFunc;
    	this.nomeFunc = nomeFunc;
    	this.filial = filial;
    	
}

    public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

public class Cliente {

	int idCliente;
    String nome;
    
	public Cliente(int idCliente, String nome) {
		this.idCliente = idCliente;
		this.nome = nome;
	}
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   }
  }
 }
