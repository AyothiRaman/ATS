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

public class ListEmployee {

    WebDriver driver;

    public ListEmployee(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"employee\"]/button/span/div/img")
    @CacheLookup
    WebElement employeeSideBar;


    public void EmployeeListTest() {
        try {

            employeeSideBar.click();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchOption() {
        WebElement search = driver.findElement(By.xpath("//*[@id=\"SearchBox26\"]"));
        search.sendKeys("python");
        search.sendKeys(Keys.ENTER);
    }


    public void hyperLink() {
        WebElement ele = driver.findElement(By.xpath(
                "/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td/div/i"));

        ele.click();

        List<WebElement> allOptions = driver
                .findElements(By.xpath("/html/body/div[2]/div/div/div/div/div/div/button/span/span/span"));

        String option = "Edit";

        for (WebElement allOption : allOptions) {
            if (allOption.getText().contains(option)) {
                allOption.click();
                break;
            }

        }
    }

    public void sortingfirstName() throws InterruptedException {

        // for ascending
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/thead/tr/th[3]/div/i")).click();

        Thread.sleep(2000);

        // for descending
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/thead/tr/th[3]/div/i")).click();

    }

    public void saveAndCloseEdit() {

        // Enable auto generate password
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div[2]/div[3]/div[4]/div/div[1]/div/button")).click();

        // save and close
        WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[2]/div/div[2]/div[2]/div/button/span"));
        ele.click();
    }

    public void employeeID() {
        List<WebElement> allOptions = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/table/tbody/tr/td"));

        String option = "63e5233e4591e2297c98588e";

        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).getText().contains(option)) {
                allOptions.get(i).click();
                break;
            }
        }

    }

    public void saveClose() {

        // Enable auto generate password
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div[2]/div[3]/div[4]/div/div[1]/div/button")).click();

        // save and close
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[2]/div/div[2]/div[2]/div/button/span/span/span")).click();
    }

}
