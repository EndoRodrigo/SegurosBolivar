package segurosbolivar;

import static org.junit.Assert.*;


import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionLoginTest {

	//varibales globales
	private WebDriver driver;
	By usuario = By.name("input_1");
	By contraseña = By.name("input_2");
	By recordarDatos = By.name("input_3.1");
	By btnSing = By.id("gform_submit_button_0");
	By error = By.xpath("//*[@id=\"validation_message_0_2\"]/a");

	@Before
	public void setUp() throws Exception {
		
		//Inicializar el navegador
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dinersclub.es/prueba-login");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void AutenticacionFallida() {
		try {
			if (driver.findElement(usuario).isDisplayed()) {
				
				driver.findElement(usuario).sendKeys("Endo");
				driver.findElement(contraseña).sendKeys("Endo");
				//Thread.sleep(3000);  // no se recomienta usar esta funcion
				driver.findElement(btnSing).submit();
				
				String msgError = driver.findElement(error).getText();
				System.out.println(msgError);
				
				assertEquals("¿Perdiste tu contraseña",msgError);			
			}else {
				System.out.println("No se puede diligenciar formulario");
			}
		} catch (Exception e) {
			System.out.println("Page no fount");
		}
	}

}
