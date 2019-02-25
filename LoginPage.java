package Appsbee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");// Crome Path
		Thread.sleep(5000);
		
		WebDriver dv = new ChromeDriver();
		dv.get("https://www.appsbee.com");
		dv.manage().window().maximize();// Window open maximize size always open
		Thread.sleep(1000);
		dv.findElement(By.xpath(".//*[@id='tags']")).click();
		Thread.sleep(1000);
		dv.findElement(By.xpath(".//*[@id='ui-id-4']")).click();
		
		
		
		
	}

}
