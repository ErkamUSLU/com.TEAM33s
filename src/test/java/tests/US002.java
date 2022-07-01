package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US002 {

    HomePage homePage=new HomePage();

    @Test
    public void test001() {
        //Kullanici www.tradylinn.com adresine gider
        ReusableMethods.anaSayfayaGit();
        //Kullanici 'Hesabim' a tiklar
        homePage.hesabim.click();
        //Kullanici adi veya E posta adresi kutusuna username i girer
        homePage.mailKutusu.sendKeys(ConfigReader.getProperty("validEMail"));
        //Parola kutusuna password u girer
        //"Giris yap butonuna tiklar"
        homePage.parolaKutusu.sendKeys(ConfigReader.getProperty("validPassword") + Keys.ENTER);
    }

    @Test(dependsOnMethods = "test001")
    public void test002() {
        //My account yazisini gorur
        Assert.assertTrue(homePage.myAccount.isEnabled());
        //Orders yazisini gorur
        Assert.assertTrue(homePage.order1.isEnabled());
        //Downloads yazisini gorur
        Assert.assertTrue(homePage.downloads1.isDisplayed());
        //Addresses yazisini gorur
        Assert.assertTrue(homePage.addresses1.isDisplayed());
        //Account Details yazisini gorur
        Assert.assertTrue(homePage.accountDetails1.isDisplayed());
        //Whislist (My favorites) yazisini gorur
        Assert.assertTrue(homePage.whislist1.isDisplayed());
        //Logout(Exit) yazisini gorur
        Assert.assertTrue(homePage.logout1.isDisplayed());

    }
    @Test(dependsOnMethods = "test001")
    public void test003(){
        //Dashboard (Pano) altinda Store Manager gorur
        Assert.assertTrue(homePage.storeManager.isDisplayed());
        //Orders gorur
        Assert.assertTrue(homePage.order2.isDisplayed());
        //Downloads gorur
        Assert.assertTrue(homePage.downloads2.isDisplayed());
        //Addresses gorur
        Assert.assertTrue(homePage.addesses2.isDisplayed());
        //Account Details gorur
        Assert.assertTrue(homePage.accountDetails2.isDisplayed());
        //Appointments gorur
        Assert.assertTrue(homePage.appointments.isDisplayed());
        //Whislist (My favorites) gorur
        Assert.assertTrue(homePage.myFavorites.isDisplayed());
        //Support tickets (Requests) gorur
        Assert.assertTrue(homePage.supportRequests.isDisplayed());
        //Followings gorur
        Assert.assertTrue(homePage.followUp.isDisplayed());
        //Logout(Exit) gorur
        Assert.assertTrue(homePage.logout2.isDisplayed());

    }
}
