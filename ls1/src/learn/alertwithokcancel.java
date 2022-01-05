package learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertwithokcancel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\automation software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Alertwith ok & cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		//System.out.println(driver.switchTo().alert().getText());
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
		Alert alt1=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		alt1.accept();
		Thread.sleep(3000);
		
		Alert alt2=driver.switchTo().alert();
		String altcnclmesg=driver.switchTo().alert().getText();
		System.out.println(altcnclmesg);
		alt2.dismiss();
		Thread.sleep(5000);
		
	}

}
