package main;

public class NearMetro extends Condition{
	public boolean inspect(Hotel hotel){
		System.out.println("metro");
		return hotel.nearMetro();
	}
}
