package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US009 {
    HomePage homePage = new HomePage();

    @Test
    public void TC01() throws Exception {
    }

    public void US_009() {
        // US09_TC01
        ReusableMethods.anaSayfayaGit();
        homePage.shippingHeaderTitle.click();
        //Shipping başlığına tıklar
        String expectedShippingHeaderTitle = "Shipping";
        //İstenen Shipping Başlığı
        String actualShippingTitle = homePage.shippingHeaderTitle.getText();
        //Beklenen Shipping başlığı
        Assert.assertTrue(expectedShippingHeaderTitle.contains(actualShippingTitle),"beklenen Shipping yazısı ile aktif yazı aynı");


        String expectedWeightTitle = "Weight (kg)"; // Beklenen Weight(kg) yazısı
        String actualWeightTitle = homePage.weightTitle.getText(); //aktif olan yazı
        Assert.assertTrue(expectedWeightTitle.contains(actualWeightTitle),"beklenen Weight (kg) yazısı ile aktif yazı aynı");
        homePage.weightCheckbox.sendKeys(ConfigReader.getProperty("weights"));
        //Weight(kg) checkbox'una bir kg değeri girer

        String expectedDimensionHeader= "Dimensions (cm)"; // Beklenen Dİmensions yazısı
        String actualDimensionHeadertitle= homePage.dimensionsHeaderTitle.getText(); // Aktif yazı
        Assert.assertTrue(expectedDimensionHeader.contains(actualDimensionHeadertitle), "beklenen Dimensions başlığı ile aktif Dimensions başlığı aynı");

        homePage.lenghtBox.sendKeys(ConfigReader.getProperty("length")
                + Keys.TAB+
                ConfigReader.getProperty("width")+
                Keys.TAB+
                ConfigReader.getProperty("height"));
        //boyutları girip TAB tuşuna basarak ilerler



    }


}
