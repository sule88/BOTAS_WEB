package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class KullaniciEkleİptal extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Kullanıcılar')]")
    public WebElement kullaniciButonu;

    @FindBy(xpath = "//button[contains(text(),'Kullanıcı Ekle')]")
    public WebElement kullaniciEkleButonu;

//
//    @FindBy(xpath = "//body/div[7]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
//    public WebElement İsimtext;
//
//    @FindBy(xpath = "//body/div[7]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]")
//    public WebElement Soyisimtext;
//
//
//    @FindBy(xpath = "//body/div[7]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]")
//    public WebElement Kullaniciadi;
//
//    @FindBy(xpath = "//body/div[7]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div[1]/input[1]")
//    public WebElement Telno;
//
//    @FindBy(xpath = "//body/div[7]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/input[1]")
//    public WebElement email;
//
//
//    @FindBy(xpath = "//input[@id='standard-password-input']")
//    public WebElement KullanıcıSifresi;
//
//    @FindBy(xpath = "//a[contains(text(),'Roller')]")
//    public WebElement Roller;
//
//
//    @FindBy(xpath = "//td[contains(text(),'Sistem Kullanıcısı')]")
//    public WebElement Sistemkullanicisi;

    @FindBy(xpath = "//body/div[7]/div[1]/div[3]/button[1]")
    public WebElement iptal;



    @Test
    public void testKullaniciEkleİptal() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(yonetimButonu));
        yonetimButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(yoneticiPanelButonu));
        yoneticiPanelButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(kullaniciButonu));
        kullaniciButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(kullaniciEkleButonu));
        kullaniciEkleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(iptal));
        iptal.click();




//        Fwait.until(ExpectedConditions.visibilityOf(İsimtext));
//        İsimtext.click();
//        İsimtext.sendKeys("Test");
//

//        Fwait.until(ExpectedConditions.visibilityOf(Soyisimtext));
//        Soyisimtext.click();
//        Soyisimtext.sendKeys("Testsoyisim");
//
//        Fwait.until(ExpectedConditions.visibilityOf(Kullaniciadi));
//        Kullaniciadi.click();
//        Kullaniciadi.sendKeys("botas");
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(Telno));
//        Telno.click();
//        Telno.sendKeys("5065487521");
//
//        Fwait.until(ExpectedConditions.visibilityOf(email));
//        email.click();
//        email.sendKeys("botas@hotmail.com");
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(KullanıcıSifresi));
//        KullanıcıSifresi.click();
//        KullanıcıSifresi.sendKeys("1234");
//
//        Fwait.until(ExpectedConditions.visibilityOf(Roller));
//        Roller.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(Sistemkullanicisi));
//        Sistemkullanicisi.click();

//        try {
//            Fwait.until(ExpectedConditions.visibilityOf(kullaniciyikaydet));
//        }catch (Exception e){
//            Logger.warn("Kullanıcı kaydedilmedi");
//        }
//        kullaniciyikaydet.click();
//
//


        Thread.sleep(30000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


