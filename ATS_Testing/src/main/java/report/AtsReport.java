package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import atsModules.AddCandidate;
import atsModules.AddDemand;
import atsModules.AddEmployee;
import atsModules.ListCandidate;
import atsModules.ListDemand;
import atsModules.ListEmployee;
import atsModules.LoginPage;
import browserDetails.BrowserFactory;

@Listeners(report.Listeners.class)
public class AtsReport {

    public static WebDriver driver;

    public ExtentHtmlReporter reporter; // look and feel of our project

    public ExtentReports reports; // create entities in our project

    public ExtentTest test; // make update status in our project

    @BeforeTest
    public void testing() {
        reporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-out/myReport.html");

        // Title of the Report
        reporter.config().setDocumentTitle("ATS Automation Report");
        // Name Of the Report
        reporter.config().setReportName("functional Report");
        // Theme of the Report
        reporter.config().setTheme(Theme.DARK);

        reports = new ExtentReports();

        reports.attachReporter(reporter);

        reports.setSystemInfo("Tester", "Sara");
        reports.setSystemInfo("Browser", "Chrome");
        reports.setSystemInfo("OS", "windows 10");
    }

    @AfterTest
    public void endReport() {
        reports.flush();
    }

    @BeforeMethod
    public void beforeMethodClass() {
        System.out.println("Before Method");

//		AtsReport.driver = BrowserFactory.getDriver();
//
//		driver.get("https://sight-spectrum-ats.vercel.app/login");
//		driver.manage().window().maximize();

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\SSLTP11229\\Desktop\\Sele\\chromedriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://sight-spectrum-ats.vercel.app/login");
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    public void loginTest() {
        test = reports.createTest("loginTest");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");
        driver.quit();

    }

    @Test(priority = 2)
    public void employeeDetailsTest() throws InterruptedException {
        test = reports.createTest("Employee Details Test");
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");

        ListEmployee employee = PageFactory.initElements(driver, ListEmployee.class);
        employee.EmployeeListTest();
        employee.hyperLink();
        employee.saveAndCloseEdit();
        employee.employeeID();
        employee.saveClose();

        Thread.sleep(3000);
        driver.quit();
    }

    @Test(priority = 3)
    public void addEmployeeTest() throws InterruptedException {

        test = reports.createTest("AddEmployeeTest");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");

        AddEmployee employee = PageFactory.initElements(driver, AddEmployee.class);
        employee.employeePress("raman", "sandy", "mbmpoibllk@gmail.com", "6768954567", "chennai", "banglore", "tamil nadu",
                "465789", "BWXPA6128F", "409904820466");

        // drop down
        Thread.sleep(2000);
        employee.role();
        employee.status();
        employee.jobRole();
        employee.location();
        employee.gender();
        employee.maritalStatus();

        // date selection
        employee.dateOfHire();
        employee.dateOfBirth();
        employee.dateOfJoining();

        // Thread.sleep(2000);
        employee.saveAndClose();

        //employee.alertAccept();

        driver.quit();

    }


    @Test(priority = 4)
    public void addCandidateTest() throws InterruptedException {

        test = reports.createTest("AddCandidateTest");
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");

        AddCandidate candidate = PageFactory.initElements(driver, AddCandidate.class);

        candidate.addCandidatePress("21000", "john", "wick", "ajjkjc@gmail.com", "8904789089", "bnglr", "hubli",
                "123456", "spectrum", "developer", "30000", "Technology", "24lpa", "sql", "banglore", "andhra",
                "java, python", "2", "3");
        candidate.startDate();
        candidate.endDate();

        Thread.sleep(3000);
        candidate.status();
        candidate.modeOfHire();
        candidate.noticePeriod();

        candidate.workModel();
        candidate.gender();
        candidate.empType();

        candidate.saveAndClose();
        candidate.alertAccept();
        Thread.sleep(3000);

        driver.quit();

    }

    public void CandidateListTest() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");
        ListCandidate candidate = PageFactory.initElements(driver, ListCandidate.class);

        candidate.candidateListValidate();
        candidate.hyperLink();
        candidate.saveAndClose();
        candidate.candidateID();
        candidate.saveCloseID();
    }

    @Test(priority = 5)
    public void addDemandTest() throws InterruptedException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");

        AddDemand demand = PageFactory.initElements(driver, AddDemand.class);
        demand.addDemandPress("SQL", "23", "client", "jackjhjhjhjh", "vend", "poc10", "jobId10", "skill", "1years",
                "2months", "hellofgcgfgfhhg");

        demand.dueDate();

        demand.unAssigned();

        Thread.sleep(3000);
        demand.status();
        Thread.sleep(3000);
        demand.priority();
        demand.noticePeriod();
        demand.minExperienceYears();
        demand.minExperienceMonths();
        Thread.sleep(2000);
        demand.modeOfHire();
        demand.maxExperienceYears();
        demand.maxExperienceMonths();
        Thread.sleep(2000);

        demand.saveAndClose();
        driver.quit();
    }

    @Test(priority = 6)
    public void demandListTest() throws InterruptedException {

        test = reports.createTest("Demand List Test");
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginWordPress("testing@128.com", "HELLO123");

        ListDemand dList = PageFactory.initElements(driver, ListDemand.class);

        dList.demandListValidate();
        driver.navigate().refresh();
        Thread.sleep(2000);

        dList.hyperLink();
        Thread.sleep(2000);
        dList.saveAndCloseDemand();

        Thread.sleep(2000);

        dList.addSubmission();
        dList.addSubmissionData();

        dList.demandID();
        Thread.sleep(2000);
        dList.saveAndClose();

        driver.quit();

    }

}
