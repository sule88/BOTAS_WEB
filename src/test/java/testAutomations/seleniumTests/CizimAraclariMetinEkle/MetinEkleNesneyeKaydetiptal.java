package testAutomations.seleniumTests.CizimAraclariMetinEkle;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class MetinEkleNesneyeKaydetiptal extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[4]/i[1]")
    public WebElement cizimAraclariBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/button[1]/i[1]")
    public WebElement metinEkleBtn;

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


    @FindBy(xpath = "//select[@id='editor-textAlign']")
    public WebElement yaziKaydirBtn;


//    @FindBy(xpath = "//input[@id='editor-xCoord']")
//    public WebElement koordinatxBtn;
//
//    @FindBy(xpath = "//input[@id='editor-yCoord']")
//    public WebElement koordinatyBtn;

    @FindBy(xpath = "//select[@id='editor-font']")
    public WebElement fontBtn;

    @FindBy(xpath = "//input[@id='editor-size']")
    public WebElement yaziBoyutuBtn;

    @FindBy(xpath = "//input[@id='editor-fillStroke']")
    public WebElement yaziCevresiBtn;

    @FindBy(xpath = "//select[@id='editor-textBaseline']")
    public WebElement yaziPozisyonBtn;

    @FindBy(xpath = "//input[@id='editor-rotation']")
    public WebElement yaziDondurBtn;
//
//    @FindBy(xpath = "//button[contains(text(),'Koordinata Git')]")
//    public WebElement koordinataGitBtn;

    @FindBy(xpath = "//div[contains(text(),'Kayıt Tipi')]")
    public WebElement kayitTipiBtn;

    @FindBy(xpath = "//span[contains(text(),'Nesneye Kaydet')]")
    public WebElement nesneyeKaydetBtn;

    @FindBy(xpath = "//div[contains(text(),'Nesne seçimi')]")
    public WebElement nesneSecimi;

    @FindBy(xpath = "//div[@id='901']")
    public WebElement varOlanNesneSecimi;

    @FindBy(xpath = "//body/div[5]/div[1]/div[3]/div[1]/button[2]")
    public WebElement nesneyeKaydetiptal;








    @Test
    public void testMetinEkleNesneyeKaydetiptal() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(cizimAraclariBtn));
        cizimAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(metinEkleBtn));
        metinEkleBtn.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


        Fwait.until(ExpectedConditions.visibilityOf(metinadiimlec));
        metinadiimlec.click();
        metinadiimlec.sendKeys("Metin1");


        Fwait.until(ExpectedConditions.visibilityOf(stilBtn));
        stilBtn.click();
        stilBtn.sendKeys(Keys.DOWN);
        stilBtn.sendKeys(Keys.ENTER);


        Fwait.until(ExpectedConditions.visibilityOf(yaziRengiBtn));
        yaziRengiBtn.click();



        Fwait.until(ExpectedConditions.visibilityOf(golgeBtn));
        golgeBtn.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(yaziKaydirBtn));
        yaziKaydirBtn.click();
        yaziKaydirBtn.sendKeys(Keys.DOWN);

//        Fwait.until(ExpectedConditions.visibilityOf(koordinatxBtn));
//        koordinatxBtn.click();
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(koordinatyBtn));
//        koordinatyBtn.click();

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

        Fwait.until(ExpectedConditions.visibilityOf(yaziDondurBtn));
        yaziDondurBtn.click();
        yaziDondurBtn.getCssValue("94");
        Thread.sleep(2000);


        Fwait.until(ExpectedConditions.visibilityOf(kayitTipiBtn));
        kayitTipiBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(nesneyeKaydetBtn));
        nesneyeKaydetBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(nesneSecimi));
        nesneSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(varOlanNesneSecimi));
        varOlanNesneSecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(nesneyeKaydetiptal));
        nesneyeKaydetiptal.click();
        Thread.sleep(3000);




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
