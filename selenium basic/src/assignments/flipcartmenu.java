package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
ChromeDriver m=new ChromeDriver();
m.get("https://www.flipkart.com");
m.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
List<WebElement> a=m.findElements(By.cssSelector(" .InyRMC  ._37M3Pb>.eFQ30H .xtXmba"));
for(int i=0;i<a.size();i++) {
	WebElement b=a.get(i);
	
	System.out.println(b.getText());
	
	
}

System.out.println(a.size());


	}

}
