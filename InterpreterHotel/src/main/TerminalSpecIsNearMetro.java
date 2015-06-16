package main;

public class TerminalSpecIsNearMetro extends Spec{

	public boolean evalutate(Hotel myHotel) {
		System.out.println(this);
		return myHotel.nearMetro();
	}

}
