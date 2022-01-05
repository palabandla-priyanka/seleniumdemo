package learn;


	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class chrome {

		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "C:\\automationsoftware\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "E:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\automation software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("selenium");
			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			

		}

	}
	


