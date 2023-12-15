import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAmazon {
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver","/home/me/Documents/Drivers/geckodriver");
		//System.setProperty("webdriver.chromedriver.driver","/home/me/Documents/Drivers/chromedriver");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(1100, 100));
		Dimension dimension = new Dimension(2560, 1440);
		driver.manage().window().setSize(dimension);

		driver.get("https://www.amazon.com.br/");
		//Assert.assertEquals("Google",driver.getTitle());

		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("alexa");



		driver.quit();

	}

}
