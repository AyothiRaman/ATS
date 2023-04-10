package atsModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddDemand {

	WebDriver driver;

	public AddDemand(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"demand\"]/button/span/div/img")
	@CacheLookup
	WebElement demandImageClick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"id__42\"]")
	@CacheLookup
	WebElement addDemandButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField53\"]")
	@CacheLookup
	WebElement jobTitle;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField62\"]")
	@CacheLookup
	WebElement noOfPositions;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField68\"]")
	@CacheLookup
	WebElement client;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div")
	@CacheLookup
	WebElement jobDescription;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField86\"]")
	@CacheLookup
	WebElement vendor;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField91\"]")
	@CacheLookup
	WebElement poc;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField96\"]")
	@CacheLookup
	WebElement jobId;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField104\"]")
	@CacheLookup
	WebElement skillSet;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField109\"]")
	@CacheLookup
	WebElement RskillYears;

	@FindBy(how = How.XPATH, using = "//*[@id=\"TextField114\"]")
	@CacheLookup
	WebElement RskillMonths;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div")
	@CacheLookup
	WebElement addDescription;

	@FindBy(how = How.XPATH, using = "//*[@id=\"ModalFocusTrapZone56\"]/div[2]/div[1]/div[1]/div[2]/div[2]/i")
	@CacheLookup
	WebElement close;

	public void addDemandPress(String jobT, String position, String cli, String jobDes, String vend, String pOfContact,
			String job, String sSet, String rMonth, String rYear, String description) {

		try {

			demandImageClick.click();
//			
			addDemandButton.click();

			// job title
			jobTitle.sendKeys(jobT);

//			
//			// no of positions
			noOfPositions.sendKeys(position);

			// Thread.sleep(4000);

			// client
			client.sendKeys(cli);
			// Thread.sleep(1000);

			// job Description

			jobDescription.sendKeys(jobDes);

			vendor.sendKeys(vend);

			poc.sendKeys(pOfContact);

			jobId.sendKeys(job);

			skillSet.sendKeys(sSet);

			RskillYears.sendKeys(rYear);
			RskillMonths.sendKeys(rMonth);

			addDescription.sendKeys(description);

			// close.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void addAndClosingExperienceOption() throws InterruptedException {

		// for add
		WebElement add = driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/button/span"));

		add.click();
		add.click();
		Thread.sleep(4000);

		// for delete
		List<WebElement> allOptions = driver.findElements(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/i"));

		String option = "3";
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().equals(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}

	public void dueDate() {
		driver.findElement(By.xpath("//*[@id=\"DatePicker73-label\"]/span")).click();

		String month = "October 2023";
		String due_date = "20";

		while (true) {
			String text = driver
					.findElement(
							By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[1]/span"))
					.getText();

			if (text.equals(month)) {
				break;
			} else {
				driver.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[1]/div[2]/button[2]/i"))
						.click();

			}
		}

		List<WebElement> all_dates = driver.findElements(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td/button"));

		for (WebElement ele : all_dates) {
			String text_date = ele.getText();
			String date[] = text_date.split("\n");

			if (date[0].equals(due_date)) {
				ele.click();
				break;
			}

		}
	}

	public void unAssigned() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"personaId\"]/div/div[1]"));
		ele.click();

		List<WebElement> allOptions = driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div"));

		String option = "?";
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();
				break;
			}
		}

	}

	public void status() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown61-option\"]")).click();
		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "On Hold";

		for (int i = 0; i < allOptions.size(); i++) {

			if (allOptions.get(i).getText().contains(option)) {

				allOptions.get(i).click();
				break;
			}

		}
	}

	public void priority() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown67-option\"]")).click();
		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "Medium";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}

	public void noticePeriod() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown82-option\"]")).click();
		List<WebElement> allOptons = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "< 60 Days";

		for (int i = 0; i < allOptons.size(); i++) {
			if (allOptons.get(i).getText().contains(option)) {
				allOptons.get(i).click();
				break;
			}
		}
	}

	public void minExperienceMonths() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown81-option\"]")).click();
		List<WebElement> allOptons = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "3 months";

		for (int i = 0; i < allOptons.size(); i++) {
			if (allOptons.get(i).getText().contains(option)) {
				allOptons.get(i).click();
				break;
			}
		}
	}

	public void minExperienceYears() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown80-option\"]")).click();
		List<WebElement> allOptons = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "2 years";

		for (int i = 0; i < allOptons.size(); i++) {
			if (allOptons.get(i).getText().contains(option)) {
				allOptons.get(i).click();
				break;
			}
		}
	}

	public void maxExperienceMonths() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown84-option\"]")).click();
		List<WebElement> allOptons = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "8 months";

		for (int i = 0; i < allOptons.size(); i++) {
			if (allOptons.get(i).getText().contains(option)) {
				allOptons.get(i).click();
				break;
			}
		}
	}

	public void maxExperienceYears() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown83-option\"]")).click();
		List<WebElement> allOptons = driver
				.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/button/span/span"));

		String option = "5 years";

		for (int i = 0; i < allOptons.size(); i++) {
			if (allOptons.get(i).getText().contains(option)) {
				allOptons.get(i).click();
				break;
			}
		}
	}

	public void modeOfHire() {
		driver.findElement(By.xpath("//*[@id=\"Dropdown85-option\"]")).click();

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

	public void maxiAndMiniWindow() throws InterruptedException {

		// For minimize
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/i"))
				.click();

		Thread.sleep(3000);

		// For Maximize
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/i"))
				.click();
	}

	public void closeWindow() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i"))
				.click();

		// for close
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/button[1]"))
				.click();
	}

	public void closingDiscardChangesWindow() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/i")).click();

	}

	public void saveAndClose() {
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/button/span/span/span"))
				.click();
	}

	public void discardChangesWindow() {
		addDemandButton.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/i"))
				.click();

		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/button[2]/span"))
				.click();
	}

	
}