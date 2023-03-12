package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup  {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy (id="nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement profilePhoneNumberField;
	
	@FindBy(xpath ="//button[text()='Update']")
	public WebElement profileUpdateButton;
	
	@FindBy(xpath="//div[text()='Personnal Information Update Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;
	
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPasswordField;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement newPasswordField;
	
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmPasswordField;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement SubmitBtn;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement UpdateBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement PasswordUpdated;
	
	@FindBy(id = "emailInput")
	public WebElement emailInput;
	
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement paymentMethodLink;
	
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
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentMessage;
		
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
	public WebElement EditLink ;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	public WebElement EditBtn ;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement RemovePayment;
	
	@FindBy(xpath = "//p[contains(text(),'Add Address')]")
	public WebElement clickAddressBTN;
	
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
	public WebElement addressBtn;
	
	@FindBy(xpath=("//div[contains(text(),'Address Added Successfully')]"))
	public WebElement AddressMessage;
	
	@FindBy(xpath= "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement AddressUpdate;
	
	@FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/button[1]")
	public WebElement Edit;
	
	@FindBy(xpath ="//button[contains(text(),'Remove')]")
	public WebElement RemoveBtn;
	
	}


