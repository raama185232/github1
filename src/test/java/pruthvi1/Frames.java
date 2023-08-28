package pruthvi1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	WebDriver wd;
	@BeforeTest
	 public void B() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver wd = new ChromeDriver();
		 Thread.sleep(300/0);

}
	@Test
	public void test1()
	{
		wd.get("https://demoqa.com/frames");
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("document.getElement ById('frame2').scrollintoview()");
		List<WebElement> frames = wd.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for (int i=0;i<frames.size();i++) {
			String names=frames.get(i).getAttribute("id");
			System.out.println(names);
		}
		wd.switchTo().frame("frame");
		js.executeScript("window.scrollBy(0,100)");
		
		wd.switchTo().frame("frame1");
		wd.findElement(By.id("frame1")).getText();
}
}