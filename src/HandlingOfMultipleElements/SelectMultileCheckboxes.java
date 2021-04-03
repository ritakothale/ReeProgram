package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultileCheckboxes {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	

	driver.get("https://www.demoqa.com/automation-practice-form");

	List <WebElement> allCheck = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
	int a=allCheck.size();
	System.out.println(a);
	
	for(int i=0; i<=allCheck.size()-1; i++) {
	allCheck.get(i).click();
	Thread.sleep(1000);
	}
				
		
	
													
	    
	}
}

