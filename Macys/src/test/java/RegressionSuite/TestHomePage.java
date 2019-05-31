package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Homepage;

public class TestHomePage extends CommonAPI {
    Homepage homepage;

    @BeforeMethod
    public void initialize() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    // @Test
    public void macysBannerTest() {
        homepage.setMacysBanner();
    }

    //@Test
    public void inpitFieldTest() {
        homepage.setInputField();
    }

    // @Test
    public void macysEstelaudertest() {

        homepage.setMacysLauder();
    }

    //@Test
    public void macyscontact() {
        homepage.setMacysContact();
    }

    // @Test
    public void macysfaq() {
        homepage.setMacysfaq();
    }


    // @Test
    public void EnterValidUserName(String email, String pass) {
        homepage.setInputField();
    }


    // @Test
    public void textLinkStore() {
        homepage.setTextlinkStore();

    }

    // @Test
    public void textLinkDeals() {
        homepage.setTextlinkDeals();
    }
        // @Test
    public void textLinkReturn() {
        homepage.setGetReturn();
      }
      //@Test
    public void textLinkLocation() {
        homepage.setChangeLocation();
        }
      //@Test
    public void cardservice( ) {
        homepage.setCardservices();
      }
       // @Test
     public void creditapp() {
        homepage.setCreditApp();
        }
        //  @Test
    public void Storeandservice() {
        homepage.setStoreandService();
          }
      //@Test
     public void  Storeandevents() {
        homepage.StoreandEvents();
      }

}






