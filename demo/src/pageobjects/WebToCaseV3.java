package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="WebToCaseV3"                                
     , summary=""
     , relativeUrl=""
     , connection="WebToCas"
     )             
public class WebToCaseV3 {

	@TextType()
	@FindByLabel(label = "POCAutoCase LastCase")
	public WebElement contactName;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Phone']")
	public WebElement phone;
	@ChoiceListType(values = { @ChoiceListValue(value = "High"), @ChoiceListValue(value = "Medium"),
			@ChoiceListValue(value = "Low") })
	@FindByLabel(label = "Priority")
	public WebElement priority;
	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject;
	@FindBy(name = "submit")
	@ButtonType()
	public WebElement Submitbutton;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New Account']")
	public WebElement newAccount;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//input[@id='input-117']")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[@id='Account']")
	public WebElement accounts;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales Console']")
	public WebElement salesConsole;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[@id='activityTab__item']")
	public WebElement activity;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='Log a Call']")
	public WebElement actionsComposer0065G000005ZZomAAE;
	@TextType()
	@FindBy(xpath = "//input[@id='input-124']")
	public WebElement searchAppsAndItems1;
	@LinkType()
	@FindBy(xpath = "//a[@id='Case']")
	public WebElement cases;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement new_;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='WebSecondWebCases']/div[1]/span")
	public WebElement webWebCases;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='New Contact']")
	public WebElement contactName1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Mr.']")
	public WebElement salutation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='First Name']/following-sibling::input")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Last Name*']/following-sibling::input")
	public WebElement lastName;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Installation']")
	public WebElement caseReason;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='GC1040']")
	public WebElement product;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Mechanical']")
	public WebElement type;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Description']/following-sibling::textarea")
	public WebElement description;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='New']/slot[@name='outputField']/slot/lightning-formatted-text")
	public WebElement status;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='window']")
	public WebElement contactName2;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='relatedListsTab__item']")
	public WebElement related;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//force-highlights-details-item[2]//p[2]/slot/lightning-formatted-text")
	public WebElement status1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Edit']")
	public WebElement edit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-574']")
	public WebElement status2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Working']/slot[@name='outputField']/slot/lightning-formatted-text")
	public WebElement status3;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[3]//div/div/div[1]/div/div/div[3]/div")
	public WebElement contactName3;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Contact Name']/following-sibling::div//input")
	public WebElement value;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Mr.']")
	public WebElement mr;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[3]/div[2]//a[normalize-space(.)='--None--']")
	public WebElement caseOrigin;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[6]//a[normalize-space(.)='--None--']")
	public WebElement type1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Mechanical']")
	public WebElement mechanical;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[5]//a[normalize-space(.)='--None--']")
	public WebElement product1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='GC1040']")
	public WebElement gC1040;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//div[4]//a[normalize-space(.)='--None--']")
	public WebElement caseReason1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Installation']")
	public WebElement installation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-643']")
	public WebElement status4;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Working']")
	public WebElement status5;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//fieldset//a[normalize-space(.)='--None--']")
	public WebElement salutation1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@id='input-522' and @aria-haspopup='listbox']")
	public WebElement status6;
	@TextType()
	@FindBy(xpath = "//div[@class=\"slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right\"]//following::input[@aria-haspopup=\"listbox\"]")
	public WebElement status7;
	@TextType()
	@FindBy(xpath = "//*[text()='New']")
	public WebElement status8;
			
}
