package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US011 {
    HomePage homePage = new HomePage();
    @Test
    public void US_11_TC_01() {
        ReusableMethods.clickWithJS(homePage.toptanUrunGostermeHeader); // Vendor, Toptan Ürün Gösterme başlığına tıklar
        homePage.pieceHeader.isDisplayed();
        WebElement pieceType = Driver.getDriver().findElement(By.id("piecetype"));
        Select select3 = new Select(pieceType);
        List<WebElement> piece = select3.getOptions();
        for (WebElement p:piece){
            p.click();
            ReusableMethods.waitFor(2);
        }
        homePage.unitsPerPieceButton.sendKeys(ConfigReader.getProperty("UnitsPerPiece"));
        homePage.minOrderQuantityButton.sendKeys(ConfigReader.getProperty("MinOrderQuantity"));

    }
}
