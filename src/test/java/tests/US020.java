package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US020 {
    @Test
    public void test20() throws InterruptedException {

        HomePage homePage = new HomePage();
        //tradylin sayfasına gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));
        //giris yap secenegine tıklar
        homePage.girisYap1.click();
        Thread.sleep(3000);
        //Gecerli mail adresi ve passwordu girer
        homePage.emailBox.sendKeys(ConfigReader.getProperty("tradylinnValidEmail"));
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("tradylinnValidPassword") + Keys.ENTER);
        Thread.sleep(3000);
        //hesabım secenegine tıklar
        homePage.hesabım.click();
        //store manager secenegine tıklar
        homePage.storeManager.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        //incelemeler secenegine tıklar
        homePage.incelemelertık.click();
        Thread.sleep(1000);
        //acılan incelemeler sayfasında sag ust kosede productReviews secenegıne tıklar
        homePage.productReviews.click();

//yapılan yorumların kullanıcı bilgisi kullanıcı yorumu puan ve yorum tarihini görüntüler(yazdırır)
        homePage.kullaniciBilgisi.stream().forEach(t -> System.out.println("Kullanıcı bilgisi" + t.getText()));
        homePage.yorum.stream().forEach(t -> System.out.println("Kullanıcı Yorumları: " + t.getText()));
        homePage.puan.stream().forEach(t -> System.out.println("Kullanıcı Puanları: " + t.getText()));
        homePage.bilgiTarihi.stream().forEach(t -> System.out.println("Kullanıcı Bilgi Tarihi:" + t.getText()));
        Driver.closeDriver();
    }
}
