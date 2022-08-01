package week3day1;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://leaftaps.com/opentaps/control/main");
     driver.manage().window().maximize();
     
    
     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     String text= driver.findElement(By.tagName("h2")).getText();
     System.out.println(text);
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Create Lead")).click();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
     driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("ANANDARAJU");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KIRUTHIC KUMARAN");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ANANDARAJU");
}
 
}