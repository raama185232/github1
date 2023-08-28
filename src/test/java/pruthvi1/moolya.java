package pruthvi1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moolya {
	private static final boolean False = false;
	WebDriver wd;

 @BeforeTest
 public void B() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver wd = new ChromeDriver();
	 wd.get("https://demoqa.com/alerts");
	 Thread.sleep(300/0);
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().window().maximize();
 }
	@Test
	public void Test1()
	{
		wd.get("https://www.moneycontrol.com/");
		wd.findElement(By.xpath("//*[@title=Personal Finance'])[2]")).click();
		 WebElement we1=wd.findElement(By.xpath("(//*[@title='Personal Finance'])[2]"));
		 Actions act=new Actions(wd);
		 act.moveToElement(we1).build().perform();
		 wd.findElement(By.xpath("//*[@title='Home Loan Calculator']")).click();
		 JavascriptExecutor js=(JavascriptExecutor)wd;
		 js.executeScript("window.scrollBy(0,1000)");
		 js.executeScript("document.getElementById('emi_table').scrollIntoView()");
		 String str= wd.findElement(By.xpath("//table[@id='emi_table']/tbody/tr[14]/td[5]")).getText();
		 System.out.println(str);
		 
  }
@Test
public void Test2() throws InterruptedException
{
	wd.get("https://demoqa.com/alerts");
	wd.findElement(By.xpath("//*[@id='alertButton']")).click();
	Thread.sleep(5000);
	Alert alt=wd.switchTo().alert();
	alt.dismiss();
	
}
@Test
public void Test3()
{
}
}