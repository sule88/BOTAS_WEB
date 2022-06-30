package testAutomations.seleniumTests.CizimAraclariAlanEkle;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class AlanEkleDüzenlemePaneliİslemler extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[4]/i[1]")
    public WebElement cizimAraclariBtn;

    @FindBy(xpath = "//button[@id='btnAlanEkle']")
    public WebElement alanEkleBtn;

    @FindBy(id = "map")
    public WebElement haritayatikla;

    @FindBy(id = "editor-name")
    public WebElement metinadiimlec;


    @FindBy(xpath = "//select[@id='editor-stil']")
    public WebElement stilBtn;


    @FindBy(xpath = "//input[@id='editor-fill']")
    public WebElement yaziRengiBtn;




    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[14]/div[1]")
    public WebElement golgeBtn;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[14]/div[1]")
    public WebElement yaziKonumBtn;

    @FindBy(xpath = "//input[@id='editor-rotation']")
    public WebElement yaziDondurBtn;

    @FindBy(xpath = "//input[@id='editor-fillColor']")
    public WebElement dolguRenkBtn;

    @FindBy(xpath = "//input[@id='editor-fillOpacity']")
    public WebElement gorunurlukBtn;

    @FindBy(xpath = "//select[@id='editor-lineDash']")
    public WebElement cizgitipiBtn;

    @FindBy(xpath = "//select[@id='editor-font']")
    public WebElement fontBtn;

    @FindBy(xpath = "//input[@id='editor-size']")
    public WebElement yaziBoyutuBtn;

    @FindBy(xpath = "//input[@id='editor-fillStroke']")
    public WebElement yaziCevresiBtn;

    @FindBy(xpath = "//select[@id='editor-textBaseline']")
    public WebElement yaziPozisyonBtn;

    @FindBy(xpath = "//select[@id='editor-textAlign']")
    public WebElement yaziKaydirBtn;

    @FindBy(xpath = "//input[@id='editor-color']")
    public WebElement cizgiRenkBtn;

    @FindBy(xpath = "//input[@id='editor-width']")
    public WebElement cizgiKalinlikBtn;

    @FindBy(xpath = "//input[@id='editor-buffer']")
    public WebElement bufferBtn;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[2]/i[1]")
    public WebElement islemlerBtn;

    @FindBy(xpath = "//span[contains(text(),'Açıklama Listele')]")
    public WebElement aciklamaListele;

    @FindBy(xpath = "//body/div[5]/div[1]/div[3]/div[1]/button[1]")
    public WebElement aciklamaListeleiptal;


    @FindBy(xpath = "//span[contains(text(),'Açıklama Ekle')]")
    public WebElement aciklamaEkle;

    @FindBy(xpath = "//input[@id='attribute-title']")
    public WebElement Baslik;

    @FindBy(xpath = "//input[@id='attribute-detail']")
    public WebElement icerik;

    @FindBy(xpath = "//body/div[5]/div[1]/div[3]/div[1]/button[1]/i[1]")
    public WebElement Ekle;

    @FindBy(xpath = "//span[contains(text(),'Sıfırla')]")
    public WebElement sifirla;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.red.button > i")
    public WebElement iptal;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.green.button > i")
    public WebElement sil;













//    @FindBy(xpath = "//input[@id='editor-xCoord']")
//    public WebElement koordinatxBtn;
//
//    @FindBy(xpath = "//input[@id='editor-yCoord']")
//    public WebElement koordinatyBtn;










