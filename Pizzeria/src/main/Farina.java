package main;

public class Farina extends Componente{
	
	int price = 3;
	
	public void price(Cestino cestino){
		cestino.add(price);
	}
}
