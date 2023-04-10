package atsModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "TextField3")
	@CacheLookup
	WebElement EmailId;

	@FindBy(how = How.ID, using = "TextField8")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.ID, using = "id__13")
	@CacheLookup
	WebElement login;

	public void loginWordPress(String email, String pass) {
		try {
			EmailId.sendKeys(email);
			// Thread.sleep(3000);

			password.sendKeys(pass);
			// Thread.sleep(3000);

			login.click();
			Thread.sleep(4000);

			String title = "Sightspectrum";

			String actualTitle = driver.getTitle();

			System.out.println("Verifying the page title has started");
			Assert.assertEquals(actualTitle, title, "Page title doesnt match");

			System.out.println("The page title has been successfully verified");

			System.out.println("User logged in successfully");
			
			String str = driver.getPageSource();
			System.out.println(str);

			String expected_title = "Sightspectrum";
			String actual_title = driver.getTitle();

			Assert.assertEquals(expected_title, actual_title);

			if (expected_title.equals(actual_title)) {
				System.out.println("+++++  title is correct  ++++++++");
			} else {
				System.out.println("wrong title");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
