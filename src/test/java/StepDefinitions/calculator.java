//	Trying to make changes to the file
package StepDefinitions;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;


import io.appium.java_client.AppiumDriver;

public class calculator {
	
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String arg[]) {
		
		try {
			openCalculator();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("deviceName", "SM-T733");
		cap.setCapability("udid", "R52T204LBKN");

		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap); 
		
		System.out.println("Application started...");
		
		
		
	}
}