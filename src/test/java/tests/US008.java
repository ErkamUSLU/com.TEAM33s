package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

import static org.openqa.selenium.Keys.BACK_SPACE;

public class US008 extends TestBaseRapor {
    HomePage homePage = new HomePage();


    @Test
    public void test01() throws InterruptedException {
        extentTest = extentReports.createTest("Vendor Manage Stock Checkbox'ına gider ", " Checkbox'ın seçili olduğunu doğrular");
        ReusableMethods.anaSayfayaGit();
        extentTest.info("Anasayfaya gidildi");

        //hesabım butonuna tıklar
        homePage.hesabımButonu.click();
        extentTest.info("hesabım'a tıklandı");
        //mail kutusuna mailini girer
        homePage.usernameButton.sendKeys(ConfigReader.getProperty("mail"));
        extentTest.info("Mail girildi");
        // şifre kutusuna şifresini girer
        homePage.passwordButton.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Şifre girildi");
        //giriş tuşuna basar
        ReusableMethods.clickWithJS(homePage.entryButton);
        extentTest.info("Giriş tuşuna basıldı");
        //site berbat oluğu için ekstradan beklemek zorunda kalır
        Thread.sleep(5000);
        //store manager başlığına tıklar
        ReusableMethods.clickWithJS(homePage.storeManagerButton);
        extentTest.info("Store Manager başlığına tıklandı");
        //Ürün%s başlığına tıklar
        ReusableMethods.clickWithJS(homePage.urunSButton);
        extentTest.info("Ürün% s başlığına tıklandı");
        //Yeni ekle'ye basar
        ReusableMethods.clickWithJS(homePage.yeniEkleButton);
        extentTest.info("Yeni Ekle'ye bastı");
        // beklenen başlık budur
        String expectedButtontitle= "Manage Stock?";
        //aktif başlık budur
        String actualButtontitle= homePage.manageStockButtontitle.getText();
        //beklenen ile aktif başlığı karşılaştırır
        Assert.assertTrue(expectedButtontitle.contains(actualButtontitle));
        extentTest.info("Bkelenen Manage Stock başlığı ile aktif başlığın aynı olduğu doğrulandı");
        // manage Stock başlığına tıklar
        ReusableMethods.clickWithJS(homePage.manageStockButton);
        extentTest.info("Manage Stock Başlığına tıklandı");
        //================================TEST CASE 02========================================//
        // manage'ye tıkladıktan sonra altta Stock QTY başlığını görebildiğini doğrular
        System.out.println(homePage.stockQtyButton.isDisplayed());

        // stockQty tuşuna basar
        ReusableMethods.clickWithJS(homePage.stockQtyButton);

        // stock Qty kutusuna bir sayı girer
        homePage.stockQtyCheckbox.sendKeys(ConfigReader.getProperty("stockQTY"));

        //================================TEST CASE 03========================================//
        // AllowBackORders yazsının göründüğünü doğrular
        System.out.println(homePage.allowBackordersTitle.isDisplayed());
        WebElement allowBackorder = Driver.getDriver().findElement(By.id("backorders"));
        Select select01 = new Select(allowBackorder);
        List<WebElement> allowBackorderList = select01.getOptions();
        for(WebElement a:allowBackorderList){
            a.click();
            ReusableMethods.waitFor(2);
        }
        homePage.soldIndividuallyButton.click();

    }
}
