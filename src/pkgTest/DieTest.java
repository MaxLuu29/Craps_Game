package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {
		for (int a = 0; a <= 10000; a++) {
			Die d = new Die();

			if (d.getDieValue() > 6 || d.getDieValue() < 1) {
				fail("Out of range");
			}
		}
	}
}
