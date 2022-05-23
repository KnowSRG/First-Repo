package jQuery;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Select {
	

	@Test
	public void select()
	{
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\inetDemoV1\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.linkText("Selectable")).click();
		WebElement we=driver.findElement(By.xpath("//*[@id='selectable']"));
				Select li = new Select(we);
			
				
		
	}

}
