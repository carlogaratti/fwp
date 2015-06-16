package main;

public abstract class Chain {
	protected Chain next;
	protected int total;

	public abstract void exec();
	public Chain next(int partial) {
		total += partial;
		return next;
	}
}
