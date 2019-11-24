package br.com.view;

import br.com.model.Iterator;
import br.com.model.RepositorioDeNomes;

public class DemonstracaoPadraoIterator {
	
	public static void main(String[] args) {
		RepositorioDeNomes RepositorioDeNomes = new RepositorioDeNomes();

	      for(Iterator iter = RepositorioDeNomes.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}
