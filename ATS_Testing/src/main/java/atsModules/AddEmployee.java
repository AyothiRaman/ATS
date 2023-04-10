package atsModules;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddEmployee {

	WebDriver driver;

	public AddEmployee(WebDriver driver) {
		super();
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"employee\"]/button/span/div/img")
	@CacheLookup
	WebElement employeeSideBar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"id__42\"]")
	@CacheLookup
	WebElement addEmployee;

	// ADD EMPLOYEE

	// BASIC INFORMATION

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField58\"]")
	@CacheLookup
	WebElement firstName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField63\"]")
	@CacheLookup
	WebElement lastName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField68\"]")
	@CacheLookup
	WebElement emailId;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField73\"]")
	@CacheLookup
	WebElement mobileNo;

	// PERSONAL DETAILS

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField101\"]")
	@CacheLookup
	WebElement addressLine1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField106\"]")
	@CacheLookup
	WebElement addressLine2;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField111\"]")
	@CacheLookup
	WebElement city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField116\"]")
	@CacheLookup
	WebElement pincode;

	// IDENTITY INFORMATION

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField121\"]")
	@CacheLookup
	WebElement panNo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField126\"]")
	@CacheLookup
	WebElement aadhar;

	// ACCOUNT

	@FindBy(how = How.XPATH, using = "//*[@id=\"Toggle131\"]")
	@CacheLookup
	WebElement autoGeneatePassword;

	@FindBy(how = How.XPATH, using = "//*[@id=\"Toggle137\"]")
	@CacheLookup
	WebElement welcomeMail;

	public void employeePress(String fName, String lName, String email, String mobile, String address1, String address2,
			String cit, String pin, String pan, String aadh) {
		try {

			employeeSideBar.click();
			addEmployee.click();

			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			emailId.sendKeys(email);
			mobileNo.sendKeys(mobile);

			addressLine1.sendKeys(address1);
			addressLine2.sendKeys(address2);
			city.sendKeys(cit);
			pincode.sendKeys(pin);

			panNo.sendKeys(pan);
			aadhar.sendKeys(aadh);

			autoGeneatePassword.click();
			welcomeMail.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	// DATE SELECTOR
	public void dateOfHire() {

		driver.findElement(By.xpath("//*[@id=\"DatePicker78-label\"]/span")).click();

		String month = "April 2020";
		String hire_date = "18";

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

		List<WebElement> allDates = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td/button"));

		for (WebElement ele : allDates) {
			String date_text = ele.getText();
			String date[] = date_text.split("\n");

			if (date[0].equals(hire_date)) {
				ele.click();
				break;
			}
		}
	}

	public void dateOfJoining() {
		driver.findElement(By.xpath("//*[@id=\"DatePicker85-label\"]/span")).click();

		String month = "March 2021";
		String join_date = "8";

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

		List<WebElement> allDates = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td/button"));
		for (WebElement ele : allDates) {

			String date_text = ele.getText();
			String date[] = date_text.split("\n");

			if (date[0].equals(join_date)) {
				ele.click();
				break;
			}
		}

	}

	public void dateOfBirth() {
		driver.findElement(By.xpath("//*[@id=\"DatePicker92-label\"]/span")).click();

		String month = "January 2022";
		String birth_date = "17";

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
			String date[] = date_text.split("\n");

			if (date[0].equals(birth_date)) {
				ele.click();
				break;
			}
		}

	}

	public void role() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown50-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Account Manager";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("clicked");

				break;

			}

		}
	}

	public void status() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown55-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Inactive";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("clicked");

				break;

			}

		}
	}

	public void jobRole() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown56-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Business Executives";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("clicked");

				break;

			}

		}
	}

	public void location() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown57-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Chennai - Tidel Park";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("clicked");

				break;

			}

		}
	}

	public void gender() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown100-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Female";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("clicked");

				break;

			}

		}

	}

	public void maritalStatus() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown99-option\"]")).click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "I don't want to say";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();

				System.out.println("clicked");

				break;

			}

		}

	}

	public void closeWindow() throws InterruptedException {
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div[2]/i")).click();

		Thread.sleep(3000);

		driver.findElement(By
				.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/button[1]/span/span/span"))
				.click();
	}
	
	public void closingDiscardChanges() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/i")).click();
		
	}

	public void saveAndClose() {

		WebElement saveAndClose = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]/div[2]/div/div[2]/div[2]/div/button/span/span/span"));
		saveAndClose.click();

	}

	public void alertAccept() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/i")).click();
	}

	public void minAndMaxWindow() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div[1]/i")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div[1]/i")).click();

	}
	
	public void discardChangesOption() throws InterruptedException {
		
		addEmployee.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/div[2]/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/button[2]")).click();
	}

}
