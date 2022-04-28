import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Third {

	public static WebDriver driver;
	@Test()
	public void Launch() throws AWTException {
			System.setProperty("webdriver.chrome.driver","C:\\eclipse\\inetDemoV1\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			
			/*driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act= new Actions(driver);
			act.dragAndDrop(src, target).build().perform();
			driver.findElement(By.cssSelector("[alt=Support the JS Foundation]" )).click();_*/
	}	

}
