package atsModules;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCandidate {

	 WebDriver driver;

	public AddCandidate(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"Candidate\"]/button/span/div/img")
	@CacheLookup
	WebElement candiateSideBar;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/button/span")
	@CacheLookup
	WebElement addCandidateButton;


	@FindBy(how = How.XPATH, using = "//*[@id=\"resume-upload\"]")
	@CacheLookup
	WebElement attachResume;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div/input")
	@CacheLookup
	WebElement ExpectCTC;


	// BASIC INFORMATION

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField64\"]")
	@CacheLookup
	WebElement firstName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField69\"]")
	@CacheLookup
	WebElement lastName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField74\"]")
	@CacheLookup
	WebElement emailID;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField79\"]")
	@CacheLookup
	WebElement mobileNumber;

	

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField85\"]")
	@CacheLookup
	WebElement state;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField90\"]")
	@CacheLookup
	WebElement city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField95\"]")
	@CacheLookup
	WebElement pincode;

	// EMPLOYMENT DETAILS

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[1]/div/div/input")
	@CacheLookup
	WebElement setCurrentCompany;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField100\"]")
	@CacheLookup
	WebElement companyName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField119\"]")
	@CacheLookup
	WebElement jobRole;

	

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField125\"]")
	@CacheLookup
	WebElement Ectc;


	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField131\"]")
	@CacheLookup
	WebElement iType;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField136\"]")
	@CacheLookup
	WebElement c2hPayroll;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField141\"]")
	@CacheLookup
	WebElement jobSkill;

	@FindBy(how = How.XPATH, using = "	//*[@id=\"ModalFocusTrapZone50\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")
	@CacheLookup
	WebElement addEmploymentDetails;

	@FindBy(how = How.XPATH, using = "	//*[@id=\"ModalFocusTrapZone50\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td[12]/div/i")
	@CacheLookup
	WebElement deleteEmploymentDetails;

	// PREFERENCES

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField146\"]")
	@CacheLookup
	WebElement currentLocation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Toggle151\"]")
	@CacheLookup
	WebElement relocate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField152\"]")
	@CacheLookup
	WebElement preferredLocation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField157\"]")
	@CacheLookup
	WebElement skillSet;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField162\"]")
	@CacheLookup
	WebElement rExperienceYears;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField167\"]")
	@CacheLookup
	WebElement rExperienceMonths;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ModalFocusTrapZone50\"]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")
	@CacheLookup
	WebElement addPreferences;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ModalFocusTrapZone50\"]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[3]/div[2]/div[3]/div/i")
	@CacheLookup
	WebElement deletePreferences;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/button/span/span/span")
	@CacheLookup
	WebElement save;

	public void addCandidatePress(String ctc, String fName, String lName, String email, String mobile, String sta,
			String cit, String pin, String Cname, String jRole, String employmentCTC, String indType, String cPayroll,
			String jSkill, String currLocation, String pLocation, String sSet, String eYears, String eMonths) {

		try {
			candiateSideBar.click();
			addCandidateButton.click();
			// status.click();
			attachResume.sendKeys("C:\\Users\\SSLTP11229\\Documents\\Resume of AyothiRaman.docx");
			ExpectCTC.sendKeys(ctc);
			

			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			emailID.sendKeys(email);
			mobileNumber.sendKeys(mobile);
			// gender.click();
			state.sendKeys(sta);
			city.sendKeys(cit);
			pincode.sendKeys(pin);

			setCurrentCompany.click();

			companyName.sendKeys(Cname);
			jobRole.sendKeys(jRole);
			Ectc.sendKeys(employmentCTC);
			iType.sendKeys(indType);
			c2hPayroll.sendKeys(cPayroll);
			jobSkill.sendKeys(jSkill);
			// addEmploymentDetails.click();
			Thread.sleep(3000);
			// deleteEmploymentDetails.click();

			currentLocation.sendKeys(currLocation);
			relocate.click();
			preferredLocation.sendKeys(pLocation);
			skillSet.sendKeys(sSet);
			rExperienceYears.sendKeys(eYears);
			rExperienceMonths.sendKeys(eMonths);
			// addPreferences.click();
			Thread.sleep(3000);
			// deletePreferences.click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void addAndCloseEmploymentDetails() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")).click();
		
//		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id=\"ModalFocusTrapZone47\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr/td/div/i"));
//		
//		System.out.println(allOptions);
//		String option="2";
//		String option1="1";
//		for(int i=0;i<allOptions.size();i++) {
//			if(allOptions.get(i).getText().equals(option)) {
//				allOptions.get(i).click();
//				break;
//				
//			}
//			
//			else if(allOptions.get(i).getText().equals(option1)) {
//				allOptions.get(i).click();
//				break;
//			}
//		}
		
		List<WebElement> month_list= driver.findElements(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div/i"));

		ListIterator<WebElement> listIter= month_list.listIterator();

		String s ="2";
		while(listIter.hasNext()) {

		WebElement elem= listIter.next();
		
		if(month_list.equals(s)) {
			elem.click();
		}

		
		}
		
		
	}
	
	
	public void addAndCloseExperienceDetails() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div[1]/div[2]")).click();
		
		
		
		List<WebElement> alloptions = driver.findElements(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div/i"));
		
		String option ="2";
		for(int i=0;i<alloptions.size();i++) {
			
		

			
			if(alloptions.get(i).getText().contains(option)) {
				alloptions.get(i).click();
				break;
			}
			
		}
	}

	// DATE SELECT

	public void startDate() {
		driver.findElement(By.xpath("//*[@id=\"DatePicker105-label\"]/span")).click();

		String month = "May 2020";
		String start_date = "28";

		while (true) {
			String text = driver
					.findElement(
							By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/span"))
					.getText();

			if (text.equals(month)) {

				break;
			} else {

				driver.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/button[1]"))
						.click();
			}
		}

		List<WebElement> allDates = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td/button"));

		for (WebElement ele : allDates) {
			String date_text = ele.getText();
			String dates[] = date_text.split("\n");

			if (dates[0].equals(start_date)) {
				ele.click();
				break;
			}
		}
	}

	// END DATE

	public void endDate() {

		driver.findElement(By.xpath("//*[@id=\"DatePicker112-label\"]/span")).click();

		String month = "November 2019";
		String end_date = "30";

		while (true) {
			String text = driver
					.findElement(
							By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/span"))
					.getText();

			if (text.equals(month)) {
				break;
			}

			else {
				driver.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/button[1]"))
						.click();
			}
		}

		List<WebElement> all_dates = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td/button"));

		for (WebElement ele : all_dates) {
			String date_text = ele.getText();
			String date[] = date_text.split("\n");

			if (date[0].equals(end_date)) {
				ele.click();
				break;
			}
		}

	}

	// DROP DOWN

	public void status() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown56-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "In progress";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	public void noticePeriod() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown57-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "< 60 Days";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	public void modeOfHire() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown63-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "C2H (contract to Hire) - Client side";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	
	public void gender() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown84-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Female";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	public void workModel() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown124-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Hybrid";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	public void empType() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown130-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Permanent";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	public void maxiAndMini() throws InterruptedException {
		
		//for minimize
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/i")).click();
		
		Thread.sleep(3000);
		//for maximize
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/i")).click();
	}
	
	public void closeWindow() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/button[1]/span/span/span")).click();
	}
	
	public void closingDiscardChanges() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/i")).click();
	}
	
	public void saveAndClose() {
		save.click();
	}
	
	public void alertAccept() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/button/span/span/span")).click();
	}
	
	public void discardChangesOption() throws InterruptedException {
		
		addCandidateButton.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/button[2]/span")).click();
	}

}
