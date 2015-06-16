package main;

public class Costoso extends Condition{

	@Override
	public boolean inspect(Hotel hotel) {
		System.out.println("costoso");
		return hotel.costoso(4);
	}

}
