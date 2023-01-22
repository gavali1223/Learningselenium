import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class end2endbooking {

	public static void main(String[] args) throws Throwable {
		

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shree\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver();

				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.id("autosuggest")).sendKeys("ind");

				Thread.sleep(3000);

				List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));

				for (WebElement option : options) {
					if (option.getText().equalsIgnoreCase("India")) {
						option.click();
						break;
					}
				}

				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

				driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']"))
						.click();

				Thread.sleep(2000);

				driver.findElement(
						By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
				driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
				
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(3000);

				for (int i = 1; i < 5; i++)

				{
					driver.findElement(By.id("hrefIncAdt")).click();

				}

				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

			}

		}


