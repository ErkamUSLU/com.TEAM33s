package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class US006 extends TestBaseRapor {

    //Semih US06

    HomePage homepage = new HomePage();


    @Test
    public void US6TC01() throws InterruptedException, AWTException {

        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));


        homepage.girisButonu.click();

        homepage.emailtextbox.sendKeys(ConfigReader.getProperty("email"));

        homepage.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));

        homepage.girisYapButonu.click();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].click()", homepage.hesabımLinki);

        homepage.hesabımLinki.click();

        homepage.storeManager.click();

        js.executeScript("window.scrollBy(100,500)");

        homepage.YeniUrunEkle.click();

        homepage.yeniEkleButonu.click();


        homepage.productTitle.sendKeys(ConfigReader.getProperty("productname"));

        //1. resim yükleme

        homepage.ilkResim.click();

        js.executeScript("window.scrollBy(0,200)");
        homepage.dosyaSec.click();
        Thread.sleep(2000);
        Robot rb = new Robot();

        Actions actions = new Actions(Driver.getDriver());

        StringSelection str = new
                StringSelection("C:\\Users\\HP\\Desktop\\testfoto1.webp");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        actions.moveToElement(homepage.secButonu).click(homepage.secButonu).perform();

        //  1. resim yüklendi

        //=======================================================

        // 2. resim yükleme

        Thread.sleep(5000);
        homepage.ikinciResim.click();

        js.executeScript("window.scrollBy(0,200)");
        homepage.dosyaYükle.click();
        js.executeScript("window.scrollBy(0,200)");
        homepage.dosyaSec2.click();
        Thread.sleep(2000);
        Robot rb1 = new Robot();


        StringSelection str1 = new
                StringSelection("C:\\Users\\HP\\Desktop\\testfoto1.webp");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(10000);
        actions.moveToElement(homepage.addGallery).click(homepage.addGallery).perform();

        //2. resim de yüklendi.
//=================================================================================
        // KATEGORİ  KISMINA  GİRER.

        String[] kategoriArr = {"Besin Takviyeleri", "Çok Satanlar", "Elektrik & Elektronik", "Ev & Yaşam",
                "İndirimli Ürünler", "Kitap & Müzik & Film", "Kozmatik & Kişisel Bakım", "Moda & Giyim",
                "Oyuncak", "Takı & Aksesuar", "Yeni Ürünler"};
        List<String> expectedCategoryList = new ArrayList<>(Arrays.asList(kategoriArr));
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        List<String> actualCategoryList = new ArrayList<>();
        for (WebElement each : homepage.categoryListElements) {
            actualCategoryList.add(each.getText());
        }
        Assert.assertTrue(actualCategoryList.containsAll(expectedCategoryList), "expectedCategoryList'inin bazi elemanlari sitedeki kategori listesinde bulunmadi.");
        extentTest.pass("sitedeki kategori listesi gorulmesi beklenen kategori listesini iceriyor");
        js = (JavascriptExecutor) Driver.getDriver();
        for (WebElement eachCategory : homepage.categoryListElements) {
            if (eachCategory.getText().equals(ConfigReader.getProperty("urunKategori"))) {
                String dataItemAttribute = eachCategory.getAttribute("data-item");
                for (WebElement eachCheckBox : homepage.categoryListCheckBox) {
                    if (eachCheckBox.getAttribute("value").equals(dataItemAttribute)) {
                        js.executeScript("arguments[0].click();", eachCheckBox);
                        extentTest.info("uygun kategori tiklandi");
                        Assert.assertTrue(eachCheckBox.isSelected(), "uygun kategori tiklandi ama secilemedi");
                        extentTest.pass("uygun kategorinin secilebilirligi test edildi");
                    }
                }
            }
            // BRANCH SEÇİMİ

            String[] brandArr = {"Elegant Auto Group", "Green Grass", "Node Js", "NS8", "RED",
                    "Skysuite Tech", "Sterling"};
            List<String> expectedBrandList = new ArrayList<>(Arrays.asList(brandArr));
            List<String> actualBrandList = new ArrayList<>();
            for (WebElement each : homepage.brandListElements) {
                actualBrandList.add(each.getText());
            }
            Assert.assertTrue(actualBrandList.containsAll(expectedBrandList), "expectedBrandList'inin bazi elemanlari sitedeki brand listesinde bulunmadi.");
            extentTest.pass("sitedeki brand listesi gorulmesi beklenen brand listesini iceriyor");
            js = (JavascriptExecutor) Driver.getDriver();
            for (WebElement eachBrand : homepage.brandListElements) {
                if (eachBrand.getText().equals(ConfigReader.getProperty("urunBrand"))) {
                    String dataItemAttribute = eachBrand.getAttribute("data-item");
                    for (WebElement eachCheckBox : homepage.brandListCheckBox) {
                        if (eachCheckBox.getAttribute("value").equals(dataItemAttribute)) {
                            js.executeScript("arguments[0].click();", eachCheckBox);
                            extentTest.info("uygun brand tiklandi");
                            // actions.scrollToElement(eachCheckBox);
                            Assert.assertTrue(eachCheckBox.isSelected(), "uygun brand tiklandi ama secilemedi");
                            extentTest.pass("uygun brand'in secilebilirligi test edildi");
                        }
                    }
                }
            }
            js.executeScript("arguments[0].scrollIntoView(true);", homepage.urunYerlestirmeOnayi);
            js.executeScript("arguments[0].click();", homepage.urunYerlestirmeOnayi);
            extentTest.info("urun yerlestirmek icin submit butonuna tiklandi");
            Assert.assertTrue(homepage.urunYerlestirmeMesaji.isDisplayed(),
                    "Product Successfully Published mesaji gorulmedi");
            extentTest.pass("urun basarili sekilde yerlestirildi");
        }










       /* js.executeScript("window.scrollBy(0,400)");
        homepage.Categorisekmesi.click();
        js.executeScript("window.scrollBy(0,800)");
        actions.moveToElement(homepage.kategoriYeniUrünler).click(homepage.kategoriYeniUrünler).perform();





// submit butonu

        js.executeScript("window.scrollBy(0,800)");
        actions.moveToElement(homepage.submitButonu).click(homepage.submitButonu).perform();
        Thread.sleep(5000);


        // wiew butonu
        actions.moveToElement(homepage.WiewButonu).click(homepage.WiewButonu).perform();


        // ÜRÜN RESİMLERİ YÜKLENDİ VE HANGİ KATEGORİYE AİT OLDUĞU SAYFADA GÖRÜLDÜ
*/
    }
}