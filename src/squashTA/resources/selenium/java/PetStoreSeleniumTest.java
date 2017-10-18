package org.squashtest.tutorial.Selenium;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetStoreSeleniumTest {
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		// First session of WebDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\Automatisation\\chromedriver.exe");
		driver = new ChromeDriver();
		// Goto guru99 site
		driver.get("http://localhost:8080/");
	}

	@Test
	public void testPetStoreSelenium() throws Exception {
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.xpath("//tr[5]/td/a/img")).click();
		driver.findElement(By.xpath("//tr[3]/td/b/a/font")).click();
		driver.findElement(By.xpath("//tr[3]/td[5]/a/img")).click();
		driver.findElement(By.xpath("//td[2]/center/a/img")).click();
		driver.findElement(By.xpath("//center[2]/a/img")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("j2ee");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("j2ee");
		driver.findElement(By.name("update")).click();
		driver.findElement(By.cssSelector("p > input[type=\"image\"]")).click();
		driver.findElement(By.xpath("//center[3]/a/img")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}
