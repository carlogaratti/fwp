package main;

public class Sale  extends Componente{
	int price = 1;
	public void price(Cestino cestino){
		cestino.add(price);
	}
}
