package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void InitialiseBrowser() {

		// System.setProperty("webdriver.chrome.driver","D:\\Desktop\\selenium\\imp\\browser
		// drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashwi\\OneDrive\\Desktop\\Sele\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void LaunchUrl() {
		driver.get("D://Desktop//selenium//selenium imp//offline website//index.html");
		driver.manage().window().maximize();
	}
	
	public static void EnterLoginDetails() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
	}
}
