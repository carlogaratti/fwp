package main;

public class NearMetro extends Condition {

	private int startPosition= 2;
	private int endPosition = 4;

	@Override
	public boolean inspect(Hotel hotel) {
		int position = hotel.position();
		return startPosition < position && position < endPosition;
	}



}
