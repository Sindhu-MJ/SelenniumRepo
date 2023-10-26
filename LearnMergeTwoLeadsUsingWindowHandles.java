package Interview;

import java.util.ArrayList;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class  LearnMergeTwoLeadsUsingWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> openHandles=new ArrayList<String>(windowHandles);
		driver.switchTo().window(openHandles.get(1));
	    String title=	driver.getTitle();
	    System.out.println(title);
	  Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    List<String> mainwindow=new ArrayList<String>(windowHandles2);
	    driver.switchTo().window(mainwindow.get(0));
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> nextwindow=new ArrayList<String>(windowHandles3);
		String title3 = driver.getTitle();
		System.out.println(title3);
		 Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(mainwindow.get(0));
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}
		
		
	}
