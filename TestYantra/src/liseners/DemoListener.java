package liseners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcases started its execution...!!!");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("A Testcase successfully executed..!!!");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("A testcase failed...!!!");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("A testcase skipped...!!");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Started execution...!!!Loading class....!!!");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Execution ends...!!!");
		
	}
}
