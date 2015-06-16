package main;

public class Starter {
	public static void main(String[] args) {
		Componente farina = new Farina();
		Componente sale = new Sale();
		Pasta pasta = new Pasta();
		//Pasta pasta1 = new Pasta();
		//pasta.add(pasta1);
		//pasta.add(farina);
		//pasta.add(sale);
		Cestino cestino = new Cestino();
		pasta.price(cestino);
		System.out.println(cestino.total);
		
	}	
}
