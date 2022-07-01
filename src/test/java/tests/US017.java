package tests;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class US017 {

    HomePage homePage=new HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));
        Faker faker=new Faker();

        homePage.Hesabim.click();
        homePage.email.sendKeys("gulsum.e.e.y.58@gmail.com");
        homePage.Password.sendKeys("Esin2016+");
        homePage.Login.submit();
        homePage.StoreManeger.click();
       JavascriptExecutor jse= (JavascriptExecutor)Driver.getDriver();
         jse.executeScript("arguments[0].click();",homePage.Musteriler);
        homePage.YeniEkle.click();
        homePage.CustomerUsername.sendKeys(faker.name().firstName());
        homePage.CustomerEmail.sendKeys(faker.internet().emailAddress());
        homePage.CustomerFirstName.sendKeys(faker.name().firstName());
        homePage.CustomerLastName.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.BillingFirstName.sendKeys(faker.name().firstName());
        homePage.BillingLastName.sendKeys("yildiz");
        homePage.CompanyName.sendKeys("yazilim.");
        homePage.Phone.sendKeys("532 334 67 43");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.Addrees1.sendKeys("Kirazlik Mah Park Sokak.");
        homePage.Addrees2.sendKeys("No:4/4");
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);

        Select selectCountry = new Select(homePage.Country);
        selectCountry.selectByIndex(1);
        Thread.sleep(5000);
        System.out.println(selectCountry.getOptions());
        homePage.City.sendKeys("Bursa");
        Select selectState=new Select(homePage.State);
        selectState.selectByIndex(3);
        homePage.Postcode.sendKeys("5800");
        jse.executeScript("arguments[0].click();",homePage.Submit);

    }

    @Test
    public void TC002() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));

        Faker faker=new Faker();
        homePage.Hesabim.click();
        homePage.email.sendKeys("gulsum.e.e.y.58@gmail.com");
        homePage.Password.sendKeys("Esin2016+");
        homePage.Login.submit();
        homePage.StoreManeger.click();
        JavascriptExecutor jse= (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].click();",homePage.Musteriler);
        homePage.YeniEkle.click();
        homePage.CustomerUsername.sendKeys(faker.name().firstName());
        homePage.CustomerEmail.sendKeys(faker.internet().emailAddress());
        homePage.CustomerFirstName.sendKeys(faker.name().firstName());
        homePage.CustomerLastName.sendKeys("yildiz");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.BillingFirstName.sendKeys("erva");
        homePage.BillingLastName.sendKeys("yildiz");
        homePage.CompanyName.sendKeys("yazilim.");
        homePage.Phone.sendKeys("532 334 67 43");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.Addrees1.sendKeys("Kirazlik Mah Park Sokak.");
        homePage.Addrees2.sendKeys("No:4/4");
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);


        Select selectCountry = new Select(homePage.Country);
        selectCountry.selectByIndex(1);
        Thread.sleep(5000);
        System.out.println(selectCountry.getOptions());
        homePage.City.sendKeys("Bursa");
        Select selectState=new Select(homePage.State);
        selectState.selectByIndex(3);
        homePage.Postcode.sendKeys("5800");
        jse.executeScript("arguments[0].click();",homePage.Submit);

      //  Driver.closeDriver();

    }

    @Test
    public void TC003() throws InterruptedException {
        Faker faker=new Faker();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinn"));

        homePage.Hesabim.click();
        homePage.email.sendKeys("gulsum.e.e.y.58@gmail.com");
        homePage.Password.sendKeys("Esin2016+");
        homePage.Login.submit();
        homePage.StoreManeger.click();
        JavascriptExecutor jse= (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].click();",homePage.Musteriler);
        homePage.YeniEkle.click();
        homePage.CustomerUsername.sendKeys(faker.name().firstName());
        homePage.CustomerEmail.sendKeys(faker.internet().emailAddress());
        homePage.CustomerFirstName.sendKeys(faker.name().firstName());
        homePage.CustomerLastName.sendKeys("yildiz");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.BillingFirstName.sendKeys("erva");
        homePage.BillingLastName.sendKeys("yildiz");
        homePage.CompanyName.sendKeys("yazilim.");
        homePage.Phone.sendKeys("532 334 67 43");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.Addrees1.sendKeys("Kirazlik Mah Park Sokak.");
        homePage.Addrees2.sendKeys("No:4/4");
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);

        Select selectCountry = new Select(homePage.Country);
        selectCountry.selectByIndex(1);
        Thread.sleep(5000);
        System.out.println(selectCountry.getOptions());
        homePage.City.sendKeys("Bursa");
        Select selectState=new Select(homePage.State);
        selectState.selectByIndex(3);
        homePage.Postcode.sendKeys("5800");
        Driver.getDriver().findElement(By.xpath("//input[@ id='same_as_billing']")).click();
        homePage.Firstname1.sendKeys("Ali");
        homePage.Lastname1.sendKeys("Yilmaz");
       homePage.CompanyName1.sendKeys("alş@.com");
        homePage.Addrees11.sendKeys("egriköpru mah.");
        homePage.Addrees22.sendKeys("daire3");
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);

        Select selectCountry1 = new Select(homePage.Country1);
        selectCountry1.selectByIndex(1);
        Thread.sleep(5000);
        System.out.println(selectCountry.getOptions());
        homePage.City1.sendKeys("Bursa");
        Select selectState1=new Select(homePage.State1);
        selectState1.selectByIndex(6);
        homePage.Postcode1.sendKeys("5858");

        homePage.Submit1.click();
       // Driver.closeDriver();
    }

    }


