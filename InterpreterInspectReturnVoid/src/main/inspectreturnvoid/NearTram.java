package main.inspectreturnvoid;

public class NearTram extends Condition{
	public void inspect(Hotel hotel, Display display) {
		System.out.println("tram");
		display.result(hotel.nearTram());
	}
}
