package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager {
public static void main(String[]args) {
	
	
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver m=new ChromeDriver();
}




}
