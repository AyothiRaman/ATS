//package testPackages;
//
//import org.openqa.selenium.support.PageFactory;
//
//import atsModules.ListCandidate;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import atsModules.AddCandidate;
//import atsModules.AddDemand;
//import atsModules.AddEmployee;
//import atsModules.ListDemand;
//import atsModules.ListEmployee;
//import atsModules.LoginPage;
//import browserDetails.BrowserFactory;
//import browserDetails.ScreenShot;
//
//public class TestCaseClass extends HelperClass {
//
//	public TestCaseClass() {
//
//	}
//
//	@Test
//	public void returnResults() {
//
//		try {
//			System.out.println("ATS Page Starting");
//
//			driver.get("https://sight-spectrum-ats.vercel.app/login");
//
//			// LOGIN PAGE
//
//			LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
//
//			loginPage.loginWordPress("testing@128.com", "HELLO123");
//
//			// ADD DEMAND
////
//			AddDemand demand = PageFactory.initElements(driver, AddDemand.class);
//			demand.addDemandPress("SQL", "23", "client", "jackjhjhjhjh", "vend", "poc10", "jobId10", "skill", "1years",
//					"2months", "hellofgcgfgfhhg");
//			
//		//	demand.addAndClosingExperienceOption();
//
//			demand.dueDate();
//
//			demand.unAssigned();
//
//			Thread.sleep(3000);
//			demand.status();
//			demand.priority();
//			demand.noticePeriod();
//			demand.minExperienceYears();
//			demand.minExperienceMonths();
//			demand.maxExperienceYears();
//			demand.maxExperienceMonths();
//			demand.modeOfHire();
//			
//			demand.maxiAndMiniWindow();
//			demand.closeWindow();
//			demand.closingDiscardChangesWindow();
//			demand.saveAndClose();
//			demand.discardChangesWindow();
////
////			// DEMAND LIST
//
////			ListDemand dList = PageFactory.initElements(driver, ListDemand.class);
////
////			dList.demandListValidate();
////			driver.navigate().refresh();
////		     // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////		      
////		     // dList.searchOption();
////
////			dList.receivedDateSorting();
////			dList.hyperLink();
////			Thread.sleep(2000);
////			dList.saveAndCloseDemand();
////
////			Thread.sleep(2000);
////
////			dList.addSubmission();
////			dList.addSubmissionData();
////
////			dList.demandID();
////			Thread.sleep(2000);
////			dList.saveAndClose();
//
//			// ADD EMPLOYEE
////
////			AddEmployee employee = PageFactory.initElements(driver, AddEmployee.class);
////			employee.employeePress("raman", "sandy", "njosoodpkkkfn@gmail.com", "6768954567", "chennai", "banglore",
////					"tamil nadu", "465789", "BWXPA6128F", "409904820466");
////
////			// drop down
////			
////			employee.role();
////			employee.status();
////			employee.jobRole();
////			employee.location();
////			employee.gender();
////			employee.maritalStatus();
////
////			// date selection
////			employee.dateOfHire();
////			employee.dateOfBirth();
////			employee.dateOfJoining();
////			
////			
////			employee.minAndMaxWindow();
////			employee.closeWindow();
////			employee.closingDiscardChanges();
////
////			employee.saveAndClose();
////			Thread.sleep(2000);
////			employee.discardChangesOption();
////			
//			//employee.alertAccept();
// 
////			// EMPLOYEE LIST
////
//
////			ListEmployee eList = PageFactory.initElements(driver, ListEmployee.class);
////
////			eList.EmployeeListTest();
////			driver.navigate().refresh();
////			Thread.sleep(2000);
////			
////			//eList.searchOption();
////			JavascriptExecutor js = (JavascriptExecutor)driver;
////			js.executeScript("window.scrollBy(200,0)","");
////			eList.hyperLink();
////			Thread.sleep(4000);
////			eList.saveAndCloseEdit();
////			
////			Thread.sleep(2000);
////			eList.sortingfirstName();
////
////
////			Thread.sleep(3000);
////			eList.employeeID();
////			Thread.sleep(2000);
////			eList.saveClose();
////			
//
////
////			// ADD CANDIDATE
////
////			AddCandidate candidate = PageFactory.initElements(driver, AddCandidate.class);
////
////			candidate.addCandidatePress("21000", "john", "wick", "abc@gmail.com", "8904789089", "bnglr", "hubli",
////					"123456", "spectrum", "developer", "30000", "Technology", "24lpa", "sql", "banglore", "andhra",
////					"java, python", "2", "3");
////			
////			//candidate.addAndCloseExperienceDetails();
////			//candidate.addAndCloseEmploymentDetails();
////			candidate.startDate();
////			candidate.endDate();
////
////			candidate.status();
////			candidate.noticePeriod();
////			 Thread.sleep(2000);
////
////			candidate.modeOfHire();
////			
////			candidate.gender();
////			candidate.workModel();
////			candidate.empType();
////
////			Thread.sleep(2000);
////			candidate.maxiAndMini();
////
////			candidate.closeWindow();
////			candidate.closingDiscardChanges();
////			candidate.saveAndClose();
////			Thread.sleep(2000);
////			candidate.discardChangesOption();
//
//			// CANDIDATE LIST
////
////			ListCandidate candi = PageFactory.initElements(driver, ListCandidate.class);
////
////			candi.candidateListValidate();
////			//driver.navigate().refresh();
//////			JavascriptExecutor js = (JavascriptExecutor)driver;
//////			js.executeScript("window.scrollBy(400,0)","");
////			Thread.sleep(2000);
////			
////		//	candi.searchOption();
////			candi.hyperLink();
////			Thread.sleep(2000);
////
////			candi.saveAndClose();
////			Thread.sleep(2000);
////			candi.candidateID();
////			Thread.sleep(3000);
////			candi.saveCloseID();
//
//			// SCREENSHOT
//
//			String capture = System.getProperty("user.dir") + "\\" + "ScreenShots\\Details"
//					+ ScreenShot.getDateTimeStamp() + ".png";
//
//			try {
//				ScreenShot.getScreenShot(BrowserFactory.getDriver(), capture);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}
