package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class US022 extends TestBaseRapor {

    @Test
    public void sayfayaGiris() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get("https://tradylinn.com/");
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Tradylinn";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Test
    public void indirimYazi() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get("https://tradylinn.com/");
        String actualIndirimYazi="İndirimli Ürünler";
        String expectedIndirimyazi= homePage.indirimliUrunlerFS.getText();
        Assert.assertEquals(actualIndirimYazi,expectedIndirimyazi);

    }

    @Test
    public void tumunuGorButonu() {
        HomePage homePage = new HomePage();

        Driver.getDriver().get("https://tradylinn.com/");
        Assert.assertTrue(homePage.tumunuGorFS.isDisplayed());

    }

    @Test
    public void tumunuGorButonutiklama() {
        HomePage homePage = new HomePage();

        Driver.getDriver().get("https://tradylinn.com/");

        Assert.assertTrue(homePage.tumunuGorFS.isEnabled());

    }

    @Test
    public void acilanSayfaIndirimliUrunler()  {
        HomePage homePage = new HomePage();

        Driver.getDriver().get("https://tradylinn.com/");

        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.tumunuGorFS);

        String yeniSayfaTitle=Driver.getDriver().getTitle();
        String expectedlYeniSayfaTitle="İndirimli Ürünler";

        Assert.assertTrue(yeniSayfaTitle.contains(expectedlYeniSayfaTitle));

    }

    @Test
    public void siralaMenusu() throws IOException {
        HomePage homePage = new HomePage();
        Driver.getDriver().get("https://tradylinn.com/");
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.tumunuGorFS);
        File menuResmi=new File("target/siralaMenusu.jpeg");
        File resimGecici=homePage.siralaMenusuFS.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(resimGecici,menuResmi);
    }

    @Test
    public void testName() {
        HomePage homePage = new HomePage();
        Driver.getDriver().get("https://tradylinn.com/");
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.tumunuGorFS);
        Select select =new Select(homePage.siralaMenusuFS);
        List<WebElement> menu= select.getOptions();
        String expectedSiralaMenusu="Varsayılan Sıralama" +
                "En çok incelenene göre sırala" +
                "En çok oy alana göre sırala" +
                "En yeniye göre sırala" +
                "Fiyata göre sırala: Düşükten yükseğe" +
                "Fiyata göre sırala: Yüksekten düşüğe";
//List<String > expectedSiralaMenusu2=new ArrayList(Arrays.asList("Varsayılan Sıralama En çok incelenene göre sırala En çok oy alana göre sırala En yeniye göre sırala Fiyata göre sırala: Düşükten yükseğe Fiyata göre sırala: Yüksekten düşüğe"));
        List<String> actualSiralaMenusuFS=new ArrayList<>();
        String actualSiralaMenusu2="";
        for (WebElement each: menu
        ) {
            actualSiralaMenusuFS.add(each.getText());
            actualSiralaMenusu2+=each.getText();
        }
//Collections.sort(actualSiralaMenusu);
//Collections.sort(expectedSiralaMenusu2);
        System.out.println(actualSiralaMenusu2);
        System.out.println(expectedSiralaMenusu);
        System.out.println(actualSiralaMenusu2);
        //  System.out.println(expectedSiralaMenusu);
        Assert.assertEquals(expectedSiralaMenusu, actualSiralaMenusu2);
    }

    @Test
    public void dropdownaBasıpDusuktenYuksege() throws IOException {
        extentTest=extentReports.createTest("Fiyat düsükten yuksege", "Dogru sıralama");
        HomePage homePage = new HomePage();

        Driver.getDriver().get("https://tradylinn.com/");
        extentTest.info("Tradylin  sayfasına basarılı sekilde girildi");
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.tumunuGorFS);
        extentTest.info("İndirimli urunler sayfasına girildi");
        Select select =new Select(homePage.siralaMenusuFS);
        select.selectByValue("price");
        extentTest.info("Fiyat sıralaması yapıldı");
        ArrayList<Double> urunlerDouble=new ArrayList<>();
        for (WebElement each:homePage.fiyatListesiFS
        ) {

            String fiyatStr=each.getText().replaceAll("₺","");

            System.out.println(fiyatStr);
            urunlerDouble.add(Double.parseDouble(fiyatStr));
        }
        ArrayList<Double> kontrolListe=new ArrayList<>(urunlerDouble);
        Collections.sort(kontrolListe);
        Assert.assertEquals(kontrolListe, urunlerDouble);
        extentTest.pass("Kullanıcı basarılı bir sekilde fiyatları dusukten yuksege sıraladı");
        ReusableMethods.getScreenshot("Fiyatları düsükten yuksege sıralama");
    }
    @Test
    public void dropdownaBasıpYuksektenDusuge() throws IOException {
        extentTest=extentReports.createTest("Fiyat yüksekten düşüğe göre sıralama","Doğru sırlama");

        HomePage homePage = new HomePage();
        Driver.getDriver().get("https://tradylinn.com/");
        extentTest.info("Tradylinn sitesine gidildi");

        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", homePage.tumunuGorFS);
        extentTest.info("İndirimli ürünler sayfasına gidildi");

        Select select =new Select(homePage.siralaMenusuFS);
        select.selectByValue("price-desc");

        extentTest.info("Fiyatlar yüksekten düşüğe sıralandı");

        ArrayList<Double> urunlerDoubleYD=new ArrayList<>();
        for (WebElement each:homePage.fiyatListesiFS
        ) {

            String fiyatStr=each.getText().replaceAll("₺","").replaceAll(",","");

            System.out.println(fiyatStr);
            urunlerDoubleYD.add(Double.parseDouble(fiyatStr));
        }
        ArrayList<Double> kontrolListe=new ArrayList<>(urunlerDoubleYD);

        Collections.sort(kontrolListe, Collections.reverseOrder());

        Assert.assertEquals(kontrolListe, urunlerDoubleYD);
        extentTest.pass("Kullanici basarili sekilde fiyatlari yüksekten düşüge sıraladı");

        ReusableMethods.getScreenshot("yuksektendusugefiyatsiralamasi");
    }
}

