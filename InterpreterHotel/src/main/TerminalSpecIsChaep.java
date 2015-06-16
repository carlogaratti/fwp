package main;

public class TerminalSpecIsChaep extends Spec{

	public static int SOGLIA = 5;

	public boolean evalutate(Hotel myHotel) {
		System.out.println(this);
		return myHotel.costoso(SOGLIA);
	}
}
