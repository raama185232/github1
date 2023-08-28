package pruthvi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orange {
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
	@Test(enabled = true)
	public void login() {
		wd.findElement(By.xpath("//*[@name='username'")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@type='password'")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@type='submit']")).click();
	
	}
	@Test(enabled = true)
	public void admin() {
		Actions action = new Actions(wd);
		WebElement admin = wd.findElement(By.xpath("(//*[@class='oxd-icon oxd-menu-icon'])[1]"));
		action.moveToElement(admin).click().build().perform();
	}
	@Test(enabled = false)
	public void logout() throws InterruptedException {
	Thread.sleep(3000);
	Actions action = new Actions(wd);
	WebElement logout = wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']"));
	action.moveToElement(logout).click().build().perform();
	wd.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
	
	}
}
		
