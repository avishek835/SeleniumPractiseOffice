package typeElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementElements {
	WebDriver driver;
	List<WebElement> ls;
	String St;
	@BeforeClass
    public  void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
	
	@Test
	public void findElementElements()
	{
	driver.get("http://103.94.84.77:7085/");
	 St= driver.findElement(By.xpath("/html/body/section[3]/div/div[2]/ul/li[7]/a")).getText();
	 if(St!=null) {
		 System.out.println(St);
	 }
	 
	 ls=driver.findElements(By.tagName("a"));
	 System.out.println(ls.size()); 
	 if (ls!=null)
	 {
		 
		 for(int i=0;i<ls.size();i++)
		 {
			 System.out.println(ls.get(i)); 
		 }
		
	 }
	//for drop down selection indexing start from 1,2....for selection any of the button having same name/id/typy indexing
	 // starts from 0,1,2
	 //get window handle, it will return current window,get window handles, it will return multiple windows.
	 //both will manage by switchto
	}
/*@AfterClass
public void quit()
{
	driver.quit();
}*/
}
