package wordzenith.wordzenith1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class start {
	
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;

    @Test
	public void starttest() throws MalformedURLException {
		
    	UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("rajs"); //emulator
		options.setApp("//home//vapronix//eclipse-workspace//wordzenith1//src//test//java//resources//app-release.apk");
		//home//vapronix//eclipse-workspace//wordzenith1//src//test//java//resources//app.apk	
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		// Assuming you have a configured AndroidDriver instance (driver)
		// Wait for the element to be present
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement grantDialog = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.permissioncontroller:id/grant_dialog")));

		// Perform actions on the grant dialog
		grantDialog.click();  // or perform other interactions as needed
//driver.findElement(By

    	
    }
}
