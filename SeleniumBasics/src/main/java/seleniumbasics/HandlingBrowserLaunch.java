package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserLaunch {

	public static void main(String[] args) {
		//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 -- techsravi
		//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 --aa
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		String acttile = driver.getTitle();
		String exptitle = "OrangeHRM";
		if(acttile.equalsIgnoreCase(exptitle)) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase failed");
		}
		
		driver.close();
		
	}
}
