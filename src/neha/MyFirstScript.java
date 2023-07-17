package neha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyFirstScript
{
	public static void main (String[]args) throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		
		//Thread.sleep(3000);
		//WebElement Services=driver.findElement(By.xpath("//a[text()='Services']"));
		//Thread.sleep(3000);
		//WebElement Shopify=driver.findElement(By.xpath("//a[text()='Shopify ']"));
		//Thread.sleep(3000);
		//WebElement Blog=driver.findElement(By.xpath("//a[text()='Blog ']"));
		//Thread.sleep(3000);
		//WebElement Careers=driver.findElement(By.xpath("//a[text()='Careers ']"));
		
		
		//Actions action=new Actions(driver);
		//action.moveToElement(Services).perform();
		//action.moveToElement(Shopify).perform();
		//action.moveToElement(Blog).perform();
		//action.moveToElement(Careers).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Jhon Medrick");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("JhonM123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone']")).sendKeys("8578902429");
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputFile")).sendKeys("C:\\Users\\hp\\Downloads\\sample.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div/div[7]/div/button[1]")).click();
		
	}

}
