package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US014 {
    //test
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    HomePage page = new HomePage();
    Actions action = new Actions(Driver.getDriver());

    @Test
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("tradyLinnUrl"));
    }

    @Test
    public void stepLogin() {
        page.hesabimButon.click();
        page.emailButon.sendKeys("qatesting1");
        page.passwordButon.sendKeys("Vendor.12345!");
        page.girisYap2.click();

        //Kullanıcı "Store Manager" butonuna tıklayarak Store Manager sayfasına gider
        page.storeManagerButon.click();
        //Kullanıcı Store Manager olarak "Kuponlar" butonuna tıklar
        page.coupons.click();
        //Kullanıcı Store Manager olarak "Add New Coupon" butonuna tıklar
        page.addNewCoupon.click();

        page.couponCodeBox.sendKeys("Deneme2");
        //Kullanıcı Store Manager olarak Minimum Spend text boxa veri girişi yapar

        page.minimumSpendTexBox.sendKeys("50");

        page.maximumSpendTexBox.sendKeys("100");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("window.scrollBy(0,300)");

        ReusableMethods.waitFor(5);


        //Kullanıcı Store Manager olarak  "Individual use only " checkboxa tıklar
        if (!page.checkBoxAllowFreeShipping.isSelected()) {
            ReusableMethods.clickWithJS(page.checkBoxIndividualUseOnly);
            Assert.assertTrue(page.checkBoxAllowFreeShipping.isEnabled());
        }
        //Kullanıcı Store Manager olarak  "Exclude sale items " checkboxa tıklar
        if (!page.checkBoxExcludeSaleItems.isSelected()) {
            ReusableMethods.clickWithJS(page.checkBoxExcludeSaleItems);
            Assert.assertTrue(page.checkBoxExcludeSaleItems.isEnabled());
        }
        //Kullanıcı Store Manager olarak  "Exclude categories" tex boxa veri girişi yapar
        WebElement dropDownMenu = Driver.getDriver().findElement(By.xpath("//select[@id='exclude_product_categories']"));
        Select select = new Select(dropDownMenu);
        select.selectByVisibleText("Çok Satanlar");

        ReusableMethods.clickWithJS(page.submitButton);

        Assert.assertTrue(page.textMessage.isDisplayed());



    }
}
