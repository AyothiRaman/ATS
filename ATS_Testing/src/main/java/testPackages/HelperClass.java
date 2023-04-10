package testPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import atsModules.AddCandidate;
import atsModules.AddDemand;
import atsModules.AddEmployee;
import atsModules.LoginPage;
import browserDetails.BrowserFactory;

public class HelperClass {

    public static WebDriver driver;

    public HelperClass() {

    }


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Suite");
    }

    @BeforeMethod
    public void beforeMethodClass() {
        System.out.println("Before Method");

        HelperClass.driver = BrowserFactory.getDriver();


    }

    @AfterMethod
    public void AfterMehtodClass() {

    }

    @AfterClass
    public void AfterClass() {

    }

    @AfterSuite
    public void afterSuite() {
        // driver.quit();
    }

}
