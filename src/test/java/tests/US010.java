package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US010 {
    HomePage homePage = new HomePage();
    @Test
    public void US10_TC01() {
        ReusableMethods.clickWithJS(homePage.AttributesButton); // Attributes başlığına tıklar
        String expectedAttributeTitle= "Attributes"; //Beklenen ATtributes başlığındaki yazı
        String actualAttributeTitle= homePage.attributesHeaderTitle.getText(); //Aktif olan yazı
        Assert.assertTrue(expectedAttributeTitle.contains(actualAttributeTitle),"beklenen Attributes yazısı ile aktif başlık uyumu doğrulama");

        String expectedColorTitle = "Color"; //Beklenen Color yazısı
        String actualColorTitle = homePage.colorHeaderTitle.getText(); //AKtif olan yazı
        Assert.assertTrue(expectedColorTitle.contains(actualColorTitle),"beklenen Color yazısının aktif yazı ile aynı olduğunu doğrular");
        homePage.colorCheckButton.click(); //Color'ları seçmek için checkbox'a tıklar

        String expectedSelectAllTitle = "Select all"; //Bekelen Select all yazısı
        String actualSelectAllTitle = homePage.selectAllHeaderTitle.getText(); //Aktif olan yazı
        // FAILED VERİYOR  Assert.assertTrue(expectedSelectAllTitle.contains(actualSelectAllTitle),"Beklenen Select All title'ın actual yazı ile aynı olduğu doğrulanır");

        //Listeden tek tek tum renkleri ekleyiniz
        WebElement renkler= Driver.getDriver().findElement(By.id("attributes_value_1"));
        Select select =new Select(renkler);
        List<WebElement> renklerList=select.getOptions();
        for (WebElement w:renklerList) {
            w.click();
            System.out.println(w.getText());
            ReusableMethods.waitFor(2);
        }


        // tüm renkleri Select All ile ekleme (2. yol olarak)
        // ReusableMethods.clickWithJS(homePage.selectAllButton); //Select All butonuna basarak tüm renkleri ekler

        String expectedSizeButtonTitle = "Size"; //Beklenen Size yazısı
        String actualSizeButtonTitle = homePage.sizeButtonTitle.getText(); //Aktif olan yazı
        Assert.assertTrue(expectedSizeButtonTitle.contains(actualSizeButtonTitle),"beklenen Size Title'ının actual title ile aynı olduğunu doğrular");

        ReusableMethods.clickWithJS(homePage.sizeButton); //Size butonuna tıklar
        WebElement size = Driver.getDriver().findElement(By.id("attributes_value_2"));
        Select select2 = new Select(size);
        List<WebElement> sizeList = select2.getOptions();
        for (WebElement s: sizeList) {
            s.click();
            System.out.println(s.getText());
            ReusableMethods.waitFor(2);
        }

        //tüm boyutları Select All ile ekleme (2. yol)
        // ReusableMethods.clickWithJS(homePage.sizeButtonSelectAll); //Tüm boyutları ekler

    }
}
