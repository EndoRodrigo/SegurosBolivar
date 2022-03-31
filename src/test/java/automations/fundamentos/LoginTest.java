package automations.fundamentos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	//Variables globales
	private WebDriver driver;
	By register = By.cssSelector("[href=\"register.php\"]");
	By email = By.name("email");
	By contraseña = By.name("password");
	By confirmarContraseña = By.name("confirmPassword");
	By btnRegister = By.name("submit");
	By conformarRegistro = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void RegisterUser() throws InterruptedException {
		
		if (driver.findElement(register).isDisplayed()) {
			driver.findElement(register).click();
			Thread.sleep(3000);
			driver.findElement(email).sendKeys("endo");
			driver.findElement(contraseña).sendKeys("12345");
			driver.findElement(confirmarContraseña).sendKeys("12345");
			driver.findElement(btnRegister).click();
			
			assertEquals("Note: Your user name is endo.",driver.findElement(conformarRegistro).getText());
		} else {
			System.out.println("Pagina no encontrada");
		}

	}
	


}
