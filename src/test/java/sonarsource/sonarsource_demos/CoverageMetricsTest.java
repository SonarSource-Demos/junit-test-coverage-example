package sonarsource.sonarsource_demos;

import junit.framework.TestCase;

public class CoverageMetricsTest extends TestCase {

	public void testF() {
		CoverageMetrics c = new CoverageMetrics();
		assertEquals(0.5, c.f(1), 0.0);
	}

}
