package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class US013 {
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
        HomePage.emailButon.sendKeys("qatestingtr1");
        HomePage.passwordButon.sendKeys("Vendor.12345!");
        HomePage.girisYap2.click();

        //Kullanıcı "Store Manager" butonuna tıklayarak Store Manager sayfasına gider
        page.storeManagerButon.click();
        //Kullanıcı Store Manager olarak "Kuponlar" butonuna tıklar
        page.coupons.click();
        //Kullanıcı Store Manager olarak "Add New Coupon" butonuna tıklar
        page.addNewCoupon.click();
        //Kullanıcı Store Manager olarak açılan menüde Code satırında Coupon Kodu yazar
        //Kullanıcı Store Manager olarak Description satırına tanımlama yazar
        action.click(page.couponCodeBox)
                .sendKeys("001")
                .sendKeys(Keys.TAB)
                .sendKeys("Sepette %5 indirim")
                .sendKeys(Keys.TAB)
                .perform();

        //Discount Type menüsünden herhangi bir seçeneği seçer
        WebElement dropDownMenu = Driver.getDriver().findElement(By.xpath("//select[@id='discount_type']"));
        Select select = new Select(dropDownMenu);
        select.selectByIndex(1);

        //Kullanıcı Store Manager olarak Coupon Amount miktarını girer
        action.click(page.couponAmount).sendKeys("1000")
                .sendKeys(Keys.TAB)
                .sendKeys("22-06-30").perform();

        //"Allow Free Shipping" checkboxa tıklar
        if (!page.checkBoxAllowFreeShipping.isSelected()) {
            ReusableMethods.clickWithJS(page.checkBoxAllowFreeShipping);
            Assert.assertTrue(page.checkBoxAllowFreeShipping.isEnabled());
        }
        //"Show on store" checkboxa tıklar
        if (!page.checkBoxShowOnStore.isSelected()) {
            ReusableMethods.clickWithJS(page.checkBoxShowOnStore);
            Assert.assertTrue(page.checkBoxShowOnStore.isEnabled());

        }

    }
}
