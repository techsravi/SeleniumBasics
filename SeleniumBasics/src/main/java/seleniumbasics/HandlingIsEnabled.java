package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingIsEnabled {

	public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup(); // WebDriver Manager Initialization
			WebDriver driver = new ChromeDriver(); // browser Launch
			driver.manage().deleteAllCookies(); // delete all cookies
			driver.manage().window().maximize(); // window maximize
			String url = "https://opensource-demo.orangehrmlive.com/"; // Initializing url
			driver.get(url); // launching the url
			String acttile = driver.getTitle(); //capture the title of page
			String exptitle = "OrangeHRM"; // Expected title
			if(acttile.equalsIgnoreCase(exptitle)) {
				System.out.println("Title Matched");
			}else {
				System.out.println("Title not matched");
			}
			
			WebElement username = driver.findElement(By.id("txtUsername"));
			if(username.isEnabled()) {
				System.out.println("Element is Displyed :" + username.isEnabled());
			}else {
				System.out.println("Element is Displyed :" + username.isEnabled());
			}
			
			driver.close();
			
		}
}