//
//    @FindBy(xpath = "//button[contains(text(),'Koordinata Git')]")
//    public WebElement koordinataGitBtn;





    @Test
    public void testAlanEkleDüzenlemePaneliİslemler() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(cizimAraclariBtn));
        cizimAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(alanEkleBtn));
        alanEkleBtn.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();



        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, 150).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(150, 0).release().perform();
        builder2.doubleClick().perform();

        Actions builder3 = new Actions(driver);
        builder3.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, -150).release().perform();
        builder3.doubleClick().perform();








        Fwait.until(ExpectedConditions.visibilityOf(metinadiimlec));
        metinadiimlec.click();
        metinadiimlec.sendKeys("Metin3");
        metinadiimlec.clear();


        Fwait.until(ExpectedConditions.visibilityOf(stilBtn));
        stilBtn.click();
        stilBtn.sendKeys(Keys.DOWN);
        stilBtn.sendKeys(Keys.ENTER);


        Fwait.until(ExpectedConditions.visibilityOf(yaziRengiBtn));
        yaziRengiBtn.click();



        Fwait.until(ExpectedConditions.visibilityOf(golgeBtn));
        golgeBtn.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(yaziKonumBtn));
        yaziKonumBtn.click();
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(yaziDondurBtn));
        yaziDondurBtn.click();
        yaziDondurBtn.getCssValue("94");
        Thread.sleep(2000);

        Fwait.until(ExpectedConditions.visibilityOf(dolguRenkBtn));
        dolguRenkBtn.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(gorunurlukBtn));
        gorunurlukBtn.click();
        Thread.sleep(3000);
        gorunurlukBtn.getCssValue("98");
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(cizgitipiBtn));
        cizgitipiBtn.click();
        cizgitipiBtn.sendKeys(Keys.ARROW_UP);
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(fontBtn));
        fontBtn.click();
        fontBtn.sendKeys(Keys.DOWN);


        Fwait.until(ExpectedConditions.visibilityOf(yaziBoyutuBtn));
        yaziBoyutuBtn.click();
        yaziBoyutuBtn.clear();
        yaziBoyutuBtn.sendKeys("30");


        Fwait.until(ExpectedConditions.visibilityOf(yaziCevresiBtn));
        yaziCevresiBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(yaziPozisyonBtn));
        yaziPozisyonBtn.click();
        yaziPozisyonBtn.sendKeys(Keys.DOWN);
        yaziPozisyonBtn.sendKeys(Keys.ENTER);


        Fwait.until(ExpectedConditions.visibilityOf(yaziKaydirBtn));
        yaziKaydirBtn.click();
        yaziKaydirBtn.sendKeys(Keys.ARROW_UP);


        Fwait.until(ExpectedConditions.visibilityOf(cizgiRenkBtn));
        cizgiRenkBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizgiKalinlikBtn));
        cizgiKalinlikBtn.click();
        cizgiKalinlikBtn.clear();
        cizgiKalinlikBtn.sendKeys("15");


        Fwait.until(ExpectedConditions.visibilityOf(bufferBtn));
        bufferBtn.click();
        bufferBtn.sendKeys("500");


        Fwait.until(ExpectedConditions.visibilityOf(islemlerBtn));
        islemlerBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(aciklamaListele));
        aciklamaListele.click();

        Fwait.until(ExpectedConditions.visibilityOf(aciklamaListeleiptal));
        aciklamaListeleiptal.click();
        islemlerBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(aciklamaEkle));
        aciklamaEkle.click();

        Fwait.until(ExpectedConditions.visibilityOf(Baslik));
        Baslik.click();
        Baslik.sendKeys("Test7");

        Fwait.until(ExpectedConditions.visibilityOf(icerik));
        icerik.click();
        icerik.sendKeys("Test8");
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(Ekle));
        Ekle.click();
        Thread.sleep(3000);

        islemlerBtn.click();


        Fwait.until(ExpectedConditions.visibilityOf(sifirla));
        sifirla.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(sil));
        sil.click();
        Thread.sleep(2000);

        Thread.sleep(3000);







//        Fwait.until(ExpectedConditions.visibilityOf(koordinatxBtn));
//        koordinatxBtn.click();
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(koordinatyBtn));
//        koordinatyBtn.click();







//        Fwait.until(ExpectedConditions.visibilityOf(koordinataGitBtn));
//        koordinataGitBtn.click();





        Thread.sleep(3000);

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
