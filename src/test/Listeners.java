package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Failed"+result.getName());
		System.out.println("Im from listeners");
	}
	
}
