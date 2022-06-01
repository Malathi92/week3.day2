package Week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//		1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).click();
		//	2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(2000);
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		//. Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
//		5. Print the count of the items Found. 
		System.out.println("the no bags: " +driver.findElement(By.xpath("//div[@class='length']")).getText());
//		6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> e=driver.findElements(By.className("brand"));
		System.out.println("size is" +e.size());
		for(WebElement w:e)
		{
			String s=w.getText();
			System.out.println(s);
		}
//		7. Get the list of names of the bags and print
		List<WebElement> f=driver.findElements(By.className("nameCls"));
		System.out.println("size is" +f.size());
		for(WebElement w:f)
		{
			String t=w.getText();
			System.out.println(t);
		}
		
		
		
		

	}
}





