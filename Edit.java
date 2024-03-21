package week8.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Edit {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get(" https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Qeagle@123");
	driver.findElement(By.id("Login")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement findElement = driver.findElement(By.xpath("//span[@class='slds-truncate']/parent::a[@title='Accounts']"));
	driver.executeScript("arguments[0].click();", findElement);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down']/parent::a[@aria-haspopup='true'])[5]")).click();
	driver.findElement(By.xpath("(//div[text()='Edit'])[2]")).click();
	driver.findElement(By.xpath("(//label[text()='SLA']/following::button)[1]")).click();
	driver.findElement(By.xpath("//span[text()='Silver']")).click();

	// scroll upto the description 
	WebElement element6 = driver.findElement(By.xpath("//label[text()='Description']"));
	Actions builder5 = new Actions(driver);
	builder5.scrollToElement(element6).perform();
	
	// 14) Select Active as NO
	driver.findElement(By.xpath("(//label[text()='Active']/following::button)[1]")).click();
	driver.findElement(By.xpath("//span[text()='No']")).click();

	// 16)Select Upsell Oppurtunity as No
	driver.findElement(By.xpath("(//label[text()='Upsell Opportunity']/following::button)[1]")).click();
	driver.findElement(By.xpath("(//span[text()='No'])[1]")).click();

	// scroll upto rating
	WebElement element7 = driver.findElement(By.xpath("//label[text()='Rating']"));
	Actions builder6 = new Actions(driver);
	builder6.scrollToElement(element7).perform();
	Thread.sleep(3000);
	
	// 15) Enter Unique Number in Phone Field
	driver.findElement(By.xpath("//input[@name='Phone']")).clear();
	driver.findElement(By.xpath("//input[@name='Phone']")).sendKeys("7032356781");

	// 17)Click on save 
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	//verfiy Phone number
	String text = driver.findElement(By.xpath("//span[text()='(703) 235-6781']")).getText();
	System.out.println("The phone number is:" + text);
	//toclose the browser
	driver.close();
}


	//findElement2.sendKeys("sindhu",);
	//findElement2.click();
	//findElement2.click();
}
