package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.Random;

public class US018 {

    HomePage homePage=new HomePage();
    Actions action = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Random rnd = new Random();

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));
        homePage.loginButton.click();
        homePage.username.sendKeys(ConfigReader.getProperty("correctEmail"));
        homePage.password.sendKeys(ConfigReader.getProperty("correctPassword"));
        homePage.loginButton2.click();
        ReusableMethods.waitFor(10);

        homePage.aramaCubugu.sendKeys("uzaktan kumanda" + Keys.ENTER);
        Thread.sleep(20);
        JavascriptExecutor jsep = (JavascriptExecutor) Driver.getDriver();
        jsep.executeScript("arguments[0].click();", homePage.sepeteClick);

        Thread.sleep(5);
        JavascriptExecutor js1 = (JavascriptExecutor) Driver.getDriver();
        js1.executeScript("arguments[0].click();", homePage.sepetimeClick);

        Thread.sleep(5);
        homePage.odemeClick.click();
        Thread.sleep(5);
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
        js2.executeScript("arguments[0].click();", homePage.siparisiOnayla);

        Thread.sleep(5);
        JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
        js3.executeScript("arguments[0].click();", homePage.hesabimButton);

        Thread.sleep(10);
        JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
        js4.executeScript("arguments[0].click();", homePage.storeManagerButton);

        Thread.sleep(5);
        JavascriptExecutor js5 = (JavascriptExecutor) Driver.getDriver();
        js5.executeScript("arguments[0].click();", homePage.emirlerClick);

        Thread.sleep(75);
        ReusableMethods.waitFor(30);
        JavascriptExecutor js6 = (JavascriptExecutor) Driver.getDriver();
        js6.executeScript("arguments[0].click();", homePage.viewDetailsClick);

        Thread.sleep(20);
        WebElement ddmOrderstatus = Driver.getDriver().findElement(By.xpath("//select[@id='wcfm_order_status']"));
        Select option = new Select(ddmOrderstatus);
        Thread.sleep(5);

        option.selectByVisibleText("Tamamlandı");
        Thread.sleep(5);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.upDate.click();
        Thread.sleep(5);
        homePage.hesabimButton.click();
        Thread.sleep(5);
        homePage.siparsler.click();
        Thread.sleep(5);
        homePage.destek.click();
        Thread.sleep(5);
        WebElement kategoriddm = Driver.getDriver().findElement(By.xpath("//select[@id='wcfm_support_category']"));
        Select optionKategori = new Select(kategoriddm);
        optionKategori.selectByIndex(3);
        Thread.sleep(5);
        WebElement oncelikddm = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_support_priority\"]"));
        Select optionOncelik = new Select(oncelikddm);
        optionOncelik.selectByIndex(1);
        Thread.sleep(5);
        WebElement productddm = Driver.getDriver().findElement(By.xpath("//*[@id=\"wcfm_support_product\"]"));
        Select optionProduct = new Select(productddm);
        optionProduct.selectByIndex(1);
        Thread.sleep(5);
        homePage.ıssues.sendKeys("aracın anteni kırık" + Keys.ENTER);
        Thread.sleep(5);
        homePage.submit.click();
        Thread.sleep(5);
        homePage.storeManagerButton.click();
        Thread.sleep(5);
        homePage.emirlerClick.click();
        Thread.sleep(5);
        homePage.refundRequest.click();
        WebElement modeddm = Driver.getDriver().findElement(By.xpath("//select[@id='wcfm_refund_request']"));
        Select optionMode = new Select(modeddm);
        optionMode.selectByIndex(rnd.nextInt());
        Thread.sleep(5);
        WebElement qtyddm = Driver.getDriver().findElement(By.xpath("//*[@id=\"order_line_items\"]/tr/td[3]/select"));
        Select optionQty = new Select(qtyddm);
        optionQty.selectByIndex(rnd.nextInt());
        Thread.sleep(5);
        homePage.reason.sendKeys("aracın anteni kırık" + Keys.ENTER);
        Thread.sleep(5);
        homePage.submitRequest.click();
        Thread.sleep(5);
        homePage.geriOdemeClick.click();
        int rows = Driver.getDriver().findElements(By.xpath("//thead/tr[@role='row']/th")).size();
        System.out.println("Number of rows: " + rows);

        for (int r = 1; r <= rows; r++) {

      Assert.assertTrue( Driver.getDriver().findElement(By.xpath("//tbody//tr[" + r + "]//td[2]")).isDisplayed());
      Assert.assertTrue(  Driver.getDriver().findElement(By.xpath("//tbody//tr[" + r + "]//td[3]")).isDisplayed());
      Assert.assertTrue(  Driver.getDriver().findElement(By.xpath("//tbody//tr[" + r + "]//td[4]")).isDisplayed());
      Assert.assertTrue(  Driver.getDriver().findElement(By.xpath("//tbody//tr[" + r + "]//td[5]")).isDisplayed());
      Assert.assertTrue(  Driver.getDriver().findElement(By.xpath("//tbody//tr[" + r + "]//td[6]")).isDisplayed());

        }

    }
}
