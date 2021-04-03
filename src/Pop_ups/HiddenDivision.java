package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com");
		//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("ritakothale");
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Rita_Kothale");
		//	
			
		}

}
