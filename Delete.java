package week8.day3;

package week8.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Delete {
public static void main(String[] args) throws InterruptedException {
	//To disable notifications
	
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			//Launch the browser
			
			ChromeDriver driver = new ChromeDriver(options);
	      //Login to https://login.salesforce.com
			
			driver.get("https://login.salesforce.com");

			//To maximize the Browser
			driver.manage().window().maximize();
			
			//Add the implicitly wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Enter the username into UN field
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			
			//Enter the password to the PW field
			driver.findElement(By.id("password")).sendKeys("Qeagle@123");
			
			//click on login button
			driver.findElement(By.id("Login")).click();
			
			// 2. Click on toggle menu button from the left corner
			driver.findElement(By.className("slds-icon-waffle")).click();
			
			//Add Thread.sleep
			Thread.sleep(30);
			
			//3. Click view All 
			driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
			
			//4.click Sales from App Launcher
			driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[2]")).click();
			
			//5.Click on Accounts tab 
			WebElement findElement = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
			driver.executeScript("arguments[0].click();",findElement);
			
			//Add Thread.sleep
			Thread.sleep(30);
			
			// 7.Click on the displayed Account Dropdown icon and

			driver.findElement(By.xpath("(//a[contains(@class,'slds-button slds-button--icon-x-small')])[1]")).click();
             //8.Select Delete
			driver.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
			
			//to click delete
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
					
			
			 //Verify Whether account is Deleted using account Name"
		  String text1 = driver.findElement(By.xpath("//div[@role='alertdialog']")).getText();
		  System.out.println(text1);
		  
		  

			    //To close the browser 
			    driver.close(); 
}
}
