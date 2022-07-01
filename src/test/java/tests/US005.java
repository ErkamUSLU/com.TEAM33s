package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US005 {


        @Test
        public void test01() {
            HomePage homePage = new HomePage();
            ReusableMethods.anaSayfayaGit();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", homePage.hemenbasla);
            homePage.hesabim.click();
            homePage.email.sendKeys("batch59team33@gmail.com");
            homePage.Password.sendKeys("Huseyin1234!");
            homePage.Login.click();
            homePage.StoreManeger.click();
            homePage.Uruns.click();
            homePage.Status.isDisplayed();
            homePage.Stock.isDisplayed();
            homePage.Price.isDisplayed();
        }

        @Test
        public void test02() {
            HomePage homePage = new HomePage();
            ReusableMethods.anaSayfayaGit();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", homePage.hemenbasla);
            homePage.hesabim.click();
            homePage.email.sendKeys("batch59team33@gmail.com");
            homePage.Password.sendKeys("Huseyin1234!");
            homePage.Login.click();
            homePage.StoreManeger.click();
            homePage.Uruns.click();
            homePage.YeniEkle.click();
            homePage.Downloadable.click();
            homePage.Virtual.click();
        }

        @Test
        public void test03() {
            HomePage homePage = new HomePage();
            ReusableMethods.anaSayfayaGit();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", homePage.hemenbasla);
            homePage.hesabim.click();
            homePage.email.sendKeys("batch59team33@gmail.com");
            homePage.Password.sendKeys("Huseyin1234!");
            homePage.Login.click();
            homePage.StoreManeger.click();
            homePage.Uruns.click();
            homePage.YeniEkle.click();
            homePage.ProductTitle.sendKeys("Baslik");
            Actions actions = new Actions(Driver.getDriver());
            actions.click(homePage.ProductTitle).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("343").perform();
        }

        @Test
        public void test04() throws InterruptedException, AWTException {
            HomePage homePage = new HomePage();
            ReusableMethods.anaSayfayaGit();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", homePage.hemenbasla);
            homePage.hesabim.click();
            homePage.email.sendKeys("batch59team33@gmail.com");
            homePage.Password.sendKeys("Huseyin1234!");
            homePage.Login.click();
            homePage.StoreManeger.click();
            homePage.Uruns.click();
            homePage.YeniEkle.click();
            homePage.FotoTablo.click();
            homePage.DosyaSec.click();
            //1. resim yükleme

            homePage.ilkResim.click();


            jse.executeScript("window.scrollBy(0,200)");
            homePage.DosyaSec.click();
            Thread.sleep(2000);
            Robot rb = new Robot();

            Actions actions = new Actions(Driver.getDriver());

            StringSelection str = new
                    StringSelection("C:\\Users\\ERKAM USLU\\Desktop\\indir.png");


            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);

            Thread.sleep(10000);

            actions.moveToElement(homePage.secButonu).click(homePage.secButonu).perform();

        }

        @Test
        public void test05() {
            HomePage homePage = new HomePage();
            ReusableMethods.anaSayfayaGit();
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", homePage.hemenbasla);
            homePage.hesabim.click();
            homePage.email.sendKeys("batch59team33@gmail.com");
            homePage.Password.sendKeys("Huseyin1234!");
            homePage.Login.click();
            homePage.StoreManeger.click();
            homePage.Uruns.click();
            homePage.YeniEkle.click();
            JavascriptExecutor jsk = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", homePage.hemenbasla);
            Driver.getDriver().switchTo().frame(homePage.KisaAciklama);
            homePage.KisaAciklama.clear();
            homePage.KisaAciklama.sendKeys("KISACIK BISE YAZ");
            //Driver.getDriver().switchTo().frame(homePage.KisaAciklama);
            // homePage.UzunAciklama.sendKeys("UZUN BISE YAZ");

        }
    }
}
