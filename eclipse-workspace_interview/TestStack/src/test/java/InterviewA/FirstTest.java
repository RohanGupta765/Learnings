package InterviewA;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@Test
	public void TestFlipkart() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement closeLogin = driver.findElement(By.xpath("//form[@autocomplete=\"on\"]//ancestor::div//button"));
		closeLogin.click();
		
		WebElement searchProduct = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
		searchProduct.sendKeys("Samsung Galaxy S10");
		searchProduct.sendKeys(Keys.ENTER);;
		
		WebElement categoryMob = driver.findElement(By.xpath("//a[@title='Mobiles' and text()='Mobiles']"));
		categoryMob.click();
		
		
		WebElement fkassured = driver.findElement(By.xpath("//span[@class='question']//parent::div//preceding-sibling::label"));
		fkassured.click();
		
		
		Thread.sleep(1000);
		WebElement sortHtoL = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		sortHtoL.click();
		Thread.sleep(1000);
		
		List<WebElement> listedNames = driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div/div[1]/div[1]"));
		List<WebElement>  listedPrice = driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div/div[2]//div[1]/div/div[1]"));
		List<WebElement>  listedLink = driver.findElements(By.xpath("//div[@class='MIXNux']/parent::a"));
		System.out.println(listedNames.size());
		
		WebElement recordCount = driver.findElement(By.xpath("//a[text()='Home']//ancestor::div[2]//following-sibling::span"));
		String recordCounttext = recordCount.getText();
		String[] recordCounttext2 = recordCounttext.split("–");
		Integer productsCount = Integer.valueOf((recordCounttext2[1].substring(0,3).trim()));
		System.out.println(productsCount);	
		List<String> listedProductNames = listedNames.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> listedProductPrice = listedPrice.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> listedProductLink = listedLink.stream().map(s->s.getAttribute("href")).collect(Collectors.toList());

		for(int i=0; i<productsCount;i++)
		{
			System.out.println(" **PRODUCTName**: "+listedProductNames.get(i)+" **PRODUCTPrice**: "+listedProductPrice.get(i)+ " **PRODUCTLink**: "+listedProductLink.get(i));;
		}
//		Thread.sleep(3000);
		driver.quit();

	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement closeLogin = driver.findElement(By.xpath("//form[@autocomplete=\"on\"]//ancestor::div//button"));
		closeLogin.click();
		
		WebElement searchProduct = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
		searchProduct.sendKeys("Samsung Galaxy S10");
		searchProduct.sendKeys(Keys.ENTER);;
		
		WebElement categoryMob = driver.findElement(By.xpath("//a[@title='Mobiles' and text()='Mobiles']"));
		categoryMob.click();
		
		
		WebElement fkassured = driver.findElement(By.xpath("//span[@class='question']//parent::div//preceding-sibling::label"));
		fkassured.click();
		
		
		Thread.sleep(1000);
		WebElement sortHtoL = driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		sortHtoL.click();
		Thread.sleep(1000);
		
		List<WebElement> listedNames = driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div/div[1]/div[1]"));
		List<WebElement>  listedPrice = driver.findElements(By.xpath("//div[@class='MIXNux']/following-sibling::div/div[2]//div[1]/div/div[1]"));
		List<WebElement>  listedLink = driver.findElements(By.xpath("//div[@class='MIXNux']/parent::a"));
		System.out.println(listedNames.size());
		
		WebElement recordCount = driver.findElement(By.xpath("//a[text()='Home']//ancestor::div[2]//following-sibling::span"));
		String recordCounttext = recordCount.getText();
		String[] recordCounttext2 = recordCounttext.split("–");
		Integer productsCount = Integer.valueOf((recordCounttext2[1].substring(0,3).trim()));
		System.out.println(productsCount);	
		List<String> listedProductNames = listedNames.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> listedProductPrice = listedPrice.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> listedProductLink = listedLink.stream().map(s->s.getAttribute("href")).collect(Collectors.toList());

		for(int i=0; i<productsCount;i++)
		{
			System.out.println(" **PRODUCTName**: "+listedProductNames.get(i)+" **PRODUCTPrice**: "+listedProductPrice.get(i)+ " **PRODUCTLink**: "+listedProductLink.get(i));;
		}
//		Thread.sleep(3000);
		driver.quit();

	}

}
