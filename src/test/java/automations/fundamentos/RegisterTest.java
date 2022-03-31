package automations.fundamentos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RegisterTest {
	
	private RegisterPage registerPage = new RegisterPage();

	@Before
	public void setUp() throws Exception {
		registerPage.chromeDriverConnection();
		registerPage.visit("https://demo.guru99.com/test/newtours/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		registerPage.RegisterUser();
		assertEquals("Note: Your user name is endo.",registerPage.messageRegister());

	}

}
