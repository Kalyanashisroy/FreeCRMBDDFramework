//package CRMStepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	WebDriver driver;
//
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver_win32_83\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://ui.freecrm.com/");
//	}
//
//	@When("^title of login page is free CRM$")
//	public void title_of_login_page_is_free_CRM() throws Throwable {
//		String title = driver.getTitle();
//		System.out.println(title);
//		//Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//	}
//	//Reg exp
//	//1. \"([^\"]*)\"
//	//2.\"(.*?)\"
//	@Then("^user enter \"(.*?)\" and \"(.*?)\"$")
//	public void user_enter_username_and_password(String uname,String pass) throws Throwable {
//		driver.findElement(By.name("email")).sendKeys(uname);
//		driver.findElement(By.name("password")).sendKeys(pass);
//
//	}
//
//	@Then("^user click on login button$")
//	public void user_click_on_login_button() throws Throwable {
//		WebElement loginbutton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].click();", loginbutton);
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		String title = driver.getTitle();
//		//WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Kalyan Roy')]"));
//		
//		System.out.println("Home page title: "+title);
//		Assert.assertEquals("Cogmento CRM", title);
//
//	}
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//	   
//	}
//	@Then("^user enters contacts details\"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//	   
//	}	
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	    driver.quit();
//	}
//
//}
