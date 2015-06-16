package main;

public class Starter {
	public static void main(String[] args) {
		Amount amount = new OneEuro();
		System.out.println(amount.total());
		Amount amount2 = new TwoEuro();
		System.out.println(amount2.total());
		CompositeAmount compositAmount = new CompositeAmount();
		compositAmount.add(amount);
		compositAmount.add(amount2);
		CompositeAmount compositAmount2 = new CompositeAmount();
		compositAmount2.add(amount);
		compositAmount.add(amount2);
		System.out.println(compositAmount.total());
	}

}
