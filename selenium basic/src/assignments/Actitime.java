package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		String pageTitle=driver.getTitle();
		
		
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		String expectedTitle="actiTIME - Login";
		System.out.println("Title validation status: "+pageTitle.equals(expectedTitle));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		String expectedURL="https://demo.actitime.com";
		System.out.println("Url validation status: "+pageUrl.contains(expectedURL));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source: "+pageSource);
		System.out.println("Page Source length: "+pageSource.length());
		
		driver.close();
	}
}
