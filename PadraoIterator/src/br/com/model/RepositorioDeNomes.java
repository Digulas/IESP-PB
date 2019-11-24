package br.com.model;

public class RepositorioDeNomes implements Container {

	public String nomes[] = {"Maria" , "João" ,"Julia" , "Maricleide"};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < nomes.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return nomes[index++];
	         }
	         return null;
	      }		
	   }
	}
