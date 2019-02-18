package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;

	public Roll() {
		this.d1 = new Die();

		this.d2 = new Die();
	}

	public int getScore() {
		return d1.getDieValue() + d2.getDieValue();
	}

}
