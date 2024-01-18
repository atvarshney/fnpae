package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myCartPage {
	public myCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='cartcontent']/div/ul/li/span/i")
	private WebElement clickOnDeleteIteam;
	
	@FindBy(id="del-yes")
	private WebElement ClickOnYes;
	
	public WebElement getClickOnDeleteIteam() {
		return clickOnDeleteIteam;
	}

	public WebElement getClickOnYes() {
		return ClickOnYes;
	}

}
