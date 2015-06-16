package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzScenarios {

	@Test
	public void test3() {
		Display display = new Display();
		NodeNumber nodeNumber = new NodeNumber(display, null);
		Five nodeFive = new Five(display, nodeNumber);
		Three three = new Three(display, nodeFive);
		three.run(3);
		assertEquals("Fizz", display.get());
	}
	
	@Test
	public void test5() {
		Display display = new Display();
		NodeNumber nodeNumber = new NodeNumber(display, null);
		Five nodeFive = new Five(display, nodeNumber);
		Three fizzBuzz = new Three(display, nodeFive);
		fizzBuzz.run(5);
		assertEquals("Buzz", display.get());
	}
	
	@Test
	public void test15() {
		Display display = new Display();
		NodeNumber nodeNumber = new NodeNumber(display, null);
		Five nodeFive = new Five(display, nodeNumber);
		Three fizzBuzz = new Three(display, nodeFive);
		fizzBuzz.run(15);
		assertEquals("FizzBuzz", display.get());
	}
	
	@Test
	public void test15Nuovo() {
		Display display = new Display();
		NodeNumber nodeNumber = new NodeNumber(display, null);
		FiveDecorator nodeFive = new FiveDecorator(display, nodeNumber);
		ThreeDecorator fizzBuzz = new ThreeDecorator(display, nodeFive);
		fizzBuzz.run(15);
		assertEquals("", display.get());
	}
	
	@Test
	public void test15Again() {
		Display display = new Display();
		NodeNumber nodeNumber = new NodeNumber(display, null);
		Five nodeFive = new Five(display, nodeNumber);
		ThreeDecorator fizzBuzz = new ThreeDecorator(display, nodeFive);
		fizzBuzz.run(15);
		assertEquals("Buzz", display.get());
	}

}
