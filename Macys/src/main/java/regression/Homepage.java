package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\'Layer_1\']")
    WebElement macysBanner;

    @FindBy(id = "globalSearchInputField")
    WebElement inputField;

    @FindBy(xpath = "//*[@id=\'footer-redesign-row-1-panels-container\']/div[1]/label/ul/li[2]/a")
    WebElement macysLauder;

    @FindBy(xpath = "//*[@id=\'footer-redesign-row-1-panels-container\']/div[1]/label/ul/li[6]/a")
    WebElement macysContact;

    @FindBy(xpath = "//*[@id=\'footer-redesign-row-1-panels-container\']/div[1]/label/ul/li[2]/a")
    WebElement macysfaq;

    @FindBy(xpath = "//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[1]/a")
    WebElement textlinkStore;

    @FindBy(xpath = "//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[2]/a")
    WebElement textlinkDeals;

    @FindBy(xpath = "//*[@id=\"header-wishlist-label\"]/a")
    WebElement getTextlinkDeals;

    @FindBy(xpath = "//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[5]/a")
    WebElement getWeddingRegistry;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[1]/label/ul/li[6]/a")

    WebElement getReturn;

    @FindBy(xpath = "//*[@id=\"href_changeCountry\"]")
    WebElement changeLocation;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[2]/label/ul/li[2]/a")
    WebElement cardservices;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[2]/label/ul/li[4]/a")
    WebElement cardBenefit;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[2]/label/ul/li[5]/a")
    WebElement creditApp;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[3]/label/ul/li[2]/a")
    WebElement storeandService;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[3]/label/ul/li[3]/a")
    WebElement locationandHour;

    @FindBy(xpath = "//*[@id=\"footer-redesign-row-1-panels-container\"]/div[3]/label/ul/li[4]/a")
    WebElement storeandEvents;


    public void setMacysBanner() {

        macysBanner.click();
    }

    public void setInputField() {

        inputField.sendKeys("shoes");
    }

    public void setMacysLauder() {

        macysLauder.click();
    }

    public void setMacysContact() {
        macysContact.click();
    }

    public void setMacysfaq() {
        macysfaq.click();
    }


    public void setTextlinkStore() {
        textlinkStore.click();

    }

    public void setTextlinkDeals() {
        textlinkDeals.click();

    }

    public void setGetReturn() {
        getReturn.click();
    }

    public void setChangeLocation() {
        changeLocation.click();

    }

    public void setCardservices() {
        cardservices.click();

    }

    public void setCardBenefit() {
        cardBenefit.click();

    }
      public void setCreditApp() {
        creditApp.click();
      }

     public void setStoreandService(){
        storeandService.click();
     }
       public void setLocationandHour(){
        locationandHour.click();
       }

      public void StoreandEvents(){
        storeandEvents.click();
      }
}








