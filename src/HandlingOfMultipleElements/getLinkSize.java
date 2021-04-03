package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLinkSize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		List<WebElement> AllLinks=driver.findElements(By.xpath("//a"));
		
		int size= AllLinks.size();
		System.out.println("Total no of Links in Facebook webpage "+size);
		
	}
}
