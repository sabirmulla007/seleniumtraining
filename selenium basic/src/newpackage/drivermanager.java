package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriverManager.chromedriver().setup();
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
	//WebDriver driver=new ChromeDriver();
WebDriver m=new ChromeDriver(); 
m.manage().window().maximize();
m.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

m.get("https://demo.actitime.com/login.do");
m.findElement(By.cssSelector("input#username")).sendKeys("admin");;
m.findElement(By.cssSelector( "input.textField.pwdfield")).sendKeys("manager");
m.findElement(By.cssSelector("a#loginButton")).click();
m.findElement(By.cssSelector("div#container_tasks")).click();
m.findElement(By.cssSelector(".title.ellipsis")).click();
m.findElement(By.cssSelector(".item.createNewCustomer")).click();
m.findElement(By.cssSelector(".inputFieldWithPlaceholder.newNameField")).sendKeys("$dgd8888855555211**5555555555555555555&   %%%");
m.findElement(By.cssSelector("#customerLightBox_content .commitButtonPlaceHolder .components_button_label")).click();
//m.findElement(By.cssSelector("div#container_tasks")).click();

m.navigate().refresh();
m.findElement(By.cssSelector(".title.ellipsis")).click();

m.findElement(By.cssSelector("div[style='display: block; top: 129.5px; left: 329px;'] .item.createNewProject")).click();
//m.findElement(By.cssSelector("div#container_tasks"));
m.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("java");;





}

}
