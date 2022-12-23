package vois.task1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kasha\\eclipse-workspace\\task1\\drivers\\chromedriver.exe");
		
		// this section for first scenario  
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
        WebElement sreach=driver.findElement(By.id("twotabsearchtextbox"));
		sreach.sendKeys("car accessories");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[2]/span/a/div/img")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// waiting for page to load 
		driver.findElement(By.linkText("Go to Cart")).click();
		driver.close();
		
		// this section for second scenario
		ChromeDriver driver2 = new ChromeDriver();
		driver2.navigate().to("https://www.amazon.com/");
		driver2.manage().window().maximize();	
		if(driver2.findElement(By.className("a-button-input")).isDisplayed() == true) {
				driver2.findElement(By.className("a-button-input")).click();
		}
		driver2.findElement(By.linkText("Today's Deals")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver2; 
		js.executeScript("window.scrollBy(0,450)", "");////scroll down to select headphone
		driver2.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[20]/label/input")).click();
		driver2.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[18]/label/input")).click();
		js.executeScript("window.scrollBy(0,1050)", "");//scroll down to select grocery
		driver2.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span")).click();
		js.executeScript("window.scrollBy(0,2250)", "");
		driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//waiting for page to load
		driver2.findElement(By.linkText("3")).click();// click page 3 to view page 4
		driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//waiting for the to load 
		js.executeScript("window.scrollBy(0,3250)", "");
		driver2.findElement(By.linkText("4")).click();// click page 4
		js.executeScript("window.scrollBy(0,0)", "");
		driver2.findElement(By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div/img")).click();
		driver2.findElement(By.linkText("Add to List")).click();
		driver2.close();
		
	}
	

}
