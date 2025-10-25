package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sources.LogFb;

public class Testcase_3_Fb {
	@Test
	public void Login_FBS() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	LogFb f1=new LogFb(driver);
	f1.usename();
	f1.password();
	f1.submit();		
	}		

}
