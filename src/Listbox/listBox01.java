package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		WebElement currency =driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
		Select s=new Select(currency);
		//s.selectByIndex(1);
		//s.selectByVisibleText("USD");
		s.selectByValue("AED");
	
		WebElement passenger=driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]"));
		passenger.click();
		
		WebElement adult=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));
		Select a=new Select(adult);
		//s.selectByVisibleText("5");
		s.selectByValue("3");
	}
	
	

}
