package tek.sdet.framework.pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;


	@FindBy(xpath ="//a[text()='Account']")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	
	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement CasaOutDoor;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	public WebElement CartQtyBtn;
//	/option[@value='2']
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/select/option[@value='2']")
	public WebElement CartQty;
	
	@FindBy(id ="addToCartBtn")
	public WebElement addToCartBtn;
	
	@FindBy(id ="cartBtn")
	public WebElement cartQuantityIcon;
	
	@FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")
	public WebElement QtyConfirmation;
	
	@FindBy(id="proceedBtn")
	public WebElement ProceedBTN;
	
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtn;
	@FindBy(id ="countryDropdown")
	public WebElement Country;
	
	@FindBy(xpath ="//input[@id='fullNameInput']")
	public WebElement fullNameInput;
	
	@FindBy(id = ("phoneNumberInput"))
	public WebElement phoneNumber;
	
	@FindBy(id = ("streetInput"))
	public WebElement streetInput;
	
	
	@FindBy(xpath = ("//input[@id='apartmentInput']"))
	public WebElement Street2;
	
	
	@FindBy(id = ("cityInput"))
	public WebElement cityInput;
	
	@FindBy(name = ("state"))
	public WebElement state ;
	
	@FindBy(id = ("zipCodeInput"))
	public WebElement ZipCodeInput;
	
	@FindBy (id="addressBtn")
	public WebElement adressBtn;
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentBtn;
	@FindBy(id = "cardNumberInput")
	public WebElement cardNoField;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameField;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityField;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expiryMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expiryYear;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentBtn;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath="//div[contains(text(),'You have a card with this number. please use anoth')]")
	public WebElement OrderMessage;
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	public WebElement Electronics;
	
	@FindBy(xpath="//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement ApexLegends;
	
	
	
	
	
	
	

}
