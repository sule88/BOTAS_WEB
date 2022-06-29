package testAutomations.seleniumTests.CizimAraclariMetinEkle;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class MetinEkleDüzenlemePaneliindirdgn extends testAutomations.TestBase {
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


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[3]")
    public WebElement indirBtn;

    @FindBy(xpath = "//span[contains(text(),'DGN')]")
    public WebElement dgnBtn;

    @FindBy(css = "#modal-content-text > div > div.divider.default.text")
    public WebElement projeksiyonSecimi;

    @FindBy(css= "#modal-content-text > div > div.visible.menu.transition > div.selected.item")
    public WebElement dereceninOndaligi;

    @FindBy(xpath = "//button[contains(text(),'Dosyayı İndir')]")
    public WebElement dosyaindir;











//    @FindBy(xpath = "//span[contains(text(),'DGN')]")
//    public WebElement dgnBtn;

    @FindBy(xpath = "//span[contains(text(),'KML')]")
    public WebElement kmlBtn;

    @FindBy(xpath = "//span[contains(text(),'SHP')]")
    public WebElement shpBtn;

    @FindBy(xpath = "//span[contains(text(),'TAB')]")
    public WebElement tabBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/button[1]")
    public WebElement silBtn;





    @Test
    public void testMetinEkleDüzenlemePaneliindirdgn() throws Exception {
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



        Fwait.until(ExpectedConditions.visibilityOf(indirBtn));
        indirBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(dgnBtn));
        dgnBtn.click();



        Fwait.until(ExpectedConditions.visibilityOf(projeksiyonSecimi));
        projeksiyonSecimi.click();
//        projeksiyonSecimi.sendKeys(Keys.ENTER);
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(dereceninOndaligi));
        dereceninOndaligi.click();


        Fwait.until(ExpectedConditions.visibilityOf(dosyaindir));
        dosyaindir.click();








//        Fwait.until(ExpectedConditions.visibilityOf(dgnBtn));
//        dgnBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(kmlBtn));
//        kmlBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(shpBtn));
//        shpBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(tabBtn));
//        tabBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(silBtn));
//        silBtn.click();
//




















        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
