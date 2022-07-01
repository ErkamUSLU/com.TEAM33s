package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US003 extends TestBaseRapor {

    HomePage homePage = new HomePage();
    Actions actions;
    Select select;


    @Test
    public void test001() throws InterruptedException {
        extentTest = extentReports.createTest("US003", "Kullanici login olup basarili bir sekilde siparis verebilmeli");
        //Kullanici www.tradylinn.com adresine gider
        ReusableMethods.anaSayfayaGit();
        extentTest.info("Kullanici www.tradylinn.com adresine gidebildi");
        //Kullanici 'Hesabim' a tiklar
        homePage.hesabim.click();
        extentTest.info("Kullanici 'Hesabim' a tiklayabildi");
        //Kullanici adi veya E posta adresi kutusuna username i girer
        homePage.mailKutusu.sendKeys(ConfigReader.getProperty("validEMail"));
        extentTest.info("kullanici adi / E posta adresi kutusuna username girilebildi");
        //Parola kutusuna password u girer
        //"Giris yap butonuna tiklar"
        homePage.parolaKutusu.sendKeys(ConfigReader.getProperty("validPassword") + Keys.ENTER);
        extentTest.info("Parola kutusuna password girilebildi ve Giris yap butonuna tiklanabildi");
        //Orders a tiklar
        homePage.order1.click();
        extentTest.info("Kullanici Orders butonuna tiklayabildi");
        //Browse products a tiklar
        ReusableMethods.clickWithJS(homePage.alisVeriseDevam);
        extentTest.info("Browse products butonuna tiklayabildi");
        //stogu olan urun uzerine tiklar
        homePage.tShirt.click();
        extentTest.info("Kullanici stogu olan ilgili urun uzerine tiklayabildi");
        //Sepete ekle butonuna tiklar
        for (int i = 0; i < 5; i++) {
            ReusableMethods.clickWithJS(homePage.sepeteEkleButon);
            Thread.sleep(2000);
        }
        extentTest.info("Kullanici sectigi urunden bes adet sepete ekleyebildi");
        //Sepete tiklar
        ReusableMethods.clickWithJS(homePage.sepet);
        extentTest.info("Kullanici sepet butonuna tiklayabildi");
        //Go to payment page e tiklanir
        ReusableMethods.clickWithJS(homePage.odemeSayfasi);
        extentTest.info("Kullanici odeme sayfasi butonuna tiklayabildi");
        homePage.isimKutusu.clear();
        //Ad  kutusu tiklanir ve doldurulur
        homePage.isimKutusu.sendKeys("Emir");
        extentTest.info("Kullanici isim kutusuna ismini yazabildi");
        homePage.soyIsimKutusu.clear();
        //Soyad kutusu tiklanir ve doldurulur
        homePage.soyIsimKutusu.sendKeys("Ercik");
        extentTest.info("Kullanici soyisim kutusuna soyisimini yazabildi");
        homePage.firma.clear();
        //Firma adi  kutusu tiklanir ve doldurulur
        homePage.firma.sendKeys("TechPro");
        extentTest.info("Kullanici firma adi kutusuna firma adini yazabildi");
        homePage.adres1.clear();
        //sokak adresi  kutusu tiklanir ve doldurulur
        homePage.adres1.sendKeys("Tradylinn sok.");
        extentTest.info("Kullanici adres kutusuna adresini yazabildi");
        homePage.adres2.clear();
        //ikinci sokak adresi  kutusu tiklanir ve doldurulur
        homePage.adres2.sendKeys("Vip konut");
        extentTest.info("Kullanici ikinci adres kutusuna adresini yazabildi");
        homePage.postaKodu.clear();
        //Posta kodu  kutusu tiklanir ve doldurulur
        homePage.postaKodu.sendKeys("01000");
        extentTest.info("Kullanici posta kodu kutusuna posta kodunu yazabildi");
        homePage.ilce.clear();
        //Ilce / semt  kutusu tiklanir ve doldurulur
        homePage.ilce.sendKeys("Mezitli");
        extentTest.info("Kullanici ilce/semt kutusuna ilce bilgisini girebildi");
        select = new Select(homePage.ddm);
        select.selectByVisibleText("Mersin");
        extentTest.info("Kullanici sehir dropdown menusunden sehrini secebildi");
        homePage.telefon.clear();
        //Telefon  kutusu tiklanir ve doldurulur
        homePage.telefon.sendKeys("05305425698");
        extentTest.info("Kullanici telefon bilgisi kutusuna gsm numarasini yazabildi");
        homePage.eMail.clear();
        //E posta  kutusu tiklanir ve doldurulur
        homePage.eMail.sendKeys("team33@gmail.com");
        extentTest.info("Kullanici email bilgisi kutusuna emailini yazabildi");
        //Teslimat  kutusu tiklanir ve doldurulur
        homePage.teslimat.sendKeys("Adana");
        extentTest.info("Kullanici teslimat adresi kutusuna teslimat bilgisini girebildi");
        //Place (Confirm) Order a tiklanir
        ReusableMethods.clickWithJS(homePage.siparisOnay);
        extentTest.info("Kullanici siparis onay butonuna tiklayabildi");
        //Siparisin onaylandigi gorulur
       // extentTest.info("Kullanici siparisin onaylanmis oldugunu gorebildi");
        Assert.assertTrue(homePage.sipariOnayMetni.isDisplayed());
        extentTest.pass("Kullanici siparisin onaylanmis oldugunu gorebildi");
        //extentTest.pass("US003PASSED");

    }
}
