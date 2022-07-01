package testAutomations.seleniumTests.Googleyolaltlıgı;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class Altlıklar extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]")
    public WebElement AltlıklarBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/img[1]")
    public WebElement Altliksiz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]")
    public WebElement GoogleYolAltligi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]")
    public WebElement GoogleYolEtiketsiz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]")
    public WebElement Googleuydualtligi;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]")
    public WebElement Googleuyduetiketsiz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[2]/div[3]")
    public WebElement Googlefizikselaltligi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[1]")
    public WebElement Googlefizikseletiketsiz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/img[1]")
    public WebElement GoogleOsm;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[3]/div[3]")
    public WebElement GoogleOsmetiketsiz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[4]/div[1]")
    public WebElement Bingyolaltligi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[4]/div[2]")
    public WebElement Binguydualtligi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[4]/div[3]")
    public WebElement Binghibrit;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[5]/div[1]")
    public WebElement Hgmuydu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[5]/div[2]")
    public WebElement Hgmuyduetiketsiz;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[5]/div[3]/img[1]")
    public WebElement HgmTile;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[6]/div[1]")
    public WebElement Yandexyol;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[2]/div[1]/div[6]/div[2]")
    public WebElement Yandexuydu;



    @Test
    public void testAltlıklar() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(AltlıklarBtn));


        try {
            AltlıklarBtn.click();
        } catch (Exception e) {
            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
        }



        try {
            Altliksiz.click();
        } catch (Exception e) {
            Logger.warn("Altlıksız butonu tıklanmadı.");
        }
        Thread.sleep(3000);

        try {
            GoogleYolAltligi.click();
        } catch (Exception e) {
            Logger.warn("Google yol altlığı butonu tıklanmadı.");
        }


        try {
            GoogleYolEtiketsiz.click();
        } catch (Exception e) {
            Logger.warn("Google yol etiketsiz butonu tıklanmadı.");
        }


        try {
            Googleuydualtligi.click();
        } catch (Exception e) {
            Logger.warn("Google uydu altlıgı butonu tıklanmadı.");
        }


        try {
            Googleuyduetiketsiz.click();
        } catch (Exception e) {
            Logger.warn("Google uydu etiketsiz butonu tıklanmadı.");
        }



        try {
            Googlefizikselaltligi.click();
        } catch (Exception e) {
            Logger.warn("Google fiziksel altlıgı butonu tıklanmadı.");
        }



        try {
            Googlefizikseletiketsiz.click();
        } catch (Exception e) {
            Logger.warn("Google fiziksel etiketsiz butonu tıklanmadı.");
        }




        try {
            GoogleOsm.click();
        } catch (Exception e) {
            Logger.warn("Google Osm  butonu tıklanmadı.");
        }



        try {
            GoogleOsmetiketsiz.click();
        } catch (Exception e) {
            Logger.warn("Google Osm etiketsiz  butonu tıklanmadı.");
        }




        try {
            Bingyolaltligi.click();
        } catch (Exception e) {
            Logger.warn("Bing yol altlıgı  butonu tıklanmadı.");
        }


        try {
            Binguydualtligi.click();
        } catch (Exception e) {
            Logger.warn("Bing uydu altlıgı  butonu tıklanmadı.");
        }



        try {
            Binghibrit.click();
        } catch (Exception e) {
            Logger.warn("Bing hibrit  butonu tıklanmadı.");
        }

        try {
           Hgmuydu.click();
        } catch (Exception e) {
            Logger.warn("Hgm uydu butonu tıklanmadı.");
        }


        try {
            Hgmuyduetiketsiz.click();
        } catch (Exception e) {
            Logger.warn("Hgm uydu etiketsiz tıklanmadı.");
        }



        try {
            HgmTile.click();
        } catch (Exception e) {
            Logger.warn("Hgm tile tıklanmadı.");
        }


        try {
            Yandexyol.click();
        } catch (Exception e) {
            Logger.warn("Yandex yol tıklanmadı.");
        }



        try {
            Yandexuydu.click();
        } catch (Exception e) {
            Logger.warn("Yandex uydu tıklanmadı.");
        }











        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}