package patternwithretry;

public class EngineFactory {

	public static EngineRawMetrial engineToRun(String whichEngine) {
		switch (EngineType.valueOf(whichEngine.toUpperCase())) {
		case SELENIUM:
			return new SeleniumEngine();
		case PLAYWRIGHT:
			return new PlaywrightEngine();
		default:
			return null;
		}
	}

}