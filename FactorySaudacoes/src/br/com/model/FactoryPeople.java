package br.com.model;

public class FactoryPeople {
	
	public People getPeople(String name, String gender){
		
		if(gender.equals("M"))
			return new Men(name);
		if(gender.equals("F"))
			return new Woman(name);
		if(gender.equals("G"))
			return new Neutral(name);
		return null;
	}

}
