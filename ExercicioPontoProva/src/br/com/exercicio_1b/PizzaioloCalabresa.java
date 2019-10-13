package br.com.exercicio_1b;


public class PizzaioloCalabresa implements Pizzaiolo {
	public Pizza criarPizza() {
		return new PizzaCalabresa();
	}

	public Calzone criarCalzone() {
		return new CalzoneCalabresa();
	}
}
