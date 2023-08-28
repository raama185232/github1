package pruthvi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	WebDriver wd;

	@BeforeTest
	public void test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		Thread.sleep(3000);
}
	@Test
	public void login() {
		wd.findElement(By.xpath("//*[@name='username'")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@type='password'")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@type='submit']")).click();
	
}
}