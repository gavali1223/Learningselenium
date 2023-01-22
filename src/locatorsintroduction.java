import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsintroduction {
//selenium web driver locators 
	// as part of automation selenium performs actions( such as click ,typing)on the
	// page that is HTML Elemnts
	// locators are the way to indentify HTML elemnts on a web page selenium
	// webdriver uses any of the below
	// locatorsto identify the elemnts on the page and performs the action
	// (ID,XPATH,CSSSELCCTOR,NAME,CLASSNAME,TAGNAME,LINK TEXT,PARTIAL LINK TEXT)

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sahil");
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);//
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sahil");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sahil@gmsil.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("gavali@gmsil.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9657777777");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);//
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sahil");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}
}