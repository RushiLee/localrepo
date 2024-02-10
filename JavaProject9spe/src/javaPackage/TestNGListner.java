package javaPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("****Test Started" +result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Success of test cases and its details are : "+result.getName());  
		}  
		  
		@Override  
		public void onTestFailure(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Failure of test cases and its details are : "+result.getName());  
		}  
}
