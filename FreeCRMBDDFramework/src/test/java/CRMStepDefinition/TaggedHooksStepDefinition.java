//package CRMStepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TaggedHooksStepDefinition {
//	//Global Hooks:
//	@Before(order=0)
//	public void setUp() {
//		System.out.println("Launch Chrome");
//		System.out.println("Enter URL for Free CRM APP");
//	}
//	
//	@After(order=0)
//	public void tearDown() {
//		System.out.println("Close the browser");
//	}
//	
//	@Before(order=1)
//	public void setUp1() {
//		System.out.println("Launch Chrome");
//		System.out.println("Enter URL for Free CRM APP");
//	}
//	
//	@After(order=1)
//	public void tearDown1() {
//		System.out.println("Close the browser");
//	}
//	
//	//Local-only for first scenario
//	@Before("@First")
//	public void beforefirst() {
//		System.out.println("before only first scenario");
//	}
//	//Local-only for first scenario
//	@After("@First")
//	public void afterfirst() {
//		System.out.println("after only first scenario");
//	}
//	@Before("@Second")
//	public void beforesecond() {
//		System.out.println("before only second scenario");
//	}
//	@After("@Second")
//	public void aftersecond() {
//		System.out.println("after only second scenario");		
//	}
//	@Before("@Third")
//	public void beforethird() {
//		System.out.println("before only third scenario");
//	}
//	@After("@Third")
//	public void afterthird() {
//		System.out.println("after only third scenario");
//	}
//	@Given("^this is the first step$")
//	public void this_is_the_first_step() throws Throwable {
//	    System.out.println("1st step");
//	}
//
//	@When("^this is the second step$")
//	public void this_is_the_second_step() throws Throwable {
//	    System.out.println("2nd step");
//	}
//
//	@Then("^this is the third step$")
//	public void this_is_the_third_step() throws Throwable {
//	    System.out.println("3rd step");
//	}
//
//}
