package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentPage {
	public paymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[normalize-space()='Cash On Delivery']")
	private WebElement SelectCODPaymentOptn;
	

	@FindBy(xpath="//div[@class='payment-options']/div[3]/div[6]")
	private WebElement ClickOnPayPal;
	
	@FindBy(xpath="//div[@class='relative amex-ezeclick-pay-btn']/button")
	private WebElement ClickOnBuy;
	
	//p[normalize-space()='Tamara: Split in 3, interest free']
	
	@FindBy(xpath="//div[@class='payment-options']/div[3]/div[4]/div")
	private WebElement ClickOnTamara;

	@FindBy(xpath="//div[@id='paypalPay']/div")
	private WebElement ClickOnPayPalCheckout;
	
	//input[@id='card-number--cc']
	@FindBy(xpath="//input[@id='card-number--cc']")
	private WebElement EnterCreditCardNumber;
	
	
	
	@FindBy(xpath="//input[@id='name-on-card--cc']")
	private WebElement EnterCreditCardName;
	
	
	//div[@class='card-form--selectwrapper relative select-month-wrapper select-field']/button/span
	
	@FindBy(xpath="//div[@class='card-form--selectwrapper relative select-month-wrapper select-field']/button/span")
	private WebElement clickOnmonth;
	
	//li[@value='01']
	@FindBy(xpath="//li[@value='01']")
	private WebElement SelectMonth;
	
	//div[@class='card-form--selectwrapper relative select-year-wrapper select-field']/button
	
	@FindBy(xpath="//div[@class='card-form--selectwrapper relative select-year-wrapper select-field']/button")
	private WebElement ClickOnYear;
	
	//li[@value='2024']
	@FindBy(xpath="//li[@value='2024']")
	private WebElement SelectYear;
	//input[@id='cvv-number--cc']
	@FindBy(xpath="//input[@id='cvv-number--cc']")
	private WebElement EnterCVV;
	//button[@id='card-form--cc']/span[2]
	@FindBy(xpath="	//button[@id='card-form--cc']/span[2]")
	private WebElement clickOnPay;
	
	
	//div[@class='columns proddetail giftaddons cartinfo']
	@FindBy(xpath="//div[@class='columns proddetail giftaddons cartinfo']")
	private WebElement ElementVisible;
	
	
	

	@FindBy(xpath="//div[@class='buttons-container']/div/div[1]")
	private WebElement clcikOnPayPalCheckoutButton;
	
	@FindBy(xpath="//div[@id='paypal-overlay-uid_b4a4ffa9a2_mta6mzy6mda']/a")
	private WebElement closePayPalPopupWindow;
	
	
	public WebElement getSelectCODPaymentOptn() {
		return SelectCODPaymentOptn;
	}


	public WebElement getClickOnBuy() {
		return ClickOnBuy;
	}


	public WebElement getClickOnPayPal() {
		return ClickOnPayPal;
	}


	public WebElement getClickOnPayPalCheckout() {
		return ClickOnPayPalCheckout;
	}


	public WebElement getClickOnTamara() {
		return ClickOnTamara;
	}


	public WebElement getEnterCreditCardNumber() {
		return EnterCreditCardNumber;
	}


	public WebElement getEnterCreditCardName() {
		return EnterCreditCardName;
	}


	public WebElement getClickOnmonth() {
		return clickOnmonth;
	}


	public WebElement getSelectMonth() {
		return SelectMonth;
	}


	public WebElement getClickOnYear() {
		return ClickOnYear;
	}


	public WebElement getSelectYear() {
		return SelectYear;
	}


	public WebElement getEnterCVV() {
		return EnterCVV;
	}


	public WebElement getClickOnPay() {
		return clickOnPay;
	}


	public WebElement getElementVisible() {
		return ElementVisible;
	}

	public WebElement getClosePayPalPopupWindow() {
		return closePayPalPopupWindow;
	}


	public WebElement getClcikOnPayPalCheckoutButton() {
		return clcikOnPayPalCheckoutButton;
	}


	
}
