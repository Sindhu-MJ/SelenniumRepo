package week4.day2.Assingment;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		//Launch the browser
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sindhu2309moorthy@gmail.com");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture name of First Resulting lead
		//LEAD ID.......11132
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='sindhu']]")).click(); 
		//Click Duplicate Lead
	//	driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//Click Create Lead
		//Confirm the duplicated lead name is same as captured name
		//Verify the title as 'Duplicate Lead'
		//String text = driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).getText();
		//System.out.println(text);
		//driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//Close the browser (Do not log out)
		//driver.close();
	}


}