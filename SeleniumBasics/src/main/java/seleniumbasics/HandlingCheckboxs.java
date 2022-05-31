package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckboxs {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // WebDriver Manager Initialization
		WebDriver driver = new ChromeDriver(); // browser Launch
		driver.manage().deleteAllCookies(); // delete all cookies
		driver.manage().window().maximize(); // window maximize
		String url = "https://demo.guru99.com/test/radio.html"; // Reference from guru99 website
		driver.get(url); // launching the url
		String acttile = driver.getTitle(); //capture the title of page
		String exptitle = "Radio Button & Check Box Demo"; // Expected title
		if(acttile.equalsIgnoreCase(exptitle)) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title not matched");
		}
		
		WebElement option1 = driver.findElement(By.id("vfb-6-2"));
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkboxes.size());
		//selecting the radio button using if condition
		
		if(option1.isEnabled()) {
			System.out.println("Element is Displyed :" + option1.isEnabled());
			option1.click();
			if(option1.isSelected()) {
				System.out.println("Element is Seleted :" + option1.isSelected());
			}else {
				System.out.println("Element is Displyed :" + option1.isSelected());
			}
		}else {
			System.out.println("Element is Displyed :" + option1.isEnabled());
		}
		
		//selecting the radio button using Loop
		
		for(WebElement checkbox : checkboxes) {
			//System.out.println(radio.getAttribute("value"));
			
			if(checkbox.getAttribute("value").equalsIgnoreCase("checkbox2")) {
				checkbox.click();
				break;
			}
			
		}
		
		driver.close();
		
	}
}
