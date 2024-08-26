package sonarsource.sonarsource_demos;

import junit.framework.TestCase;

public class CustomMathTest extends TestCase {

	public void testF() {
		CustomMath c = new CustomMath();
		assertEquals(15, c.multiply(3,5));
	}

}
