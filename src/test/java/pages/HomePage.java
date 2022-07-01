package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage{
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    //==============================HUSEYIN=================================================
    @FindBy(xpath = "//*[text()='Üye Ol']")
    public WebElement uyeOl;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/vendor-register/\"])[2]")
    public WebElement saticiOl;

    @FindBy(xpath = "//input[@name=\"user_email\"]")
    public WebElement eMailKutusu;

    @FindBy(xpath = "//input[@name=\"passoword\"]")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//input[@name=\"confirm_pwd\"]")
    public WebElement conPasswordKutusu;

    @FindBy(xpath = "//*[text()='Welcome,']")
    public WebElement onayMetni;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/my-account-2/\"])[1]")
    public WebElement hesabim;

    @FindBy(xpath = "(//input[@name=\"username\"])[1]")
    public  WebElement mailKutusu;

    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement parolaKutusu;

    @FindBy(xpath = "(//*[text()='Hesabım'])[2]")
    public WebElement myAccount;

    @FindBy(xpath = "(//p[@class=\"text-uppercase text-center mb-0\"])[1]")
    public WebElement order1;

    @FindBy(xpath = "(//p[@class=\"text-uppercase text-center mb-0\"])[2]")
    public  WebElement downloads1;

    @FindBy(xpath = "(//p[@class=\"text-uppercase text-center mb-0\"])[3]")
    public WebElement addresses1;

    @FindBy(xpath = "(//p[@class=\"text-uppercase text-center mb-0\"])[4]")
    public WebElement accountDetails1;

    @FindBy(xpath = "(//p[@class=\"text-uppercase text-center mb-0\"])[5]")
    public WebElement whislist1;

    @FindBy(xpath = "(//p[@class=\"text-uppercase text-center mb-0\"])[6]")
    public WebElement logout1;

    @FindBy(xpath = "//a[normalize-space()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/my-account-2/orders/\"])[1]")
    public WebElement order2;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/my-account-2/downloads/\"])[1]")
    public WebElement downloads2;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/my-account-2/edit-address/\"])[1]")
    public WebElement addesses2;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/my-account-2/edit-account/\"])[1]")
    public WebElement accountDetails2;

    @FindBy(xpath = "//a[@href=\"https://tradylinn.com/my-account-2/appointments/\"]")
    public WebElement appointments;

    @FindBy(xpath = "(//a[@href=\"https://tradylinn.com/favorilerim/\"])[2]")
    public WebElement myFavorites;

    @FindBy(xpath = "//a[@href=\"https://tradylinn.com/my-account-2/support-tickets/\"]")
    public WebElement supportRequests;

    @FindBy(xpath = "//a[@href=\"https://tradylinn.com/my-account-2/followings/\"]")
    public WebElement followUp;

    @FindBy(xpath = "(//*[text()='Çıkış'])[1]")
    public WebElement logout2;

    @FindBy(xpath = "//*[text()='Alışverişe Devam Et']")
    public WebElement alisVeriseDevam;

    @FindBy(xpath = "//img[@alt=\"Tilki T -shirt\"]")
    public WebElement tShirt;

    @FindBy(xpath = "//button[@class=\"single_add_to_cart_button button alt\"]")
    public WebElement sepeteEkleButon;

    @FindBy(xpath = "//a[@class='btn btn-success btn-md']")
    public WebElement sepet;

    @FindBy(xpath = "//a[@class=\"checkout-button button alt wc-forward\"]")
    public WebElement odemeSayfasi;

    @FindBy(xpath = "//input[@name=\"billing_first_name\"]")
    public WebElement isimKutusu;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public  WebElement soyIsimKutusu;

    @FindBy(xpath = "//input[@id='billing_company']")
    public WebElement firma;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement adres1;

    @FindBy (xpath = "//input[@id='billing_address_2']")
    public WebElement adres2;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    public  WebElement postaKodu;

    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement ilce;

    @FindBy(xpath = "//select[@class=\"state_select select2-hidden-accessible\"]")
    public WebElement ddm;

    @FindBy (xpath = "//input[@id='billing_phone']")
    public WebElement telefon;

    @FindBy(xpath = "//input[@id='billing_email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='wcfmmp_user_location']")
    public WebElement teslimat;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement siparisOnay;

    @FindBy(xpath = "//*[text()='Teşekkür ederiz. Siparişiniz alınmıştır.']")
    public WebElement sipariOnayMetni;

    //==============================ERKAM=================================================

    @FindBy(xpath="//a[@class='banner-item elementor-repeater-item-561a3f7 item-inline  btn btn-outline btn-lg btn-rounded btn-primary btn-icon-right']")
    public WebElement hemenbasla;

    @FindBy(xpath="//a[text()='Hesabım']")
    public WebElement ehesabim;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement eemail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement ePassword;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement eLogin;

    @FindBy(xpath ="//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement eStoreManeger;

    @FindBy(xpath="(//span[@class='text'])[4]")
    public WebElement Uruns;

    @FindBy(xpath="//th[@aria-label='Status']")
    public WebElement Status;

    @FindBy(xpath="//th[@aria-label='Stock']")
    public WebElement Stock;

    @FindBy(xpath="//th[@aria-label='Status']")
    public WebElement Price;

    @FindBy(xpath="//span[text()='Yeni ekle']")
    public WebElement eYeniEkle;

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

//    @FindBy(xpath="(//html[@lang='tr'])[1]")
//    public WebElement UzunAciklama;

    /* @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[3]")
 public WebElement sepeteEklenecekUrunElementi;*/

    @FindBy(xpath="(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[4]")
    public WebElement askilik;
    @FindBy(linkText = "//button[text()='Sepete Ekle']")
    public WebElement askilikSepeteEkleElementi;
    @FindBy(xpath="//a[@data-quantity='1']")
    public List<WebElement> urunsecmeList;
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

    //==============================SEMIH=================================================

    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement girisButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement emailtextbox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButonu;


    @FindBy(xpath = "(//a[@href='https://tradylinn.com/my-account-2/'])[1]")
    public WebElement hesabımLinki;

    // @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    //  public WebElement StoreManager;


    @FindBy(xpath = "(//span[@class='wcfmfa fa-cube'])[1]")
    public WebElement YeniUrunEkle;

    @FindBy(id = "add_new_product_dashboard")
    public WebElement yeniEkleButonu;

    @FindBy(id = "pro_title")
    public WebElement productTitle;

    @FindBy(id = "featured_img_display")
    public WebElement eilkResim;



    @FindBy(xpath = "//button[@class='browser button button-hero']")
    public WebElement dosyaSec;


    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement ikinciResim;


    @FindBy(xpath = "(//button[@id='menu-item-upload'])[2]")
    public WebElement dosyaYükle;

    @FindBy(id = "__wp-uploader-id-4")
    public WebElement dosyaSec2;


    @FindBy(xpath = "//*[text()='Seç']")
    public WebElement esecButonu;

    @FindBy(xpath = "(//button[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement addGallery;


    @FindBy(xpath = "(//body[@id='tinymce'])[2]")
    public WebElement tanimlama;

    @FindBy(xpath = "(//p[text()='+Add new category']")
    public WebElement kategoriEkle;

    @FindBy(xpath = "(//input[@id='wcfm_new_cat']")
    public WebElement KategoriyeIsimEkle;

    @FindBy(xpath = "(//p[text()='+Add new Product brands']")
    public WebElement yeniUrunMarkasıEkle;

    @FindBy(xpath = "//ul[@id='product_cats_checklist']/li")
    public List<WebElement> categoryListElements;
    @FindBy(xpath = "//ul[@id='product_cats_checklist']/li/input")
    public List<WebElement> categoryListCheckBox;
    @FindBy(xpath = "//ul[@id='product_brand']/li")
    public List<WebElement> brandListElements;
    @FindBy(xpath = "//ul[@id='product_brand']/li/input")
    public List<WebElement> brandListCheckBox;
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement urunYerlestirmeOnayi;
    @FindBy(xpath = "//*[text()='Product Successfully Published.']")
    public WebElement urunYerlestirmeMesaji;



    @FindBy(xpath = "(//input[@name='product_cats[]'])[38]")
    public WebElement kategoriYeniUrünler;


    @FindBy(xpath = "//p[@class='wcfm_title wcfm_full_ele'][1]")
    public WebElement Categorisekmesi;



    @FindBy(name = "submit-data")
    public WebElement submitButonu;

    @FindBy(xpath = "(//input[@class='wcfm_submit_button'])[3]")
    public WebElement WiewButonu;


    //==============================EMRE=================================================

    @FindBy (xpath = "//li//a[@href='https://tradylinn.com/my-account-2/'][1]")
    public  WebElement hesabımButonu;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement usernameButton;

    @FindBy (xpath = "//input[@id='password']")
    public  WebElement passwordButton;

    @FindBy (xpath = "//button[@name='login']")
    public  WebElement entryButton;

    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButton;

    @FindBy (xpath = "//*[@class='wcfmfa fa-cube'][1]")
    public WebElement urunSButton;

    @FindBy (xpath = "//*[text()='Yeni ekle']")
    public  WebElement yeniEkleButton;

    @FindBy (xpath = "//*[text()='Manage Stock?'][1]")
    public WebElement manageStockButtontitle;

    @FindBy (xpath = "//input[@name='manage_stock']")
    public  WebElement manageStockButton;

    @FindBy (xpath = "//*[text()='Stock Qty']")
    public WebElement stockQtyButton;

    @FindBy (xpath = "//input[@name='sold_individually']")
    public  WebElement soldIndividuallyButton;

    @FindBy (xpath = "//input[@id='stock_qty']")
    public WebElement stockQtyCheckbox;

    @FindBy (xpath = "//*[text()='Allow Backorders?'][1]")
    public WebElement allowBackordersTitle;

    @FindBy (xpath = "//label[@class='wcfmfa fa-truck']")
    public WebElement shippingHeaderTitle;

    @FindBy (xpath = "//*[text()='Weight (kg)'][1]")
    public WebElement weightTitle;

    @FindBy (xpath = "//input[@class='wcfm-text wcfm_ele simple variable booking'][1]")
    public WebElement weightCheckbox;

    @FindBy (xpath = "//*[text()='Dimensions (cm)'][1]")
    public WebElement dimensionsHeaderTitle;

    @FindBy (xpath = "//*[@name='length']")
    public WebElement lenghtBox;

    @FindBy (xpath = "//*[text()='Attributes'][1]")
    public WebElement attributesHeaderTitle;

    @FindBy (xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement AttributesButton;

    @FindBy (xpath = "//*[text()='Color'][1]")
    public WebElement colorHeaderTitle;

    @FindBy (xpath = "//input[@title='Check to associate this attribute with the product'][1]")
    public WebElement colorCheckButton;

    @FindBy(xpath = "//*[@id=\"attributes\"]/div[2]/button[3]")
    public WebElement selectAllHeaderTitle;

    @FindBy(xpath = "//button[text()='Select all'][1]")
    public WebElement selectAllButton;

    @FindBy (xpath = "//*[text()='Size'][1]")
    public WebElement sizeButtonTitle;

    @FindBy (xpath = "//input[@name='attributes[2][is_active]']")
    public WebElement sizeButton;

    @FindBy (xpath = "//*[@id=\"attributes\"]/div[3]/button[3]")
    public WebElement sizeButtonSelectAll;

    @FindBy (xpath = "//label[@class='wcfmfa fa-certificate']")
    public WebElement toptanUrunGostermeHeader;

    @FindBy (xpath = "//p[@class='piecetype wcfm_title field_61d331d8dc5a9']")
    public WebElement pieceHeader;

    @FindBy (xpath = "//input[@id='unitpercart']")
    public  WebElement unitsPerPieceButton;

    @FindBy (xpath = "//input[@id='minorderqtytr']")
    public  WebElement minOrderQuantityButton;


    //==============================FATIH=================================================

    @FindBy (xpath="//a[.='İndirimli Ürünler']")
    public WebElement indirimliUrunlerFS;

    @FindBy (xpath="//*[@id=\"main\"]/div/div/div[1]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement tumunuGorFS;

    @FindBy (xpath="//select[@name='orderby']")
    public WebElement siralaMenusuFS;

    @FindBy (xpath="//select[@name='orderby']")
    public List<WebElement> siralaMenusuDetayFS;

    @FindBy (xpath="//ins/span/bdi")
    public List<WebElement> fiyatListesiFS;

    //==============================MENAF=================================================

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public static WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement emailButon;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordButon;

    @FindBy(xpath = "//button[@value='Giriş Yap']")
    public static WebElement girisYap2;

    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButon;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButon;


    @FindBy(xpath = "//span[contains(text(),'Kuponlar')]")
    public WebElement coupons;

    @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement addNewCoupon;

    @FindBy(xpath = "//input[@id='title']")
    public WebElement couponCodeBox;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;

    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement checkBoxAllowFreeShipping;

    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement checkBoxShowOnStore;

    @FindBy(xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpendTexBox;

    @FindBy(xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpendTexBox;

    @FindBy(xpath = "//input[@id='individual_use']")
    public WebElement checkBoxIndividualUseOnly;

    @FindBy(xpath = "//input[@id='exclude_sale_items']")
    public WebElement checkBoxExcludeSaleItems;

    @FindBy(xpath = "//select[@id='exclude_product_categories']")
    public WebElement dropDowmMenuExcludeCategories;

    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Coupon Successfully Published.']")
    public WebElement textMessage;


    //==============================GULSUM=================================================

    @FindBy(xpath = "//a[@href='https://tradylinn.com/my-account-2/']")
    public WebElement Hesabim;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement Login;

    @FindBy(xpath ="//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement StoreManeger;

    @FindBy(xpath = "(//span[@class='text'])[7]")
    public WebElement Musteriler;

    @FindBy(xpath = "(//span[@class='text'])[19]")
    public WebElement YeniEkle;

    @FindBy(xpath = "//input[@id='user_name']")
    public WebElement CustomerUsername;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement CustomerEmail;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement CustomerFirstName;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement CustomerLastName;

    @FindBy(xpath = "//input[@id='bfirst_name']")
    public WebElement BillingFirstName;

    @FindBy(xpath = "//input[@id='blast_name']")
    public WebElement BillingLastName;

    @FindBy(xpath = "//input[@id='bcompany_name']")
    public WebElement CompanyName;

    @FindBy(xpath = "//input[@id='bphone']")
    public WebElement Phone;

    @FindBy(xpath = "//input[@id='baddr_1']")
    public WebElement Addrees1;

    @FindBy(xpath = "//input[@id='baddr_2']")
    public WebElement Addrees2;

    @FindBy(xpath = "//select[@id='bcountry']")
    public WebElement Country;

    @FindBy(xpath = "//input[@id='bcity']")
    public WebElement City;

    @FindBy(xpath = "//select[@id='bstate']")
    public WebElement State;

    @FindBy(xpath = "//input[@id='bzip']")
    public WebElement Postcode;

    @FindBy(xpath = "//input[@id='same_as_billing']")
    public WebElement SameBilling;

    @FindBy(xpath = "//input[@name='submit-data']")
    public WebElement Submit;

    @FindBy(xpath = "//div[@class='wcfm-message']")
    public WebElement CustomerSaved;

    @FindBy(xpath = "//input[@id='sfirst_name']")
    public WebElement Firstname1;

    @FindBy(xpath = "//input[@id='slast_name']")
    public WebElement Lastname1;

    @FindBy(xpath = "//input[@id='scompany_name']")
    public WebElement CompanyName1;

    @FindBy(xpath = "//input[@id='saddr_1']")
    public WebElement Addrees11;

    @FindBy(xpath = "//input[@id='saddr_2']")
    public WebElement Addrees22;

    @FindBy(xpath = "//select[@id='scountry']")
    public WebElement Country1;

    @FindBy(xpath = "//input[@id='scity']")
    public WebElement City1;

    @FindBy(xpath = "//select[@id='sstate']")
    public WebElement State1;

    @FindBy(xpath = "//input[@id='szip']")
    public WebElement Postcode1;

    @FindBy(xpath = "//input[@name='submit-data']")
    public WebElement Submit1;

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton2;

    @FindBy(xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabimButton;

    // @FindBy(xpath = "//*[text()='Store Manager']")
    // public WebElement storeManagerButton;

    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement aramaCubugu;

    @FindBy(xpath = "//*[@id=\"product-10029\"]/div[2]/div/form/div/div/div/button")
    public WebElement sepeteClick;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/div/div/div[7]/div/div/a")
    public WebElement sepetimeClick;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/div/div/div[7]/div/div/div[2]/div/p[2]/a[2]")
    public WebElement odemeClick;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    public WebElement siparisiOnayla;

    @FindBy(xpath = "//*[@id=\"menu-item-1074\"]/a")
    public WebElement hesabımClick;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]/a")
    public WebElement storeManagerButtonClick;

    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[6]/a/span[2]")
    public WebElement emirlerClick;

    @FindBy(xpath = "//*[@id=\"wcfm-orders\"]/tbody/tr[1]/td[9]/a[2]/span")
    public WebElement viewDetailsClick;

    @FindBy(xpath = "//*[@id=\"wcfm_order_status\"]")
    public WebElement orderStatus;

    @FindBy(xpath = "//*[@id=\"wcfm_modify_order_status\"]")
    public WebElement upDate;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[3]/a")
    public WebElement siparsler;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[5]/a[2]")
    public WebElement destek;

    @FindBy(xpath = "//*[@id=\"wcfm_support_category\"]")
    public WebElement kategori;

    @FindBy(xpath = "//*[@id=\"wcfm_support_priority\"]")
    public WebElement oncelik;

    @FindBy(xpath = "//*[@id=\"wcfm_support_product\"]")
    public WebElement urun;

    @FindBy(xpath = "//*[@id=\"wcfm_support_query\"]")
    public WebElement ıssues;

    @FindBy(xpath = "//*[@id=\"wcfm_support_submit_button\"]")
    public WebElement submit;

    @FindBy(xpath = "//*[@id=\"wcfm-orders\"]/tbody/tr[1]/td[9]/a[2]")
    public WebElement refundRequest;

    @FindBy(xpath = "//*[@id=\"wcfm_refund_request\"]")
    public WebElement mode;

    @FindBy(xpath = "//*[@id=\"order_line_items\"]/tr/td[3]/select")
    public WebElement qty;

    @FindBy(xpath = "//textarea[@id='wcfm_refund_reason']")
    public WebElement reason;

    @FindBy(xpath = "//input[@id='wcfm_refund_requests_submit_button']")
    public WebElement submitRequest;

    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[9]/a/span[2]")
    public WebElement geriOdemeClick;

    @FindBy(xpath = "//tr[@role='row']")
    public WebElement tabloYazdır;
    //(//tr[@role='row'])[6]/td[2]

    //==============================NEVAL=================================================

    @FindBy(xpath = "//span[contains(text(),'Giriş Yap')]")
    public WebElement girisYap1;
    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabım;
    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[1]")
    public WebElement emailBox;
    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]")
    public WebElement passwordBox;
    // @FindBy(xpath = "(//*[@class='row gutter-lg']//a)[2]")
    //public WebElement storeManager;
    @FindBy(xpath = "(//*[@class='wcfm_menu_item '])[10]")
    public WebElement takipcilertık;
    @FindBy(xpath = "(//*[@id='wcfm_menu']//div)[17]")
    //span[normalize-space()='incelemeler']
    public WebElement incelemelertık;
    @FindBy(xpath = "//tbody//tr")
    public WebElement takipci;
    @FindBy(xpath = "(//*[text()='Product Reviews'])[1]")
    public WebElement productReviews;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> kullaniciBilgisi;
    @FindBy(xpath = "//tbody//tr//td[3]")
    public List<WebElement> yorum;
    @FindBy(xpath = "//tbody//tr//td[4]")
    public List<WebElement> puan;
    @FindBy(xpath = "//tbody//tr//td[6]")
    public List<WebElement> bilgiTarihi;
    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-reports']")
    public WebElement raporlar;
    @FindBy(xpath = "//input[@class='wcfm-date-range']")
    public WebElement custom;
    //div[@class='wcfm-date-range-field']
    @FindBy(xpath = "//input[@class='apply-btn disabled']")
    public WebElement close;
    @FindBy(xpath = "//ul[@class='chart-legend']")
    public WebElement raporlarTablo;
    //li[@class='active']
    @FindBy(xpath = "//a[@href='/store-manager/reports-sales-by-date/?range=year']")
    public WebElement raporlarYear;
    @FindBy(xpath = "//*[@class='chart-legend']")
    public  WebElement raporlarlastMonth;
    @FindBy(xpath = "//a[@href='/store-manager/reports-sales-by-date/?range=month']")
    public  WebElement raporlarthisMonth;
    @FindBy(xpath = "//a[@href='/store-manager/reports-sales-by-date/?range=7day']")
    public  WebElement raprlarlast7Days;

    //==============================ZAKIR=================================================



    //==============================AHMET=================================================


}
