package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = "https://demoqa.com/select-menu";//reference from demoqa
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
		WebElement colors = driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(colors); //initilizing select class
		WebElement o = select.getFirstSelectedOption(); //before selected option
		System.out.println(o.getText());
		//select.selectByIndex(5); //selecting by index
		//select.selectByVisibleText("Yellow");; //selecting by visibletext
		select.selectByValue("4"); //selecting by value
		WebElement p = select.getFirstSelectedOption(); //before selected option
		System.out.println(p.getText());//after selected option
		List<WebElement> colors1=select.getOptions();
		System.out.println(colors1.size());
		
		//options selecting using loop
		for(WebElement color:colors1) {
			//System.out.println(color.getText());
			if(color.getText().equalsIgnoreCase("Blue")) {
				select.selectByVisibleText(color.getText());
				break;
			}
		}
		
		
		//driver.close();
		
	}

}
