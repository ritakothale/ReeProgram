

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class sample4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\software testing class\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
	    Point min= new Point(200,100);
		driver.manage().window().setPosition(min);
		
		Dimension di= new Dimension(50,50);
		driver.manage().window().setSize(di);
		
		
	}
}
