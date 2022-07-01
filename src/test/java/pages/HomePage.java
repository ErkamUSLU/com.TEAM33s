package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText="Hesabım") public WebElement zhesabimlinktext;
    @FindBy(xpath = "//input[@id='username']") public WebElement zusernameBox;
    @FindBy(xpath = "//input[@id='password']") public WebElement zpassBox;
    @FindBy(xpath = "//button[@name='login']") public WebElement zsignInLoginButton;
    @FindBy(linkText = "Store Manager") public WebElement zstoreManagerButton;
    @FindBy(xpath = "(//span[@class='text'])[4]") public WebElement zproducts;
    @FindBy(xpath = "//span[text()='Yeni ekle']") public WebElement zaddNewProduct;
    @FindBy(xpath = "(//p[@class='wcfm_title wcfm_full_ele'])[2]") public WebElement zproductBrandsHead;

    @FindBy(linkText = "Adres") public WebElement zadresButton;
    @FindBy(xpath = "//h4[text()='Adresler']") public WebElement zadresHead;
    @FindBy(xpath = "(//header/h3)[1]") public WebElement zfaturaAdresHead;
    @FindBy(xpath = "(//header/h3)[2]") public WebElement zgonderimAdresHead;
    @FindBy(xpath = "(//tbody)[1]") public WebElement zfaturaAdresTBody;
    @FindBy(xpath = "(//tbody)[2]") public WebElement zgonderimAdresTBody;


    @FindBy(xpath = "//li[@id='menu-item-1074']")    public WebElement zhesabimbutonu;
    @FindBy(xpath = "//*[@id=\"menu-item-1074\"]/a")     public WebElement zhesabimIlk;
    @FindBy(id = "username")     public WebElement zusernameKutusu;
    @FindBy(id = "password")    public WebElement zpasswordKutusu;
    @FindBy(xpath = "//button[@value='Giriş Yap']")
    public WebElement zgirisYapButonu2;
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/li[3]")
    public WebElement zhesabım2Butonu;
    //@FindBy(xpath = "//*[@id=\"menu-item-1074\"]/a")
    // public WebElement  hesabimlinktext;
    @FindBy(xpath = "(//div[@class='icon-box text-center'])[2]")
    public WebElement zsiparislerKutusu;
    @FindBy(xpath = "(//*[.='Siparişler'])[1]")
    public WebElement zpanodakiSiparislerSekmesi;
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads']")
    public WebElement zpanodakiIndirmelerSekmesi;
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement zpanodakiAdresSekmesi;
    @FindBy(xpath = "//table[@class='woocommerce-orders-table woocommerce-MyAccount-orders shop_table shop_table_responsive my_account_orders account-orders-table']")
    public WebElement zsiparisTablosu;
    @FindBy(xpath = "//div[@class='icon-box icon-box-side woocommerce-MyAccount-content-caption justify-content-start mb-4']")
    public WebElement zspiarislerYazisi;
    @FindBy(xpath = "//h4[@class='icon-box-title text-normal']")
    public WebElement zindirmelerYazisi;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div")
    public WebElement zadreslerTablosu;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[1]/div")
    public WebElement zfaturaAdresiTablosu;



}

