package main;

public class Costoso extends Condition {

	private int soglia = 10;

	@Override
	public boolean inspect(Hotel hotel) {
		int price = hotel.price();
		return price > soglia;
	}

}
