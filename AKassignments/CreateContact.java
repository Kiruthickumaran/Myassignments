package AKassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text=  driver.findElement(By.tagName("h2")).getText();
	  
	System.out.println(text);
	  
	  driver.findElement(By.linkText("CRM/SFA" )).click();
	  driver.findElement(By.linkText("Leads")).click();
	  driver.findElement(By.linkText("Create Lead")).click();
	  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiruthic kumaran");
	  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
	  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("aaaa");
	  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("bbb");
	  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("ccc");
	  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
	  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ddd");
	  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("eee");
	  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("fff");
	  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
	  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("*");
	  driver.findElement(By.id("createLeadForm_description")).sendKeys("ggggggg");
      

	  WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	  Select dropDownElements=new Select(dropDown);
	  dropDownElements.selectByVisibleText("Employee");
	  
	  WebElement dropDown1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
      Select dd1=new Select(dropDown1);
      dd1.selectByVisibleText("Computer Software");
      
      WebElement dropDown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
      Select dd2=new Select(dropDown2);
      dd2.selectByVisibleText("Partnership");
      
      WebElement dropDown3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
      Select dd3=new Select(dropDown3);
      dd3.selectByVisibleText("Automobile");
      
     driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("765034");
     
     driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kiruthickumaran@gmail.com");
     driver.findElement(By.xpath("//input[@name='generalToName']")).sendKeys("aaaa") ;
     driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("No.30 kpm");
     driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("namakkal");
     driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("765034");
     driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("5849933934");
    
     
     WebElement dropDown4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     Select dd4=new Select(dropDown4);
     dd4.selectByVisibleText("New York");
     
     driver.findElement(By.xpath("//input[@name='submitButton']")).click();
     driver.findElement(By.linkText("Edit")).click();
     driver.findElement(By.id("updateLeadForm_description")).clear();
     driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("no text");
     driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
    
     String title="View Lead";
     String title2=driver.getTitle();
	 System.out.println(title2);
	  
	  if (title2.contains(title)) {
		System.out.println("CreateLead created sucessfully");
	} else {
		System.out.println("CreateLead not created sucessfully");

	}
    
    
     
	  
}
}
