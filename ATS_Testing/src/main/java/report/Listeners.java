package report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("+++++++++++++++ on start +++++++++++++++" + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("+++++++++++++++ on success +++++++++++++++" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("++++++++++++++ on Failure +++++++++++++++" + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("+++++++++++++++ on skipped +++++++++++++++" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("+++++++++++++++ on test failed +++++++++++++++" + result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("+++++++++++++++ on test failed +++++++++++++++"+ result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
    System.out.println("+++++++++++++++ on start  +++++++++++++++"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("+++++++++++++++ on finish +++++++++++++++"+context.getName());
	}

}
