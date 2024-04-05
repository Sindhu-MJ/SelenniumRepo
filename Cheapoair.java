package Assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cheapoair {
	public static void main(String[] args) throws InterruptedException {
		//chrome launch
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cheapoair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//div[@class='modal-close-icon']")).click();
		//1.Click one Way
		driver.findElement(By.xpath("//label[text()='One Way']")).click();
		//2.click close button in from destination
		driver.findElement(By.xpath("//a[@class='suggestion-box__clear icon']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[@data-suggestion='MAA']")).click();
		//2.click close button in to destination
		driver.findElement(By.xpath("(//a[@class='suggestion-box__clear icon'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='to0']")).sendKeys("singapore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='suggestion-box__item ic-location is--focused  selected']")).click();
		//6.Enter depart date
		driver.findElement(By.xpath("//a[@aria-label='5 April 2024']")).click();
		//7.Select the passengers
		driver.findElement(By.xpath("//a[@class='form-control travelers-count ']")).click();
		driver.findElement(By.id("addadults")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		//8.Click Search flights
		driver.findElement(By.id("searchNow")).click();
		//9.Print the price from high to low
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='currency text-nowrap']"));
		for (int i = 0; i < findElements.size(); i++) {
			String replace = findElements.get(i).getText().replace("USD","");
			System.out.println(replace);
		}
		//10. Print the lowest price
		String[] price= {"141.86","131.27","163.89","238.26","232.45","210.23","416.76","210.23","272.49","596.46","282.28","286.06","290.76","213.46","283.57","256.08","273.23","256.08","272.8","236.36"};
        Arrays.sort(price);
        System.out.println(Arrays.toString(price));
        int length = price.length;
        System.out.println("lowest price is= "+price[0]);
	}
}