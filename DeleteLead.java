package week4.day2.Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
    public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().minimize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Find Leads")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.name("phoneCountryCode")).clear();
	driver.findElement(By.name("phoneCountryCode")).sendKeys("9");
	driver.findElement(By.name("phoneAreaCode")).sendKeys("1");
	driver.findElement(By.name("phoneNumber")).sendKeys("6369256036");
	driver.findElement(By.className("selected")).click();
	driver.findElement(By.xpath("//a[text()='10110']")).click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.name("id")).sendKeys("10110");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
    System.out.println(text);
    driver.close();
}
}