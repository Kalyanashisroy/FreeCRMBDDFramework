package CRMStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32_83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
	}

	@When("^title of login page is free CRM$")
	public void title_of_login_page_is_free_CRM() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("Kalyanashis");
		driver.findElement(By.name("password")).sendKeys("Kalyan@123");

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", loginbutton);
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Home page title: "+title);
		Assert.assertEquals("CRMPRO", title);

	}

}
