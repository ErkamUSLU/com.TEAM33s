package tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


import java.util.Arrays;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US012 extends TestBaseRapor {
    static HomePage homepage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    public org.openqa.selenium.JavascriptExecutor JavascriptExecutor;
    JavascriptExecutor js = (JavascriptExecutor);
    SoftAssert softAssert = new SoftAssert();



    @Test(priority = -3)
    public void TC_001() throws InterruptedException {
        signInMethodForUS012();


        // actions.click(homepage.hesabimlinktext).perform();
        // homepage.hesabimlinktext.click();
        //  Thread.sleep(5000);
        Assert.assertTrue(homepage.zsiparislerKutusu.isDisplayed());
        homepage.zpanodakiSiparislerSekmesi.click();
        Assert.assertTrue(homepage.zspiarislerYazisi.isDisplayed());
        if (homepage.zsiparisTablosu.isDisplayed()){
            Assert.assertTrue(homepage.zsiparisTablosu.isDisplayed());
        }
    }
    @Test (dependsOnMethods ="TC_001" )
    public void TC_002(){
        homepage.zpanodakiIndirmelerSekmesi.click();
        Assert.assertTrue(homepage.zindirmelerYazisi.isDisplayed());
    }

    List<String> expectedFaturaTableData= Arrays.asList("Jennell Heaney",
            "denise.pacocha", "Apt. 701 9730 Klein Squares, Schuppeview, AR 62727-8038 Lithuania",
            "Bernierton, İstanbul", "Türkiye", "878292693", "1-258-338-6932");
    List<String> expectedGonderimTableData=Arrays.asList("Jennell Heaney",
            "denise.pacocha", "Apt. 701 9730 Klein Squares, Schuppeview, AR 62727-8038 Lithuania",
            "Bernierton, İstanbul", "Türkiye", "878292693");

    @Test (dependsOnMethods ="TC_001" )
    public void TC_003() throws InterruptedException {




        extentTest=extentReports.createTest("TC03_VendorAdreslerSayfasiniGorur",
                "Adresler; Daha once girilen fatura adresi ve gönderim adresi listelenmeli");

        extentTest.info("Tradylinn Hesabim sayfasina gidildi");
        homepage.zadresButton.click();
        extentTest.info("Adres butonuna click yapildi");
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("address"),
                "Actual Url \"adsress\" icermiyor, Adres sayfasi acilmadi");
        extentTest.pass("Actual Url \"address\" iceriyor, Adres sayfasi acildi");
        softAssert.assertTrue(homepage.zadresHead.isDisplayed(),"Adres basligi gorunmuyor");
        extentTest.pass("Adres basligi gorunuyor");
        softAssert.assertTrue(homepage.zadresHead.getText().contains("Adresler"),
                "Adres basligi \"Adresler\" icermiyor");
        extentTest.pass("Adres basligi \"Adresler\" iceriyor");
        softAssert.assertTrue(homepage.zfaturaAdresHead.isDisplayed(),"Fatura Adres basligi gorunmuyor");
        extentTest.pass("Fatura Adres basligi gorunuyor");
        for (String each : expectedFaturaTableData) {
            softAssert.assertTrue(homepage.zfaturaAdresTBody.getText().contains(each),
                    "Fatura Adresi Tablosu "+each+ " icermiyor");
            extentTest.pass("Fatura Adresi Tablosu "+each+" icermiyor");
        }
        softAssert.assertTrue(homepage.zgonderimAdresHead.isDisplayed(),
                "Gönderim adresi basligi gorunmuyor");
        extentTest.pass("Gönderim adresi basligi gorunuyor");

        for (String each : expectedGonderimTableData) {
            softAssert.assertTrue(homepage.zgonderimAdresTBody.getText().contains(each),
                    "Gonderim Adresi Tablosu "+each+" icermiyor");
            extentTest.pass("Gonderim Adresi Tablosu "+each+" icermiyor");
        }
        softAssert.assertAll();







    }
    public static void signInMethodForUS012() {
        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));
        homepage.zhesabimlinktext.click();
        homepage.zusernameBox.sendKeys(ConfigReader.getProperty("usermail"));
        homepage.zpassBox.sendKeys(ConfigReader.getProperty("userpass"));
        homepage.zsignInLoginButton.sendKeys(Keys.ENTER);


        waitFor(5);
    }

}