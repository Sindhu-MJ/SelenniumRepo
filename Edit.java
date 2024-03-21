package week8.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
	//findElement2.sendKeys("sindhu",);
	//findElement2.click();
	//findElement2.click();
}
}