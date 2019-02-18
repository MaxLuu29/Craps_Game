package pkgCore;

import java.util.Random;

public class Die {
	private static Random randomNumbers = new Random();
	private int DieValue;

	public Die() {
		this.DieValue = 1 + randomNumbers.nextInt(6);
	}

	public int getDieValue() {
		return DieValue;
	}
}
