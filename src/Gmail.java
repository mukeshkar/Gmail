
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	//public WebDriver driver;
	
	public void openurl() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");	
	
	//}
	//public void login() {
		driver.findElement(By.id("identifierId")).sendKeys("karnati.mukesh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("11211234");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	}

	public static void main(String[] args) throws InterruptedException {
	
		Gmail myG = new Gmail();
		myG.openurl();
		//myG.signin();

	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
