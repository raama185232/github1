package pruthvi1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangedemo {
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
	@Test(priority = 0)
	public void login() {
		wd.findElement(By.xpath("//*[@name='username'")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@type='password'")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@type='submit']")).click();
	

}
	@Test(priority = 1)
	public void admin() throws InterruptedException {
		Thread.sleep(5000);
		wd.findElement(By.linkText("Admin")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class='oxd-checkbox-wrapper'][4]")).click();
		Thread.sleep(5000);
		List<WebElement> we1=wd.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println(we1.size());
		Thread.sleep(5000);
		
		
	}		
}