package Selenium.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DisableNotifications {
	public static void main(String[] args) {

        // Setting ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Disable Chrome notifications
        options.addArguments("--disable-notifications"); 

        // Use DesiredCapabilities to merge with ChromeOptions
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        
        // Merging ChromeOptions with capabilities (For compatibility)
        options.merge(capabilities);

        // Initialize WebDriver with merged capabilities
//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver=new ChromeDriver(options);

        // Navigate to website
        driver.get("https://www.redbus.in");

        System.out.println("Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }

}
