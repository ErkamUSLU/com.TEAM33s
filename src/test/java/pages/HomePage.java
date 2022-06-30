package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //erkamlocatorleri
    @FindBy(xpath="//a[@class='banner-item elementor-repeater-item-561a3f7 item-inline  btn btn-outline btn-lg btn-rounded btn-primary btn-icon-right']")
    public WebElement hemenbasla;

    @FindBy(xpath="//a[text()='Hesabım']")
    public WebElement hesabim;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement Login;

    @FindBy(xpath ="//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement StoreManeger;

    @FindBy(xpath="(//span[@class='text'])[4]")
    public WebElement Uruns;

    @FindBy(xpath="//th[@aria-label='Status']")
    public WebElement Status;

    @FindBy(xpath="//th[@aria-label='Stock']")
    public WebElement Stock;

    @FindBy(xpath="//th[@aria-label='Status']")
    public WebElement Price;

    @FindBy(xpath="//span[text()='Yeni ekle']")
    public WebElement YeniEkle;

    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    public WebElement Downloadable;

    @FindBy(xpath="(//input[@type='checkbox'])[1]")
    public WebElement Virtual;

    @FindBy(xpath="//input[@id='pro_title']")
    public WebElement ProductTitle;

    @FindBy(xpath="//img[@id='featured_img_display']")
    public WebElement FotoTablo;

    @FindBy(xpath="//button[@class='browser button button-hero']")
    public WebElement DosyaSec;

    @FindBy(id = "featured_img_display")
    public WebElement ilkResim;

    @FindBy(xpath = "//*[text()='Seç']")
    public WebElement secButonu;

    @FindBy(xpath="//iframe[@id='excerpt_ifr']")
    public WebElement KisaAciklama;

    @FindBy(xpath="(//html[@lang='tr'])[1]")
    public WebElement UzunAciklama;
    /////////////////////////////////////////////////////////////////
    @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[3]")
    public WebElement sepeteEklenecekUrunElementi;
    @FindBy(linkText = "Özel Seri Zirkon Taşlı Kolye-Küpe Set")
    public WebElement zirkonTasliKolyeSepeteEkleElementi;
    @FindBy(xpath = "//input[@title='Miktar']")
    public WebElement sepeteEklenecekUrunMiktarElementi;
    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement stoktanFazlaUrunEklenemezText;
    @FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")
    public WebElement sepeteEkleButonu;
    @FindBy(xpath = "//*[text()='Sepetim']")
    public WebElement sepetimButonu;
    @FindBy(xpath = "//i[@class='fas fa-times']")
    public List<WebElement> sepettekiUrunuSilmeButonu;
    @FindBy(xpath = "//a[@class='btn btn-dark btn-link btn-icon-right btn-close']")
    public WebElement kapatButonu;
    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-btn alert-success']")
    public WebElement urunSepeteEklendiText;
    @FindBy(xpath = "(//h3[@class='woocommerce-loop-product__title'])[3]")
    public WebElement sepeteEklenecekUrunText;
    @FindBy(xpath = "//*[text()='Çıkış Yap']")
    public WebElement cikisYapButonu;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-rounded']")
    public WebElement viewChartButonu;
    @FindBy(xpath = "//td[@class='product-name']")
    public WebElement sepettekiUrunAdiText;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement sepettekiUrunFiyatElementi;
    @FindBy(xpath = "//input[@title='Miktar']")
    public WebElement sepettekiUrunMiktariElementi;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[4]")
    public WebElement sepetAraToplamFiyatElementi;
    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement sepetArtiButonu;
    @FindBy(xpath = "//button[@class='quantity-minus w-icon-minus']")
    public WebElement sepetEksiButonu;
    @FindBy(name = "clear_cart")
    public WebElement sepettemizleButonu;
    @FindBy(xpath = "//p[@class='cart-empty woocommerce-info']")
    public WebElement sepetinizSuAndaBosTexti;
    @FindBy(xpath = "//h5[@class='text-uppercase font-weight-semi-bold ls-normal']")
    public WebElement couponDiscountText;
    @FindBy(xpath = "//input[@class='input-text form-control mb-4']")
    public WebElement couponKoduGirisTextBox;
    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement alisveriseDevamEtButonu;
    @FindBy(xpath = "//*[text()='Kargo Bilgileri']")
    public WebElement kargoBilgileriText;
    @FindBy(xpath = "//tr[@class='order-total']")
    public WebElement toplamFiyatElementi;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement odemeSayfasinaGitButonu;
    @FindBy(xpath = "//*[text()='Fatura detayları']']")
    public WebElement faturaDetaylariText;
    @FindBy(xpath = "//button[@name='update_cart']")
    public WebElement sepetiYenileButonu;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement sepetGuncellendiText;
    @FindBy(xpath = "//*[text()='Fiyatı Güncelle']")
    public WebElement fiyatiGuncelleButonu;
    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/my-account-2/\"])[1]")
    //public WebElement hesabim;
    //@FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    public WebElement siparislerButonu;
    @FindBy(xpath = "(//i[@class='w-icon-long-arrow-right'])[2]")
    public WebElement urunlereGozAtButonu;
    @FindBy(xpath = "//a[@data-quantity='1']")
    public List<WebElement> sepetSimgesi;
    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']")
    public List<WebElement> urunIsimleriList;
    public String expectedUrunAdi;
    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public List<WebElement> hataKapamaButonuList;
    //button[@title='Close (Esc)']
    public void ortakAdimlarMethodu() {
        //1.Vendor url'e gider
        //2.Giris yap butonuna tiklar
        //3.Vendor olarak aldigi gecerli E-mail ve parolayi girer ve giris yap butonuna tiklar
        ReusableMethods.loginAhmet();
        ReusableMethods.waitForClickablility(cikisYapButonu, 30);
        //5.sepetim butonuna tiklar
        sepetimButonu.click();
        //6.Sepetteki urunu silmek icin (X) isaretine tiklar.
        if (!sepettekiUrunuSilmeButonu.isEmpty()) {
            for (int i = 0; i < sepettekiUrunuSilmeButonu.size(); i++) {
                sepettekiUrunuSilmeButonu.get(i).click();
                ReusableMethods.waitFor(1);
            }
            kapatButonu.click();
        } else {
            kapatButonu.click();
        }
        //5.Hesabim Butonuna tiklar
        ReusableMethods.jsClick(hesabim);
        //6.Siparisler butonuna tiklar
        siparislerButonu.click();
        //7.Urunlere gozat butonuna tiklar
        ReusableMethods.jsClick(urunlereGozAtButonu);
        expectedUrunAdi = urunIsimleriList.get(1).getText();
        //8.Herhangi bir urunu sepete ekler
        ReusableMethods.jsClick(sepetSimgesi.get(1));
        //9.Sepete git butonuna tiklar
        ReusableMethods.waitForClickablility(viewChartButonu, 20);
        viewChartButonu.click();
    }
}
