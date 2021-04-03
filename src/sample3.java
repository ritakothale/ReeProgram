import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:\\software testing class\\Automation\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com");
}
}
