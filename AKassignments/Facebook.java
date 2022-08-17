package AKassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("kiruthic kumaran");
		
		driver.findElement(By.name("lastname")).sendKeys("A");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8220351671");
		
		driver.findElement(By.id("password_step_input")).sendKeys("genial");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select day= new Select(Day);
		day.selectByVisibleText("28");
		
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select month=new Select(Month);
		month.selectByVisibleText("Jan");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select year=new Select(Year);
		year.selectByVisibleText("1999");
		
		
		
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
		
 		
		
		
		
		
		
		
	}

}
