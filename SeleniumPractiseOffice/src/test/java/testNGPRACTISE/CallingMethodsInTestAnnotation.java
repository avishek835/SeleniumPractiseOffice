package testNGPRACTISE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CallingMethodsInTestAnnotation  {
	
	WebDriver driver;
	@Test
	public void callingMethodsInTestAnnotation()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Avishek\\SeleniumProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		CallingMethodsInTestAnnotation c= new CallingMethodsInTestAnnotation();
		c.maximizeWindow();
		
	}
	
	public void maximizeWindow()
	{
		//driver.get("https://www.google.com");
		System.out.println("Hello");
	}

}
