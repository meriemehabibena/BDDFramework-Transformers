package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	 POMFactory factory = new POMFactory();
	
@When("User click on Orders section")
public void user_click_on_orders_section() throws InterruptedException {
    factory.orderpage().orderBtn.click();
    Thread.sleep(2000);
}

@When("User click on first order in list")
public void user_click_on_first_order_in_list() throws InterruptedException {
    factory.orderpage().showDetailsBtn.isDisplayed();
    Thread.sleep(1000);
}

@When("User click on Cancel The Order button")
public void user_click_on_cancel_the_order_button() throws InterruptedException {
	factory.orderpage().cancelBtn.click();
	Thread.sleep(1000);
    
}

@When("User select the cancelation Reason ‘Bought wrong item")
public void user_select_the_cancelation_reason_bought_wrong_item() throws InterruptedException {
    selectByVisibleText(factory.orderpage().reasonDropDown,"Bought wrong item");
    Thread.sleep(1000);
}

@When("User click on Cancel Order button")
public void user_click_on_cancel_order_button() throws InterruptedException {
    factory.orderpage().ConfirmCancelBtn.click();
    Thread.sleep(1000);
}

@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
public void a_cancelation_message_should_be_displayed_your_order_has_been_cancelled() {
   factory.orderpage().CancelOrderMessage.isDisplayed();

}@When("User click on Return Items button")
public void user_click_on_return_items_button() throws InterruptedException {
    factory.orderpage().returnOrderBtn.click();
    Thread.sleep(1000);
}

@When("User select the Return Reason ‘Item damaged'")
public void user_select_the_return_reason_item_damaged() throws InterruptedException {
    selectByVisibleText(factory.orderpage().reasonDropDown,"Item damaged");
    Thread.sleep(1000);
}

@When("User select the drop off service ‘FedEx’")
public void user_select_the_drop_off_service_fed_ex() {
	selectByVisibleText(factory.orderpage().dropOffInput,"FedEx");
}

@When("User click on Return Order button")
public void user_click_on_return_order_button() throws InterruptedException {
    factory.orderpage().ConfirmCancelBtn.click();
    Thread.sleep(1000);
}

@Then("a cancelation message should be displayed ‘Return was successful’")
public void a_cancelation_message_should_be_displayed_return_was_successful() {
	factory.orderpage().ReturnSuccessfullBtn.isDisplayed();
}
@When("User click on Review button")
public void user_click_on_review_button() throws InterruptedException {
    factory.orderpage().ReviewBtn.click();
    Thread.sleep(1000);
}

@When("User write Review headline  {string} and {string}")
public void user_write_review_headline_and(String string, String string2) throws InterruptedException {
	factory.orderpage().headLine.sendKeys(string);
	factory.orderpage().Descricption.sendKeys(string2);
	
	Thread.sleep(1000);
	
}

@When("User click Add your Review button")
public void user_click_add_your_review_button() throws InterruptedException {
    factory.orderpage().ReviewSubmitBtn.click();
    Thread.sleep(1000);
}

@Then("a review message should be displayed ‘Your review was added successfully’")
public void a_review_message_should_be_displayed_your_review_was_added_successfully() throws InterruptedException {
	waitTillPresence(factory.orderpage().reviewMesageAddedSucc);
	Assert.assertTrue(isElementDisplayed(factory.orderpage().reviewMesageAddedSucc));
	logger.info("Your review was added successfully");
	Thread.sleep(1000);
}
}


