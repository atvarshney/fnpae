package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dAPage {
	public dAPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//input[@id='rNameId-1']")
	private WebElement EnterAddressName;
	
	@FindBy(id="rAddressId-1")
	private WebElement EnterAddress;
	
	@FindBy(id="rMobileId-1")
	private WebElement EnterMobileNum;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/form[1]/div[11]/button[2]/span[1]/span[1]")
	private WebElement ClickOnSaveAddress;
	
	
	@FindBy(xpath="//span[contains(text(),'PROCEED TO PAYMENT')]")
	private WebElement ClickOnProceedTOPayment;
	
	//div[@class='messageCard']/div/div/div//button/span
	@FindBy(xpath="//div[@class='messageCard']/div/div/div//button/span")
	private WebElement ClickOnOccasion;
	
	//div[@class='jss857 jss858']//ul/li
	@FindBy(xpath="//div[@class='jss857 jss858']//ul/li")
	private WebElement SelectMotherDayOccasion;
	

	@FindBy(xpath="//h5[normalize-space()='Free Message card']")
	private WebElement ClickOnFreeMessageCard;
	
	
	@FindBy(xpath="//div[@class='template-sec']/div[2]")
	private WebElement ClickOnSelectMessage;
	
	@FindBy(xpath="	//div[@class='template-sec']/div[2]/div//ul/li")
	private WebElement SelectMessage;
	
	//button[@id='save-card']
	
	
	@FindBy(xpath="//button[@id='save-card']//span/span")
	private WebElement ClickOnSaveCard;
	
	//div[@class='messageCard']//form/div
	
	@FindBy(xpath="//div[@class='messageCard']//form/div")
	private WebElement ClickOnCardEdit;
	
	//span[@id='sender-info-edit']
	@FindBy(xpath="//span[@id='sender-info-edit']")
	private WebElement ClickOnSenderDetailsEdit;
	//input[@id='senderName']
	
	@FindBy(xpath="//input[@id='senderName']")
	private WebElement UpdateSenderDetailsName;
	
	
	
	@FindBy(xpath="//button[@class='sender-save-btn']")
	private WebElement SenderSavebtn;
	
	@FindBy(xpath="//div[@class='message-card-form show']//div[2]/div/div/input")
	private WebElement EnterRecieverName;
	
	
	@FindBy(xpath="//div[@id='discount-coupon']")
	private WebElement ClickOnCoupon;
	
	
	
	@FindBy(xpath="//div[@id='coupon-sec']/div/div/input")
	private WebElement EnterCouponCode;
	
	//div[@id='coupon-sec']/div/button
	

	@FindBy(xpath="//div[@id='coupon-sec']/div/div/input")
	private WebElement clickOnSaveCoupon;
	
	//ul[@class='saved-address--list addAddress']/li/span
	
	@FindBy(xpath="//div[@id='coupon-sec']/div/div/input")
	private WebElement clickOnAddNewAddress;
	
	@FindBy(xpath="//div[@class='product-name-price']//button")
	private WebElement clickOnAddOnsButtonOnDAPage;
	
	@FindBy(xpath="//div[@class='saved-address--options']/p/span")
	private WebElement clickOnEditButtonOfExistingAdd;
	
	@FindBy(xpath="//input[@id='rAddressId-2']")
	private WebElement updateTheExistingAddress;
	
	@FindBy(xpath="//input[@id='rNameId-2']")
	private WebElement updateTheExistingName;
	
	
	public WebElement getEnterAddressName() {
		return EnterAddressName;
	}
	public WebElement getEnterAddress() {
		return EnterAddress;
	}
	public WebElement getEnterMobileNum() {
		
		return EnterMobileNum;
	}
	public WebElement getClickOnSaveAddress() {
		return ClickOnSaveAddress;
	}
	public WebElement getClickOnProceedTOPayment() {
		return ClickOnProceedTOPayment;
	}
	public WebElement getClickOnFreeMessageCard() {
		return ClickOnFreeMessageCard;
	}
	public WebElement getClickOnOccasion() {
		return ClickOnOccasion;
	}
	public WebElement getSelectMotherDayOccasion() {
		return SelectMotherDayOccasion;
	}
	public WebElement getClickOnSelectMessage() {
		return ClickOnSelectMessage;
	}
	public WebElement getSelectMessage() {
		return SelectMessage;
	}
	public WebElement getClickOnSaveCard() {
		return ClickOnSaveCard;
	}
	public WebElement getClickOnCardEdit() {
		return ClickOnCardEdit;
	}
	public WebElement getEnterRecieverName() {
		return EnterRecieverName;
	}
	public WebElement getClickOnSenderDetailsEdit() {
		return ClickOnSenderDetailsEdit;
	}
	public WebElement getUpdateSenderDetailsName() {
		return UpdateSenderDetailsName;
	}
	public WebElement getSenderSavebtn() {
		return SenderSavebtn;
	}
	public WebElement getClickOnCoupon() {
		return ClickOnCoupon;
	}
	public WebElement getEnterCouponCode() {
		return EnterCouponCode;
	}
	public WebElement getClickOnSaveCoupon() {
		return clickOnSaveCoupon;
	}
	public WebElement getClickOnAddNewAddress() {
		return clickOnAddNewAddress;
	}
	public WebElement getClickOnAddOnsButtonOnDAPage() {
		return clickOnAddOnsButtonOnDAPage;
	}
	public WebElement getClickOnEditButtonOfExistingAdd() {
		return clickOnEditButtonOfExistingAdd;
	}
	public WebElement getUpdateTheExistingAddress() {
		return updateTheExistingAddress;
	}
	public WebElement getUpdateTheExistingName() {
		return updateTheExistingName;
	}
	
	


}
