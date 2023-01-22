import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumintro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		// firefox launch
		//gecko driver download
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\shree\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		//webdriver driver= new firefoxdriver();
		
		//microsoft edgelaunch
		// driver download 
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\shree\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
				//webdriver driver= new edgedriver();
				
		driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());		
 	System.out.println("Heeloo Selenium");	
        System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
