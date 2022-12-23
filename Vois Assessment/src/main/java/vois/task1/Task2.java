package vois.task1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
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
		driver.findElement(By.id("Forward90")).click();
		driver.findElement(By.name("passengerName")).sendKeys("mohab");
		driver.findElement(By.name("passengerAge")).sendKeys("29");
		driver.findElement(By.id("genderCodeIdForward0")).click();
		Select gender= new Select(driver.findElement(By.id("genderCodeIdForward0")));
		gender.selectByIndex(1);
		Select concession= new Select(driver.findElement(By.id("concessionIdsForward0")));
		concession.selectByIndex(1);
		driver.findElement(By.id("PgBtn")).click();
	}

}
