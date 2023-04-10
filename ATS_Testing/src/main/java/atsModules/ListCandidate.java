package atsModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCandidate {

	WebDriver driver;

	public ListCandidate(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"Candidate\"]/button/span/div/img")
	@CacheLookup
	WebElement candiateSideBar;

	public void candidateListValidate() {
		try {
			candiateSideBar.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchOption() {
	WebElement search=	driver.findElement(By.xpath("//*[@id=\"SearchBox39\"]"));
	search.sendKeys("sql");
	search.sendKeys(Keys.ENTER);
	
	}

	public void hyperLink() {
		WebElement ele = driver.findElement(By
				.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td/div"));
		ele.click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("/html/body/div[2]/div/div/div/div/div/div/button/span/span/span"));

		String option = "View / Edit";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}

	public void saveAndClose() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/button/span/span/span"))
				.click();
	}

	public void candidateID() {
		List<WebElement> allOptions = driver.findElements(
				By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td"));

		String Option = "63e0a9f84591e2297c98454f";

		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(Option)) {
				allOptions.get(i).click();
				break;
			}
		}
	}

	public void saveCloseID() {
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/button/span/span/span"))
				.click();
	}

}
