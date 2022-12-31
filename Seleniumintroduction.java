import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintroduction {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsfal\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tsfal\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		//Firefox

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tsfal\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

//		System.setProperty("webdriver.edge.driver", "C:\\Users\\tsfal\\OneDrive\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();
		
		

	}

}
