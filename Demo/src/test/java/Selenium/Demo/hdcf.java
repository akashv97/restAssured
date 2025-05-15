package Selenium.Demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hdcf {
	WebDriver driver=new ChromeDriver();

//	    @BeforeMethod
//	    public void setUp() {
//	        WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
//	        driver.manage().window().maximize();
//	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	    }

//	    @AfterMethod
//	    public void tearDown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }

	    @Test
	    public void captureLanguagesTest() throws InterruptedException {
	    	driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        // 1. Open HDFC Bank Website
	        driver.get("https://www.hdfcbank.com/");
	        Thread.sleep(3000);

	        // 2. Mouse hover on 'Login' button
	        WebElement loginBtn = driver.findElement(By.xpath("//a[@title='NetBanking Login']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(loginBtn).perform();
	        Thread.sleep(2000);

	        // 3. Click on 'Login' button
	        loginBtn.click();
	        Thread.sleep(2000);

	        // 4. Click on 'Know More'
	        WebElement knowMoreBtn = driver.findElement(By.xpath("//a[text()='Know More']"));
	        knowMoreBtn.click();
	        Thread.sleep(2000);

	        // 5. Capture all the languages displayed
	        List<WebElement> languages = driver.findElements(By.xpath("//div[contains(@class, 'language-dropdown')]//ul/li/a"));

	        System.out.println("✅ Captured Languages:");
	        for (WebElement lang : languages) {
	            System.out.println("🔹 " + lang.getText());
	        }
	        driver.quit();
	    }
	    

}
