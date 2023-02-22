package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

		POMFactory factory = new POMFactory();

		@When("User click on Account option")
		public void userClickOnAccountOption() {
			click(factory.homePage().accountOption);
			logger.info("user clicked on Account option");
		}

		@When("User update Name {string} and Phone {string}")
		public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
			clearTextUsingSendKeys(factory.accountpage().profileNameInputField);
			sendText(factory.accountpage().profileNameInputField, nameValue);
			clearTextUsingSendKeys(factory.accountpage().profilePhoneNumberField);
			sendText(factory.accountpage().profilePhoneNumberField, phoneValue);
			logger.info("user updated Name and Phone values ");
		}

		@When("User click on Update button")
		public void userClickOnUpdateButton() {
			click(factory.accountpage().profileUpdateButton);
			logger.info("user clicked on Update button");

		}

		@Then("User profile information should be updated")
		public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountpage().personalInfoUpdateSuccessMessage);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().personalInfoUpdateSuccessMessage));
			logger.info("user profile information updated");
			
		}
		//@When("User on Electronics")
		//public void userOnElectronics() {
		    
	}

		

