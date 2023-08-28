package pruthvi1;

import java.awt.Robot;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
WebDriver wd;
Robot rt;

@BeforeTest
public void test() {
	WebDriverManager.chromedriver().setup();
	wd = new ChromeDriver();
	wd.manage().window().maximize();

}
	@Test
	public void test2() {
		wd.get("www.amazon.in");
		Actions act = new Actions(wd);
	   WebElement we1 = wd .findElement(By.xpath("//*[contains(text(),'Account & Lists')]"));
	   act.moveToElement(we1).build().perform();
	   wd.findElement(By.xpath("//*[@class='nav-text']")).click();
		
	}
}