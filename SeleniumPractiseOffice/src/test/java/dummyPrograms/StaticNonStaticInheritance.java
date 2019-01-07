package dummyPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticNonStaticInheritance extends BaseClass {
	WebDriver driver;
	WebElement element;
	public static int b =10;
	 int c=20;
	 public static void read()
	 {
		 System.out.println("I can read");
	 }
	 public  void write()
	 {
		 System.out.println("I can write as well");
	 }
	 
	 StaticNonStaticInheritance()//This is constructor and at the time of object creation automatically constructor block will be called.
	 {
		 System.out.println("I am in Constructor Class");
	 }
	 
	 public void swim()
	 {
		System.out.println("I can swim hard"); 
	 }
	
	//public static void main(String[] args)
//	@Test(priority=2)
//	
//	public void helloworld(){
//		// TODO Auto-generated method stub
//		
//		System.out.println("Hello World");
//		System.setProperty("webdriver.chrome.driver","E:\\Avishek\\SeleniumProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
//		
//		driver=new ChromeDriver();
//		driver.get("http://www.google.com");
//		 element= driver.findElement(By.name("q"));
//		 element.sendKeys("Cheese!");
//		 element.submit();
//	}
	
	/*@Test(enabled=true)
	public void helloworld1() throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\Avishek\\SeleniumProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://103.94.84.74:7085/");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(screenshotFile, new File("E://Avishek//ScreenShot//1.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		element= driver.findElement(By.xpath("//*[@id=\"mnuAboutUs\"]/a"));
		element.click();
		element=driver.findElement(By.xpath("//*[@id=\"mnuTalentDirectory\"]/a"));
		element.click();
		driver.close();
	}*/
	
	public static void main(String[] args)
	{
		int a=5;//local variable
		System.out.println("Local Variable "+ a);
		System.out.println("Global Variable "+ b);
		StaticNonStaticInheritance A=new StaticNonStaticInheritance();
		System.out.println("Non static variable "+ A.c);
		read();//static method
		A.write();//non static method
		A.swim();//Called from BaseClass which is a parent class
		A.sleep();
		A.walk();
		A.laugh();
				
	}
	
	
	public void sleep()
	{
		System.out.println("sleep");
	}
	
}
