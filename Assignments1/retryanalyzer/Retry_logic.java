package assign112.retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer
{
     int intialcount=0;
     int retrytimes=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(intialcount<retrytimes) 
		{
			intialcount++;
			return true;
			
		}
	
	
		return false;
	}

}
