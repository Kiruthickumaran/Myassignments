package AKassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	
	String pagetitle =driver.getTitle();
	
	System.out.println(pagetitle);
	
	driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	
	driver.close();
	
}
}
