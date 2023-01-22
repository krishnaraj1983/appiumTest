package appiumpoc;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FestivalsTest {
	static AppiumDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy S21 Ultra 5G");
		caps.setCapability("udid", "R5CR214D45J");
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "12");
		
		caps.setCapability("appPackage", "com.energyaustralia.codingtestsample");

		caps.setCapability("appActivity", "com.energyaustralia.codingtestsample.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,caps);
		
		System.out.println("Application started");
		
		// Hardcoded the test data
		ArrayList<String> list = new ArrayList<>();
		list.add("Adrian Venti");
		list.add("Trainerella");
		list.add("Auditones");
		list.add("Twisted Tour");
		list.add("Frank Jupiter");
		list.add("LOL-palooza");
		list.add("Green Mild Cold Capsicum");
		list.add("Small Night In");
		list.add("Jill Black");
		list.add("Manish Ditch");
		list.add("Squint-281");
		list.add("Summon");
		list.add("The Black Dashes");
		list.add("Werewolf Weekday");
		list.add("Wild Antelope");
		list.add("Youkrane");
		list.add("Yanke East");

		List<MobileElement> tableView =  driver.findElementsByXPath("//android.widget.ListView[@resource-id='com.energyaustralia.codingtestsample:id/festival_list']//android.widget.TextView");
		for(int i=0;i<tableView.size();i++) {
			boolean isPresent = false;
			for(int j=0;i<=list.size();j++) {
				if(list.get(j).contains(tableView.get(i).getText())) {
					isPresent = true;
					break;
				}
			}
			assertTrue(isPresent, "value is not matching");

		}
		


	}

}
