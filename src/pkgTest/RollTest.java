package pkgTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {
	
	@Test
	public void TestRoll() {
		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			if (r.getScore() < 1 || r.getScore() > 12) {

				fail("Out of range");
			}
		}
	}
}
