package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNavigateMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		
		Thread.sleep(3000);
		WebElement forgotpassword = driver.findElement(By.id("forgotPasswordLink"));
		Thread.sleep(3000);
		forgotpassword.click();
		Thread.sleep(3000);
		driver.navigate().back();  //Go back to Home Page  
		Thread.sleep(3000);
		driver.navigate().forward();  //Go forward to Forgot password page  
		Thread.sleep(3000);
		driver.navigate().refresh(); //Refresh browser 
		driver.close();
		
	}
	
	


}
