package sonarsource.sonarsource_demos;

import junit.framework.TestCase;

public class MoreCoverageTest extends TestCase {

	public void testF() {
		MoreCoverage c = new MoreCoverage();
		assertEquals(9, c.square(3), 0.0);
	}

}
