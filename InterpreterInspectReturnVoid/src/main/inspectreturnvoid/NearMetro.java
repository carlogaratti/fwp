package main.inspectreturnvoid;

public class NearMetro extends Condition{
	public void inspect(Hotel hotel, Display display) {
		System.out.println("metro");
		display.result(hotel.nearMetro());
	}
}
