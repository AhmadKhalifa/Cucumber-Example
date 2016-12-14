package stepDefs;

import org.junit.Assert;

import cucumber.MyFirefoxBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddStepDef {
	private MyFirefoxBrowser browser = new MyFirefoxBrowser();
	
	@Given("^open firefox and visit \"([^\"]*)\"$")
	public void open_firefox_and_visit(String URL) throws Throwable {
		browser.visit(URL);
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_and(String num1, String num2) throws Throwable {
		browser.setInputs(num1, num2);
	}

	@Then("^I should get \"([^\"]*)\"$")
	public void I_should_get(String expectedResult) throws Throwable {
		Assert.assertEquals(expectedResult, browser.getActualResultOutput());
	}
}
