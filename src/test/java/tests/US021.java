package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US021 {
    @Test
    public void test21() throws InterruptedException {
        //US021_Store manager olarak satis raporlarının incelenmesi
        //Yillik rakamlar, en son ay, icinde bulunan ay, en son 7 gun
        //Veya specific bir tarih araligi secilebilmeli

        HomePage homePage = new HomePage();
        //tradylin sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));
        //giris yap secenegine tıklar
        homePage.girisYap1.click();
        Thread.sleep(3000);
        //mail adresi ve pasword kutusuna gecerli mail adresi ve passwordu girer
        homePage.emailBox.sendKeys(ConfigReader.getProperty("tradylinnValidEmail"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("tradylinnValidPassword") + Keys.ENTER);
        Thread.sleep(20000);
        //hesabım sayfasına girer
        homePage.hesabım.click();
        //store manager sayfasına girer
        homePage.storeManager.click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        //sol kosede yer alan seceneklerden raporlar secenegine tıklar
        homePage.raporlar.click();
        Thread.sleep(2000);
        //tek tek tabloların goruntulendigini test eder ve bilgileri yazdırır

        //yıllık tabloyu göruntulendigini test eder ve bilgileri yazdırır
        homePage.raporlarYear.click();
        System.out.println("raporlaryear: " + homePage.raporlarTablo.getText());
        Assert.assertTrue(homePage.raporlarTablo.isDisplayed());
        Thread.sleep(2000);

        homePage.raporlarlastMonth.click();
        System.out.println("raporlarlastMonth: " + homePage.raporlarlastMonth.getText());
        Assert.assertTrue(homePage.raporlarlastMonth.isDisplayed());
        Thread.sleep(2000);

        //ıcınde bulunan aydakı tabloyu göruntulendigini test eder ve bilgileri yazdırır
        homePage.raporlarthisMonth.click();
        System.out.println("raporlarthisMonth: " + homePage.raporlarTablo.getText());
        Assert.assertTrue(homePage.raporlarTablo.isDisplayed());
        //en son 7 gundeki tabloyu göruntulendigini test eder ve bilgilerini yazdırır
        Thread.sleep(2000);
        homePage.raprlarlast7Days.click();
        System.out.println("raporlarLast7days: " + homePage.raporlarTablo.getText());
        Assert.assertTrue(homePage.raprlarlast7Days.isDisplayed());
        Thread.sleep(2000);
        //custom kutusuna tıklar
        homePage.custom.click();
        //ve spesifik bir tarih aralıgı secer
        homePage.custom.sendKeys("2022-06-30 to 2022-07-06");
        System.out.println("custom degeri : " + homePage.custom.getText());
        //custom kutusunu kapatır
        homePage.close.click();
        Driver.closeDriver();


    }
}
