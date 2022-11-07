import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class SampleTest_LogIn {


	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lemja\\Downloads\\webdrivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.findElement(By.cssSelector("#login2"))
		.click();
		
		//wait time for login box
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//input username
		driver.findElement(By.id("loginusername"))
		.sendKeys("123");
		//input password
		driver.findElement(By.cssSelector("#loginpassword"))
		.sendKeys("123");
	
		//Log in Button
		driver.findElement(By.xpath("//button[text()='Log in']"))
		.click();
		
		
		//Log Out button
		driver.findElement(By.linkText("Log out"))
		.click();
		
		
		
		
		
	}
  
}
