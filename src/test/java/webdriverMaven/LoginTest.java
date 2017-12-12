package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
@BeforeTest

public void setup()
{
	System.setProperty("webdriver.chrome.driver", "F:\\Revati\\Library\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
}

@Test
public void doLogin()
{
	//driver.get("https://www.facebook.com/");
	//driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	//driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anuja.khirdekar05@gmail.com");
	//driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("shaya@317");
    //driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	
	//Twitter Login
	driver.get("https://twitter.com/login");
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input")).sendKeys("anuja.khirdekar05@gmail.com");
	driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input")).sendKeys("anishadivya@317");
    driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/div[2]/button")).click();
		
}
@AfterTest
 public void tearDown()
 {
	driver.quit();
 }
}
