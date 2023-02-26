package patternwithretry;

public interface EngineRawMetrial {
	
	void launch(String broserName, String aut);
	void type(String locator, String text);
	void click(String locator);
	String getText(String locator);
	void close();

}