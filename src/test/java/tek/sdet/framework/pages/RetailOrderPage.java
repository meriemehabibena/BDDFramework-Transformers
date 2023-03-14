package tek.sdet.framework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
		
		
		
	}
@FindBy (id = "orderLink")
public WebElement orderBtn;

@FindBy (xpath="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[2]")
public WebElement showDetailsBtn;

@FindBy(id="cancelBtn")
public WebElement cancelBtn;

@FindBy(id="reasonInput")
public WebElement reasonDropDown;

@FindBy(id="orderSubmitBtn")
public WebElement ConfirmCancelBtn;

@FindBy(xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
public WebElement CancelOrderMessage;

@FindBy(id="returnBtn")
public WebElement returnOrderBtn;

@FindBy(id="dropOffInput")
public WebElement dropOffInput;

@FindBy(xpath="//p[contains(text(),'Return was successfull')]")
public WebElement ReturnSuccessfullBtn;

@FindBy(id="reviewBtn")
public WebElement ReviewBtn;

@FindBy(id ="headlineInput")
public WebElement headLine;

@FindBy(id="descriptionInput")
public WebElement Descricption;

@FindBy(id="reviewSubmitBtn")
public WebElement ReviewSubmitBtn;


@FindBy(xpath =("//div[contains(text(),'Your review was added successfully')]"))
public WebElement reviewMesageAddedSucc;

	
}

