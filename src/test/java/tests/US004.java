package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US004 {
}

    @Test
    public void test_case01() {
        HomePage homePage = new HomePage();
        ReusableMethods.anaSayfayaGit();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.hemenbasla);
        homePage.hesabim.click();
        homePage.hesabim.click();
        homePage.email.sendKeys("batch59team33@gmail.com");
        homePage.Password.sendKeys("Huseyin1234!");
        homePage.Login.click();

    /*    //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
         homePage.ortakAdimlarMethodu();
        //11.Sepette ekledigi urunun gorundugunu test eder
        Assert.assertEquals(homePage.sepettekiUrunAdiText.getText(), homePage.expectedUrunAdi, "Sepete eklenen urunle sepetteki urun eslesmiyor.");
        //12.Urun fiyatinin goruntulendigini test eder
        Assert.assertTrue(homePage.sepettekiUrunFiyatElementi.isDisplayed());
        //13.Urun adedinin adedinin goruntulendigini test eder
        Assert.assertTrue(homePage.sepettekiUrunMiktariElementi.isDisplayed());
        //14.Ara toplamin goruntulendigini test eder
        Assert.assertTrue(homePage.sepetAraToplamFiyatElementi.isDisplayed());
        //15.Sayfayi kapatir
        Driver.closeDriver();
    }
    @Test
    public void test_case02() {
        HomePage homePage=new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11.Urun adedini artirmak icin ( + ) butonuna tiklar
        int artiButonunaTiklamadanOncekiDeger = Integer.parseInt(homePage.sepettekiUrunMiktariElementi.getAttribute("value"));
        homePage.sepetArtiButonu.click();
        //12.Urun adedinin arttigini test eder
        int artiButonuTiklandiktanSonrakiDeger = Integer.parseInt(homePage.sepettekiUrunMiktariElementi.getAttribute("value"));
        Assert.assertTrue(artiButonuTiklandiktanSonrakiDeger > artiButonunaTiklamadanOncekiDeger, "Urun adedi artmadi");
        //13.Urun adedini azaltmak icin ( - ) butonuna tiklar
        homePage.sepetEksiButonu.click();
        int eksiButonunaTikladiktanSonrakiDeger = Integer.parseInt(homePage.sepettekiUrunMiktariElementi.getAttribute("value"));
        //14.Urun adedinin azaldigini test eder
        Assert.assertTrue(eksiButonunaTikladiktanSonrakiDeger < artiButonuTiklandiktanSonrakiDeger, "Urun adedi azalmadi");
        Driver.closeDriver();
    }
    @Test
    public void test_case03() {
       HomePage homePage = new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11.Urune girilecek maksimum adedi girer
        String maxStokAdedi = homePage.sepettekiUrunMiktariElementi.getAttribute("max");
        homePage.sepettekiUrunMiktariElementi.sendKeys(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, maxStokAdedi);
        //12.Urun adedini artirmak icin ( + ) butonuna tiklar
        homePage.sepetArtiButonu.click();
        //13.Urun adedinin artmadigini test eder
        int artiButonuTiklandiktanSonrakiDeger = Integer.parseInt(homePage.sepettekiUrunMiktariElementi.getAttribute("value"));
        System.out.println("artiButonuTiklandiktanSonrakiDeger = " + artiButonuTiklandiktanSonrakiDeger);
        Assert.assertFalse(artiButonuTiklandiktanSonrakiDeger > Integer.parseInt(maxStokAdedi), "Stoktan fazla urun eklendi");
        Driver.closeDriver();
    }
    @Test
    public void test_case04() {
        HomePage homePage = new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11.Temizle butonuna tiklar
        homePage.sepettemizleButonu.click();
        //12. 'Sepetiniz şu anda boş.' Yazisinin goruntulendigini test eder
        String expectedText = "Sepetiniz şu anda boş.";
        String actualText = homePage.sepetinizSuAndaBosTexti.getText();
        Assert.assertEquals(actualText, expectedText, "sepet bosalmadi");
        //13.Sayfayi kapatir
        Driver.closeDriver();
    }
    @Test
    public void test_case05() {
        HomePage homePage = new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11. COUPON DİSCOUNT yazisinin goruntulendigini test eder
        Assert.assertTrue(homePage.couponDiscountText.isDisplayed());
        //12. Kupon kodu giris text box'inin enable oldugunu test eder
        Assert.assertTrue(homePage.couponKoduGirisTextBox.isEnabled());
        //13.Sayfayi kapatir
        Driver.closeDriver();
    }
    @Test
    public void test_case06() {
       HomePage homePage = new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11.Alisverise devam et butonunun goruntulendigini test eder
        Assert.assertTrue(homePage.alisveriseDevamEtButonu.isDisplayed(), "Alisverise devam et butonu goruntulenmedi");
        //12.Alisverise devam et butonunun aktif oldugunu test eder
        Assert.assertTrue(homePage.alisveriseDevamEtButonu.isEnabled(), "alisverise devam et butonu aktif degil");
        //13.Sayfayi kapatir
        Driver.closeDriver();
    }
    @Test
    public void test_case07() {
        HomePage homePage = new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11.Sag tarafta kargo bilgilerinin goruntulendigini test eder
        Assert.assertTrue(homePage.kargoBilgileriText.isDisplayed());
        //12. toplam fiyatin goruntulendigini test eder
        Assert.assertTrue(homePage.toplamFiyatElementi.isDisplayed());
        //13.Sayfayi kapatir
        Driver.closeDriver();
    }
    @Test
    public void case08() {
        HomePage homePage = new HomePage();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        //4.sepetim butonuna tiklar
        //5.Sepetteki urunu silmek icin (X) isaretine tiklar.
        //6.Hesabim Butonuna tiklar
        //7.Siparisler butonuna tiklar
        //8.Urunlere gozat butonuna tiklar
        //9.Herhangi bir urunu sepete ekler
        //10.Sepete git butonuna tiklar
        homePage.ortakAdimlarMethodu();
        //11.Odeme sayfasina git butonuna tiklar
        ReusableMethods.jsClick(homePage.odemeSayfasinaGitButonu);
        //12. Odeme sayfasina gidildigini test eder
        String expectedUrl = "https://tradylinn.com/checkout-2/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        //13.Sayfayi kapatir
        Driver.closeDriver();
    }
/*
    @Test
    public void test_case03_IkinciYol() {
        tradylinnPages_ahmet = new TradylinnPages_Ahmet();
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        ReusableMethods.loginAhmet();
        //4.Stok miktari belli olan bir urunun sayfasina gider
        ReusableMethods.jsClick(tradylinnPages_ahmet.zirkonTasliKolyeSepeteEkleElementi);
        //5.sepetim butonuna tiklar
        tradylinnPages_ahmet.sepetimButonu.click();
        //6.Sepetteki urunu silmek icin (X) isaretine tiklar.
        if (!tradylinnPages_ahmet.sepettekiUrunuSilmeButonu.isEmpty()) {
            tradylinnPages_ahmet.sepettekiUrunuSilmeButonu.get(0).click();
            tradylinnPages_ahmet.kapatButonu.click();
        } else {
            //7.Sepete eklenecek urun adedinin maksimumunu sepete ekler
            tradylinnPages_ahmet.kapatButonu.click();
        }
        String maxStokMiktari = tradylinnPages_ahmet.sepeteEklenecekUrunMiktarElementi.getAttribute("max");
        tradylinnPages_ahmet.sepeteEklenecekUrunMiktarElementi.sendKeys(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE, maxStokMiktari);
        tradylinnPages_ahmet.sepeteEkleButonu.click();
        // ReusableMethods.waitForVisibility(tradylinnPages_ahmet.urunSepeteEklendiText,15);
        ReusableMethods.jsClick(tradylinnPages_ahmet.sepeteEkleButonu);
        ReusableMethods.waitForVisibility(tradylinnPages_ahmet.stoktanFazlaUrunEklenemezText, 15);
        Assert.assertTrue(tradylinnPages_ahmet.stoktanFazlaUrunEklenemezText.isDisplayed());
        Driver.closeDriver();
    }
 */
    }
}

