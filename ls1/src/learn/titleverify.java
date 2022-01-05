package learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleverify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		String expectedl1="http://demowebshop.tricentis.com/login";
		String actuall1=driver.getCurrentUrl();
		if(actuall1.equals(expectedl1)) {
			System.out.println("you are the right page");
		}
		else
		{
			System.out.println("you are the wrong page");

		}
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
		//driver.close();



	}

}
