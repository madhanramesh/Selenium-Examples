package excelapache;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Buttons {
	ChromeDriver driver;
	@Test()
	public void edit() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Button.html");
	WebElement butt=	driver.findElement(By.id("home"));
	butt.click();
		WebElement elle = driver.findElement(By .id("position"));
	Point 	 pointposition=elle.getLocation();
	//Point pointposition= elle.getLocation();
int x =	pointposition.getX();
int y=	pointposition.getY();
System.out.println(x);
System.out.println(y);
WebElement colorsss = driver.findElement(By .id("col"
		+ "or"));
 String coors=colorsss.getCssValue("background-color");
//String coors =colorsss.getCssValue("background-color");

System.out.println(coors);
WebElement sssize = driver.findElement(By .id("size"));
int c =sssize.getSize().getHeight();
int v =sssize.getSize().getWidth();
System.out.println("height:" +c+ "width:"+v);
		driver.close();
	}}
