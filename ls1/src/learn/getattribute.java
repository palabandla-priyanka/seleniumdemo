package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\automation software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
WebElement usernameTxt=driver.findElement(By.id("login_field"));

if(usernameTxt.isDisplayed())
{
	if(usernameTxt.isEnabled()) {
		usernameTxt.sendKeys("priyanka");
		String enterdText=usernameTxt.getAttribute("value");
		System.out .println(enterdText);
		Thread.sleep(3000);
		usernameTxt.sendKeys("palabandla");
		usernameTxt.clear();
	}
	else
		System.out.println("username textbox is not enabled");
	
}
else
	System.out.println("username textbox is not displayed");
	}

}
