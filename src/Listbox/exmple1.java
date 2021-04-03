package Listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exmple1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\software testing class\\Automation\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		 List<WebElement> l=driver.findElements(By.xpath("//*[@class=\"currency-dropdown\"]"));
		 
		 int size= l.size();
		 System.out.println(size);
		 
		 for(int i=0;i<size;i++) {
			 System.out.println(l.get(i));
		 }
		
		
		
		
		//Select s=new Select(inr);
		
		//s.selectByIndex(3);
		//s.selectByValue("BDT");
		//s.deselectByVisibleText("USD");
		//s.selectByVisibleText("USD");
	}

}
