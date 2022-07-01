package tests;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US001 {

    SoftAssert softAssert=new SoftAssert();
    HomePage homePage=new HomePage();
    @Test
    public void test001() throws InterruptedException {
        //Kullanici www.tradylinn.com adresine gider
        ReusableMethods.anaSayfayaGit();
        //Kullanici Uye Ol linkine tiklar
        homePage.uyeOl.click();
        //Kullanici Satici Ol butonuna tiklar
        homePage.saticiOl.click();
        //Registration Email, Pasword, Confirm Pasword gorulmeli
        softAssert.assertTrue(homePage.eMailKutusu.isDisplayed());
        softAssert.assertTrue(homePage.passwordKutusu.isDisplayed());
        softAssert.assertTrue(homePage.conPasswordKutusu.isDisplayed());
        //Email unique olmali(olumsuz senaryo izlendi)
        homePage.eMailKutusu.sendKeys(ConfigReader.getProperty("wrongEMail"));
        //Password ozel karakter ve rakam olmadan girilmeli(olumsuz senaryo izlendi)
        homePage.passwordKutusu.sendKeys(ConfigReader.getProperty("wrongPassword"));
        //Password ozel karakter ve rakam olmadan girilmeli(olumsuz senaryo izlendi)
        homePage.conPasswordKutusu.sendKeys(ConfigReader.getProperty("wrongPassword")+ Keys.ENTER);
        Thread.sleep(5000);
        //e mail ve password istenen ozellikte olmamasina ragmen hesap olusturlabildi
        //test FAILED
        softAssert.assertFalse(homePage.onayMetni.isDisplayed());
        softAssert.assertAll();
    }



}
