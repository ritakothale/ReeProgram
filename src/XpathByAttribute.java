import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\software testing class\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy']")).sendKeys("Krita28@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rita12345");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'with Google')]")).click();
		//driver.close();
	
	}

}
