package br.com.view;

import br.com.model.FactoryPeople;

public abstract class Test {

	public static void main(String[] args) {
		FactoryPeople factory =  new FactoryPeople();
		String name = "Rodrigo";
		String gender = "M";
		factory.getPeople(name, gender);
		
		FactoryPeople factory1 = new FactoryPeople();
		String name1 = "Paula";
		String gender1 = "F";
		factory1.getPeople(name1, gender1);
		
		FactoryPeople factory2 = new FactoryPeople();
		String name2 = "Jandira";
		String gender2 = "G";
		factory2.getPeople(name2, gender2);
	}

}
