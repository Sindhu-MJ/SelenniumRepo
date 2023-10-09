package week4.day2.Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sindhu");
		driver.findElement(By.id("lastNameField")).sendKeys("moorthy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sindhu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("moorthy");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("testleaf course");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sindhu2309moorthy@gmail.com");
		WebElement DropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select DropDownbox=new Select( DropDown);
		DropDownbox.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(text);
	}

}
