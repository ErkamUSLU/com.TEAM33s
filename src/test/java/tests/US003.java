package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US003 {

    HomePage homePage=new HomePage();
    Actions actions;
    Select select;


    @Test
    public void test001() throws InterruptedException {
        //Kullanici www.tradylinn.com adresine gider
        ReusableMethods.anaSayfayaGit();

        //Kullanici 'Hesabim' a tiklar
        homePage.hesabim.click();

        //Kullanici adi veya E posta adresi kutusuna username i girer
        homePage.mailKutusu.sendKeys(ConfigReader.getProperty("validEMail"));

        //Parola kutusuna password u girer
        //"Giris yap butonuna tiklar"
        homePage.parolaKutusu.sendKeys(ConfigReader.getProperty("validPassword") + Keys.ENTER);

        //Orders a tiklar
        homePage.order1.click();

        //Browse products a tiklar
        ReusableMethods.clickWithJS(homePage.alisVeriseDevam);
        //stogu olan urun uzerine tiklar
        homePage.tShirt.click();
        //Sepete ekle butonuna tiklar
        for (int i = 0; i < 5; i++) {
            ReusableMethods.clickWithJS(homePage.sepeteEkleButon);
            Thread.sleep(2000);
        }
        //Sepete tiklar
        ReusableMethods.clickWithJS(homePage.sepet);
        //Go to payment page e tiklanir
        ReusableMethods.clickWithJS(homePage.odemeSayfasi);
        homePage.isimKutusu.clear();
        //Ad  kutusu tiklanir ve doldurulur
        homePage.isimKutusu.sendKeys("Emir");
        homePage.soyIsimKutusu.clear();
        //Soyad kutusu tiklanir ve doldurulur
        homePage.soyIsimKutusu.sendKeys("Ercik");
        homePage.firma.clear();
        //Firma adi  kutusu tiklanir ve doldurulur
        homePage.firma.sendKeys("TechPro");
        homePage.adres1.clear();
        //sokak adresi  kutusu tiklanir ve doldurulur
        homePage.adres1.sendKeys("Tradylinn sok.");
        homePage.adres2.clear();
        //ikinci sokak adresi  kutusu tiklanir ve doldurulur
        homePage.adres2.sendKeys("Vip konut");
        homePage.postaKodu.clear();
        //Posta kodu  kutusu tiklanir ve doldurulur
        homePage.postaKodu.sendKeys("01000");
        homePage.ilce.clear();
        //Ilce / semt  kutusu tiklanir ve doldurulur
        homePage.ilce.sendKeys("Mezitli");
        select=new Select(homePage.ddm);
        select.selectByVisibleText("Mersin");
        homePage.telefon.clear();
        //Telefon  kutusu tiklanir ve doldurulur
        homePage.telefon.sendKeys("05305425698");
        homePage.eMail.clear();
        //E posta  kutusu tiklanir ve doldurulur
        homePage.eMail.sendKeys("team33@gmail.com");
        //Teslimat  kutusu tiklanir ve doldurulur
        homePage.teslimat.sendKeys("Adana");
        //Place (Confirm) Order a tiklanir
        ReusableMethods.clickWithJS(homePage.siparisOnay);
        //Siparisin onaylandigi gorulur
        Assert.assertTrue(homePage.sipariOnayMetni.isDisplayed());




    }
}
