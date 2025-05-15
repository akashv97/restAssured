package Selenium.Demo;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Pagination {
  	WebDriver driver=new ChromeDriver();
  @Test
  public void paginationConcept() throws InterruptedException {
	   //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//	  	WebDriver driver=new ChromeDriver();
//	  	driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
//	  	driver.manage().window().maximize();
//	  	Thread.sleep(5000);
//	  	String s=driver.getTitle();
//	  	System.out.println( s);
	  	int pagination=driver.findElements(By.xpath("//*[@class='dt-paging']//nav//button[position() > 2 and position() < last()-1]")).size();
	  	JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//*[@class='dt-paging']//nav//button[position() > 2 and position() < last()-1]")); 
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			
	  	System.out.println(pagination);
	  	List <String> names=new ArrayList<>();
	  	for(int i = 1;i<=pagination;i++) {
	  		
	  		String paginationSelectr="//*[@class='dt-paging']//nav//button[position() > 2 and position() < last()-1]["+i+"]";
	  		driver.findElement(By.xpath(paginationSelectr)).click();
	  		List<WebElement> nameElements=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
	  		for(WebElement nameElement: nameElements) {
	  			names.add(nameElement.getText());
	  		}
	  	}
	  	for(String name:names) {
	  		System.out.println(name);
	  	}
	  	int totalNames=names.size();
	  	System.out.println("Total number of Name : "+totalNames);
	  	String dcp=driver.findElement(By.id("example_info")).getText().split(" ")[5];
	  	System.out.println("Total Number of Displayed Name :"+dcp);
	  	AssertJUnit.assertEquals(dcp, String.valueOf(totalNames));
	  	Thread.sleep(5000);
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  	
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("Test Started...");
	  driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  String s=driver.getTitle();
	  System.out.println( s);
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Test Ended...");
	  driver.quit();
  }

}
