package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribure {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Executables\\chromedriver.exe");
ChromeDriver m=new ChromeDriver();
m.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

m.get("https://www.gsmarena.com/");


System.out.println(m.getTitle());
System.out.println(m.getCurrentUrl());

System.out.println(m.findElement(By.cssSelector("html>body .l-container #outer .sidebar .brandmenu-v2>ul>li:nth-of-type(10)")).isDisplayed());
//System.out.println(m.findElement(By.cssSelector("ul>li>a")).isDisplayed());
List<WebElement> a=m.findElements(By.cssSelector("html>body .l-container #outer .sidebar .brandmenu-v2>ul"));
for(int i=0;i<a.size();i++)
System.out.println(a.get(i).getText());
//System.out.println(m.findElement(By.cssSelector("html>body .l-container #outer .sidebar .brandmenu-v2>ul>li:nth-of-type(10)")).getAttribute("href"));
	}

}
