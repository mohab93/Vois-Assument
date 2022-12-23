package vois.task1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testingframe {
	@Test
	public void testingtask1scenarior1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kasha\\eclipse-workspace\\task1\\drivers\\chromedriver.exe");
		// this section for first scenario  
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("car accessories");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div[2]/span/a/div/img")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// waiting for page to load 
		driver.findElement(By.linkText("Go to Cart")).click();
		driver.close();
	}
	@Test
	public void testingtask1scenario2() {
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
	
	@Test
	public void testingtask2(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kasha\\eclipse-workspace\\task1\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,450)", "");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.linkText( "Chikkamagaluru - Bengaluru")).click();
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.linkText("29")).click();
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div/div/div[2]/div[1]/div[1]/div[3]/div/input[4]")).click();
		driver.findElement(By.linkText("Dropping Point")).click();
		driver.findElement(By.id("Forward-1467467616730")).click();
		driver.findElement(By.name("mobileNo")).sendKeys("6789125987");
		driver.findElement(By.id("email")).sendKeys("moh.zanati@gmail.com");
		driver.findElement(By.id("Forward98")).click();// this should be put in while loop to search for available seat please adjust manual to see results 
		driver.findElement(By.name("passengerName")).sendKeys("mohab");
		driver.findElement(By.name("passengerAge")).sendKeys("29");
		driver.findElement(By.id("genderCodeIdForward0")).click();
		Select gender= new Select(driver.findElement(By.id("genderCodeIdForward0")));
		gender.selectByIndex(1);
		Select concession= new Select(driver.findElement(By.id("concessionIdsForward0")));
		concession.selectByIndex(1);
		driver.findElement(By.id("PgBtn")).click();
		driver.close();
	}
	
}
