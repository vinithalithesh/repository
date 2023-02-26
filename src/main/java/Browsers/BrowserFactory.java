package Browsers;

public class BrowserFactory {
	public static Browser getBrowser(BrowserList Browser_List) {
		if (Browser_List==BrowserList.Chrome) {
			return new ChromeBrowserImplementation();
		}
		 
		else if (Browser_List==BrowserList.Edge)
		{

		}return new EdgeBrowserImplementation();
		
	
	
}

}
