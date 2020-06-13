//package CRMStepDefinition;
//
//import java.util.List;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefinition {
//	WebDriver driver;
//	
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32_83\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://ui.freecrm.com/");
//	}
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//		String title = driver.getTitle();
//		System.out.println(title);
//		//Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) throws Throwable {
//		List<List<String>> data=credentials.raw();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(0));
//	}
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() throws Throwable {
//		/*WebElement loginbutton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].click();", loginbutton);*/
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	}
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		String title = driver.getTitle();
//		//WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Kalyan Roy')]"));
//		
//		System.out.println("Home page title: "+title);
//		Assert.assertEquals("Cogmento CRM", title);
//
//	}
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() throws Throwable {
//		driver.findElement(By.xpath("//span[text()='Deals']")).click();
//		driver.findElement(By.xpath("//button[text()='New']")).click();
//	    
//	}
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealData) throws Throwable {
//		List<List<String>> dealValues=dealData.raw();
//		driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//		driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//		driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//		driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	    driver.quit();
//	}
//
//
//}
