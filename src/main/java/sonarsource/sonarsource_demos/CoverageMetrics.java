package sonarsource.sonarsource_demos;

public class CoverageMetrics {
	/**
	 * Showing how SonarQube calculates Test Coverage % metrics
	 * 
	 * @param i
	 * @return
	 */
	public float f(int i) {
		int k = 0; /* default */
		if (i != 0) {
			k = 1;
		}
		return (float)i/(k+1);
	}
}