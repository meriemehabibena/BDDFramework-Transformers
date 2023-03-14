package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	 
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
	}
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("user clicked on All section");
	}
	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {

		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
		logger.info("actual is equal to expected");
		}

	@When("User on {string}")
		public void userOnElectronics(String department) {
			List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
			for (WebElement option : sideBarOptions) {
				if (option.getText().equals(department)) {
					click(option);
					try {
						logger.info(option.getText() + " is present ");
					} catch (StaleElementReferenceException e) {
					}
					break;
				}
			}
		}

		@Then("below options are present in department")
		public void belowOptionsArePresentInDepartment(DataTable dataTable) {
			List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
			List<WebElement> actualDepartmentOptions = factory.homePage().sideBarElements;
			for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
				for (WebElement dept : actualDepartmentOptions) {
					if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
						Assert.assertTrue(isElementDisplayed(dept));
						logger.info(dept.getText() + " is present ");
					}}}
			
		}@When("User change the category to {string}")
		public void user_change_the_category_to(String string) throws InterruptedException {
			selectByVisibleText(factory.homePage().allDepartmentDropDown, string); 
			Thread.sleep(2000);
		    
	    }
		@When("User search for an item {string}")
		public void user_search_for_an_item(String string) throws InterruptedException {
		    factory.homePage().searchBar.sendKeys(string);
		    Thread.sleep(2000);
		}

		@When("User click on Search icon")
		public void user_click_on_search_icon() throws InterruptedException {
		    factory.homePage().searchButton.click();
		    Thread.sleep(2000);
		}

		@When("User click on item")
		public void user_click_on_item() throws InterruptedException {
			
			if(factory.homePage().ApexLegends.isDisplayed())
				factory.homePage().ApexLegends.click();
			else if (factory.homePage().CasaOutDoor.isDisplayed())
				factory.homePage().CasaOutDoor.click();
			Thread.sleep(2000);
		    
		}

		@When("User select quantity ‘{int}’")
		public void user_select_quantity(Integer int1) throws InterruptedException {
			factory.homePage().CartQtyBtn.click();
			selectByVisibleText(factory.homePage().CartQtyBtn,int1.toString());
			Thread.sleep(2000);
		    
		}

		@When("User click add to Cart button")
		public void user_click_add_to_cart_button() throws InterruptedException {
			factory.homePage().addToCartBtn.click();
			Thread.sleep(2000);
		   
		}
		@Then("the cart icon quantity should change to ‘{int}’")
		public void the_cart_icon_quantity_should_change_to(Integer int1) throws InterruptedException {
			factory.homePage().cartQuantityIcon.click();
			
			Assert.assertEquals(int1.toString(), factory.homePage().QtyConfirmation.getAttribute("value"));
			Thread.sleep(2000);
		    
		}
		@Then("User click on Cart option")
		public void user_click_on_cart_option() throws InterruptedException {
		    factory.homePage().cartButton.click();
		    Thread.sleep(2000);
		}

		@Then("User click on Proceed to Checkout button")
		public void user_click_on_proceed_to_checkout_button() throws InterruptedException {
			factory.homePage().ProceedBTN.click();
		    Thread.sleep(2000);
		}

		@Then("User click Add a new address link for shipping address")
		public void user_click_add_a_new_address_link_for_shipping_address() throws InterruptedException {
		   factory.homePage().addAddressBtn.click();
		   Thread.sleep(2000);
		}

		@Then("User fill new address form with below information")
		public void user_fill_new_address_form_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
			selectByVisibleText(factory.homePage().Country,data.get(0).get("country"));
			sendText(factory.homePage().fullNameInput, data.get(0).get("fullName"));
			sendText(factory.homePage().phoneNumber , data.get(0).get("phoneNumber"));
			sendText(factory.homePage().streetInput , data.get(0).get("streetAddress"));
			sendText(factory.homePage().Street2 , data.get(0).get("apt"));
			sendText(factory.homePage().cityInput , data.get(0).get("city"));
			selectByVisibleText(factory.homePage().state,data.get(0).get("State"));
			sendText(factory.homePage().ZipCodeInput , data.get(0).get("ZipCode"));
			Thread.sleep(2000);
		}

		@Then("User click Add a credit card or Debit Card for Payment method")
		public void user_click_add_a_credit_card_or_debit_card_for_payment_method() throws InterruptedException {
		    factory.homePage().addPaymentBtn.click();
		    sendValueUsingJS(factory.homePage().cardNoField,"");
		    Thread.sleep(1000);
//			sendText(factory.homePage().cardNoField,"9876543212345678");
		    factory.homePage().nameField.sendKeys("");
		    Thread.sleep(1000);
//		    factory.homePage().nameField.sendKeys("Rai");
		    factory.homePage().expiryMonth.sendKeys("7");
		    factory.homePage().expiryYear.sendKeys("2026");
		    factory.homePage().securityField.sendKeys("");
		    Thread.sleep(1000);
//		    factory.homePage().securityField.sendKeys("321");
		    Thread.sleep(2000);
		    
		}

		@Then("User click on Place Your Order")
		public void user_click_on_place_your_order() throws InterruptedException {
		   factory.homePage().placeOrderBtn.click();
		   Thread.sleep(2000);
		}

		@Then("a message should be displayed ‘Order Placed, Thanks’")
		public void a_message_should_be_displayed_order_placed_thanks() throws InterruptedException {
			waitTillPresence(factory.homePage().OrderMessage);
			Assert.assertTrue(isElementDisplayed(factory.homePage().OrderMessage));
			logger.info("Order Placed, Thanks");
			Thread.sleep(2000);
		}
		@When("User change the category to 'Electronics")
		public void user_change_the_category_to_electronics() throws InterruptedException {
			selectByVisibleText(factory.homePage().allDepartmentDropDown, "Electronics"); 
			Thread.sleep(2000);
		}
}
