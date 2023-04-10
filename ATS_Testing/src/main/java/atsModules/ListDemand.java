package atsModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListDemand {

	WebDriver driver;

	public ListDemand(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"demand\"]/button/span/div/img")
	@CacheLookup
	WebElement demandImageClick;

	@FindBy(how = How.XPATH, using = "//*[@id=\"scrollableDiv\"]/div/div/table/tbody/tr[1]/td[1]")
	@CacheLookup
	WebElement demandID;

	public void demandListValidate() {

		try {
			demandImageClick.click();

		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	public void searchOption() {
	WebElement search=	driver.findElement(By.xpath("//*[@id=\"SearchBox26\"]"));
	search.sendKeys("java",Keys.ENTER);
	//search.sendKeys(Keys.ENTER);
	}

	public void demandID() throws InterruptedException {

		List<WebElement> allOptions = driver.findElements(
				By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td"));

		String option = "63f45bf84591e2297c987572";
				

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}

	}

	public void saveAndClose() {
		WebElement saveClose = driver.findElement(By.xpath(
				"/html/body/div/div/div/div/div/div[2]/div[2]/div/form/div/div[2]/div/div[2]/button/span/span/span"));
		saveClose.click();

	}

	public void hyperLink() {

		driver.findElement(By
				.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td/div"))
				.click();

		List<WebElement> alloptions = driver
				.findElements(By.xpath("/html/body/div[2]/div/div/div/div/div/div/button/span/span/span"));

		String option = "View/Edit Demand";

		for (int i = 0; i < alloptions.size(); i++) {
			if (alloptions.get(i).getText().contains(option)) {
				alloptions.get(i).click();
				break;
			}

		}

	}

	public void saveAndCloseDemand() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/form/div/div[2]/div/div[2]/button/span/span/span"))
				.click();
	}

	public void addSubmission() {

		driver.findElement(By
				.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td/div"))
				.click();

		List<WebElement> alloptions = driver
				.findElements(By.xpath("/html/body/div[2]/div/div/div/div/div/div/button/span/span/span"));

		String option = "Add Submission";

		for (int i = 0; i < alloptions.size(); i++) {
			if (alloptions.get(i).getText().contains(option)) {
				alloptions.get(i).click();
				break;
			}

		}

	}

	public void addSubmissionData() {
		//candidate ID 
		driver.findElement(By.xpath("//*[@id=\"TextField138\"]")).sendKeys("63ab82dd46ca7a948045fb8a");
		
		// Get the details based on candidate ID
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/button/div"))
				.click();
		
		//Save and close
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/button/span/span/span"))
				.click();
	}
	
	public void receivedDateSorting() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/thead/tr/th[3]/div/i")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/thead/tr/th[3]/div/i")).click();
	}
}