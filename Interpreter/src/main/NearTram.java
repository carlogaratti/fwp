package main;

public class NearTram extends Condition{
	public boolean inspect(Hotel hotel){
		System.out.println("tram");
		return hotel.nearTram();
	}
}
