package main.inspectreturnvoid;

public class Costoso extends Condition{

	@Override
	public void inspect(Hotel hotel, Display display) {
		System.out.println("costoso");
		 display.result(hotel.costoso(10));
	}

}
