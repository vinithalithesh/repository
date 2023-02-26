package Bridge;

public interface WebActions {
	
	public void launch(String url);
	public void type(String locator, String text);
	public void click(String locator);
	public String getText(String locator);
	public void close();

}
