package automations.fundamentos;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	private WebDriver driver;

	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?hl=es");
	}
	
	
	@Test
	public void test() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Introducion a la automatizacion de pruebas de software");
		searchBox.submit();
		assertEquals("Introducion a la automatizacion de pruebas de software - Buscar con Google", driver.getTitle());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
