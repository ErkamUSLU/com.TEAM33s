package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US019 {
    @Test
    public void test19() throws InterruptedException {
        HomePage homePage = new HomePage();
        //tradylinn sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));
        //Giris yap butonuna tıklar
        homePage.girisYap1.click();
        Thread.sleep(2000);
        //mail kutusuna ve password kutusuna gecerli bilgileri girer
        homePage.emailBox.sendKeys(ConfigReader.getProperty("tradylinnValidEmail"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("tradylinnValidPassword") + Keys.ENTER);
        Thread.sleep(3000);
        //hesabım sayfasına girer
        homePage.hesabım.click();
        //store manager secenegine tıklar
        homePage.storeManager.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        //Takipciler secenegine tıklar
        homePage.takipcilertık.click();
        Thread.sleep(2000);
        //takipci bilgilerini yazdırır
        System.out.println("Takipci bilgisi: " + homePage.takipci.getText());
        Driver.closeDriver();

    }
}