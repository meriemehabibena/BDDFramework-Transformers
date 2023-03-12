package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

		

		@Then("User profile information should be updated")
		public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountpage().personalInfoUpdateSuccessMessage);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().personalInfoUpdateSuccessMessage));
			logger.info("user profile information updated");
			
		}
//		@When("User enter email {string} and password'Tek@{int}'")
//		public void user_enter_email_and_password_tek(String string, Integer int1) {
//		    
//		
//		}

		@When("User enter below information")
		public void user_enter_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			Thread.sleep(2000);
		    List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		    factory.accountpage().previousPasswordField.sendKeys(data.get(0).get("previousPassword"));
		    Thread.sleep(2000);
		    factory.accountpage().newPasswordField.sendKeys(data.get(0).get("newPassword"));
		    Thread.sleep(2000);
		    factory.accountpage().confirmPasswordField.sendKeys(data.get(0).get("confirmPassword"));
		    Thread.sleep(2000);
		    
		    
		}

		@When("User click on Change Password button")
		public void user_click_on_change_password_button() throws InterruptedException {
		    factory.accountpage().SubmitBtn.click();
		    Thread.sleep(2000);
		}
		@Then("a message should be displayed ‘Password Updated Successfully’")
		public void a_message_should_be_displayed_password_updated_successfully() throws InterruptedException {
			Thread.sleep(2000);
			waitTillPresence(factory.accountpage().PasswordUpdated);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().PasswordUpdated));
			logger.info("Password Updated Successfully");
			Thread.sleep(2000);
		}
		@When("User enter email \\{string} and password \\{string}")
		public void user_enter_email_and_password() {
			
			factory.signInPage().emailField.sendKeys("habibena111@hotmail.com");
			factory.signInPage().passwordField.sendKeys("Amen2496$");
			
		}
	
		@When("User click on update button")
		public void user_click_on_update_button() {
			click(factory.accountpage().profileUpdateButton);
			logger.info("user clicked on Update button");
		    
		}
		@When("User click on Add a payment method link")
		public void user_click_on_add_a_payment_method_link() throws InterruptedException {
			factory.accountpage().paymentMethodLink.click();
			Thread.sleep(2000);
		    
		}

		@When("User fill Debit or credit card information")
		public void user_fill_debit_or_credit_card_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		    factory.accountpage().cardNoField.sendKeys(data.get(0).get("cardNumber"));
		    factory.accountpage().nameField.sendKeys(data.get(0).get("nameOnCard"));
		    factory.accountpage().expiryMonth.sendKeys(data.get(0).get("expirationMonth"));
		    factory.accountpage().expiryYear.sendKeys(data.get(0).get("expirationYear"));
		    factory.accountpage().securityField.sendKeys(data.get(0).get("securityCode"));
		    Thread.sleep(2000);
		    
		}

		@When("User click on Add your card button")
		public void user_click_on_add_your_card_button() throws InterruptedException {
			factory.accountpage().paymentBtn.click();
			Thread.sleep(2000);
		    
		}

		@Then("a message should be displayed ‘Payment Method added successfully’")
		public void a_message_should_be_displayed_payment_method_added_successfully() throws InterruptedException {
			waitTillPresence(factory.accountpage().paymentMessage);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().paymentMessage));
			logger.info("Payment Method added successfully");
			Thread.sleep(2000);
		    
		}
		@When("User click on Edit option of card section")
		public void user_click_on_edit_option_of_card_section() throws InterruptedException {
			factory.accountpage().EditLink.click();
			factory.accountpage().EditBtn.click();
			Thread.sleep(2000);
		    
		}

		@When("user edit information with below data")
		public void user_edit_information_with_below_data() throws InterruptedException {
			factory.accountpage().cardNoField.sendKeys("");
			factory.accountpage().cardNoField.sendKeys("1234567890123456");
		    factory.accountpage().nameField.sendKeys("");
		    factory.accountpage().nameField.sendKeys("Rai");
		    factory.accountpage().expiryMonth.sendKeys("7");
		    factory.accountpage().expiryYear.sendKeys("2026");
		    factory.accountpage().securityField.sendKeys("");
		    factory.accountpage().securityField.sendKeys("321");
		    Thread.sleep(2000);
		    
		}

		@When("user click on Update Your Card button")
		public void user_click_on_update_your_card_button() throws InterruptedException {
		    factory.accountpage().paymentBtn.click();
		    Thread.sleep(2000);
		    
		}

		@Then("a message should be displayed ‘Payment Method updated Successfully’")
		public void a_message_should_be_displayed_payment_method_updated_successfully() throws InterruptedException {
			waitTillPresence(factory.accountpage().paymentMessage);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().paymentMessage));
			logger.info("Payment Method added successfully");
			Thread.sleep(2000);
			
		}

		@When("User click on remove option of card section")
		public void user_click_on_remove_option_of_card_section() {
			factory.accountpage().EditLink.click();
			factory.accountpage().RemovePayment.click();
		    
		}

		@Then("payment details should be removed")
		public void payment_details_should_be_removed() {
		    factory.accountpage().cardNoField.isDisplayed();
		}
		@When("User click on Add address option")
		public void user_click_on_add_address_option() throws InterruptedException {
		    factory.accountpage().clickAddressBTN.click();
		    Thread.sleep(2000);
		}

		@When("user fill new address form with below information")
		public void user_fill_new_address_form_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
			selectByVisibleText(factory.accountpage().Country,data.get(0).get("country"));
			
			sendText(factory.accountpage().fullNameInput, data.get(0).get("fullName"));
			Thread.sleep(2000);
			sendText(factory.accountpage().phoneNumber , data.get(0).get("phoneNumber"));
			
			Thread.sleep(2000);
			sendText(factory.accountpage().streetInput , data.get(0).get("streetAddress"));
			
			
			Thread.sleep(2000);
			sendText(factory.accountpage().Street2 , data.get(0).get("apt"));
			
			
			Thread.sleep(2000);
			
			sendText(factory.accountpage().cityInput , data.get(0).get("city"));
			
			selectByVisibleText(factory.accountpage().state,data.get(0).get("State"));
			Thread.sleep(2000);
			
			
			sendText(factory.accountpage().ZipCodeInput , data.get(0).get("ZipCode"));
			Thread.sleep(2000);
			
		}

		@When("User click Add Your Address button")
		public void user_click_add_your_address_button() throws InterruptedException {
		    factory.accountpage().addressBtn.click();
		    Thread.sleep(2000);
		}

		@Then("a message should be displayed ‘Address Added Successfully’")
		public void a_message_should_be_displayed_address_added_successfully() throws InterruptedException {
			waitTillPresence(factory.accountpage().AddressMessage);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().AddressMessage));
			logger.info("Address Added Successfully");
			Thread.sleep(2000);
		}
		@When("User click on edit address option")
		public void user_click_on_edit_address_option() throws InterruptedException {
			factory.accountpage().Edit.click();
			Thread.sleep(2000);
			
			
		}

		@When("User click update Your Address button")
		public void user_click_update_your_address_button() throws InterruptedException {
			factory.accountpage().addressBtn.click();
			Thread.sleep(2000);
		    
		}
		@When("user fill existing address form with new information")
		public void user_fill_existing_address_form_with_new_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
			selectByVisibleText(factory.accountpage().Country,data.get(0).get("country"));
			sendValueUsingJS(factory.accountpage().fullNameInput , "");
			Thread.sleep(2000);
			sendText(factory.accountpage().fullNameInput, data.get(0).get("fullName"));
			sendValueUsingJS(factory.accountpage().phoneNumber , "");
			Thread.sleep(2000);
			sendValueUsingJS(factory.accountpage().phoneNumber , data.get(0).get("phoneNumber"));
			sendValueUsingJS(factory.accountpage().streetInput , "");
			Thread.sleep(2000);
			sendValueUsingJS(factory.accountpage().streetInput , data.get(0).get("streetAddress"));
			
			sendValueUsingJS(factory.accountpage().Street2 , "");
			Thread.sleep(2000);
			sendValueUsingJS(factory.accountpage().Street2 , data.get(0).get("apt"));
			
			sendValueUsingJS(factory.accountpage().cityInput , "");
			Thread.sleep(2000);
			
			sendValueUsingJS(factory.accountpage().cityInput , data.get(0).get("city"));
			
			selectByVisibleText(factory.accountpage().state,data.get(0).get("State"));
			Thread.sleep(2000);
			
			sendValueUsingJS(factory.accountpage().ZipCodeInput , "");
			sendValueUsingJS(factory.accountpage().ZipCodeInput , data.get(0).get("ZipCode"));
			Thread.sleep(2000);
			
		}
		

		@Then("a message should be displayed ‘Address Updated Successfully’")
		public void a_message_should_be_displayed_address_updated_successfully() throws InterruptedException {
			waitTillPresence(factory.accountpage().AddressUpdate);
			Assert.assertTrue(isElementDisplayed(factory.accountpage().AddressUpdate));
			logger.info("Address Added Successfully");
			Thread.sleep(2000);
		    
		}
		@When("User click on remove option of Address section")
		public void user_click_on_remove_option_of_address_section() throws InterruptedException {
			factory.accountpage().RemoveBtn.click();
			Thread.sleep(2000);
			
		}

		@Then("Address details should be removed")
		public void address_details_should_be_removed() {
		    System.out.println("Address Removing Successfull");
		}

		
	
}

