package automations.fundamentos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automations.pom.Base;

public class RegisterPage extends Base {
	
	//Variables globales
	private WebDriver driver;
	By register = By.cssSelector("[href=\"register.php\"]");
	By email = By.name("email");
	By contrase�a = By.name("password");
	By confirmarContrase�a = By.name("confirmPassword");
	By btnRegister = By.name("submit");
	By conformarRegistro = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b");

	public void RegisterUser() throws InterruptedException {
		if (isDisplayed(register)) {
			click(register);
			Thread.sleep(3000);
			type("Endo", email);
			type("12345", contrase�a);
			type("12345", confirmarContrase�a);
			click(btnRegister);

		}else {
			System.out.println("Register page not fount");
		}
	}
	
	public String messageRegister() {
		return getText(confirmarContrase�a);
	}
}
