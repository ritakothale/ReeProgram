import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_index {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\software testing class\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("krita28@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6466loveing");
		
		
		driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]")).click();
		
		
	}

}
