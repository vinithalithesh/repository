package RetryWithNextData;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	private int count = 0;
	private int max = 1;

	@Override
	public boolean retry(ITestResult result) {
		if(count < max) {
			count++;
			return true;
		}
		return false;
	}

}