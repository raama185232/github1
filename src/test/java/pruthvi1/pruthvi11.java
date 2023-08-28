package pruthvi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pruthvi11 {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver raama = new ChromeDriver();
	raama.get("https://the-internet.herokuapp.com/login");
	Thread.sleep(3000);
	raama.findElement(By.xpath("//*[@name='username']")).sendKeys("tomsmith");
	raama.findElement(By.xpath("//*[@name='password']")).sendKeys("SuperSecretPassword!");
	raama.findElement(By.xpath("//*[@class='radius']")).click();
	
	}

}
