import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SalesForce {
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
	driver.findElement(By.xpath("//div[text()='New']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("sindhu");
	Thread.sleep(3000);
	WebElement findElement3 = driver.findElement(By.xpath("//input[@aria-errormessage='help-message-320']"));
	Actions builder=new Actions(driver);
	builder.scrollToElement(findElement3).perform();
	
	
	
	driver.findElement(By.xpath("//label[text()='Ownership']//following::button")).click();
	 driver.findElement(By.xpath("//span[text()='Public']")).click();
	 driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	 WebElement findElement2 = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']"));
	 findElement2.getText();
	 System.out.println(findElement2);


	//	Select dropdown=new Select(findElement2);
	//dropdown.selectByVisibleText("public");
	}
	

}
