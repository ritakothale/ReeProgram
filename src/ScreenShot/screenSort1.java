package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenSort1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("G:\\software testing class\\image.jpg");
		FileHandler.copy(src, d);
	
	}		
		
		
	}