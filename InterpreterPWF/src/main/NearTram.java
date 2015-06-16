package main;

public class NearTram extends Condition{

	private int startPosition = 3;
	private int endPosition = 6;

	@Override
	public boolean inspect(Hotel hotel) {
		int position = hotel.position();
		return startPosition < position && position < endPosition;
	}

}
