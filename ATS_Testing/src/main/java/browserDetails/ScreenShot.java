package browserDetails;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class ScreenShot {

	public static void getScreenShot(WebDriver driver, String filepath) {

		try {
			System.out.println("getScreenShot ");

			TakesScreenshot ts = (TakesScreenshot) driver;
			System.out.println("before getScreenShot as");

			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println("After getScreenShot as");

			FileUtils.copyFile(source, new File(filepath));

		} catch (WebDriverException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getDateTimeStamp() {
		Date oDate;
		String[] sDatePart;
		String sDateStamp;

		oDate = new Date(0);

		System.out.println(oDate.toString());
		
		sDatePart = oDate.toString().split("");
	
		sDateStamp = sDatePart[5] + "_" + 
		         sDatePart[1] +
			               	"_" + sDatePart[2] + 
				                     "_" + sDatePart[3];
	
		sDateStamp = sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		return sDateStamp;
	}

}
