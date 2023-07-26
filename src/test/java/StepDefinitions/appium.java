package StepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class appium {
	  public static void main(String args[]) throws Exception {
	    // Set desired capabilities
	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("platformName", "Android");
	    
//	    caps.setCapability("platformVersion", "13");
//	    caps.setCapability("deviceName", "R52T204LBKN");
	    
	    caps.setCapability("platformVersion", "11");
	    caps.setCapability("deviceName", "OnePlus 6T"); 
	    caps.setCapability("udid", "b0d3f02a");
	    
	    caps.setCapability("noReset", true);
	    
	    caps.setCapability("appPackage", "com.oneplus.calculator");
		caps.setCapability("appActivity", "com.oneplus.calculator.Calculator");

	    // Initialize the Appium driver
	    AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		Thread.sleep(5000);
		
	    // Perform your test actions
	    // ...

	    // Close the driver
	    driver.quit();
	  }
	}





/*
// Initialize the Appium driver
        AppiumDriver<MobileElement> driver;
        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }


// Find the element by text and click on it
        MobileElement element = driver.findElementByAndroidUIAutomator("new UiSelector().text(\"your_text\")");
        if (element != null) {
            element.click();
        }


// Handle the system-level alert
        Alert alert = driver.switchTo().alert();
        // Perform actions on the alert
        // For example, to accept the alert:
        alert.accept();

        // Switch back to the default content
        driver.switchTo().defaultContent();


 */

