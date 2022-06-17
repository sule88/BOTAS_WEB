package testAutomations.seleniumTests.CizimleriTemizle;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class CizimleriTemizle extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[4]/i[1]")
    public WebElement cizimAraclariBtn;

    @FindBy(xpath = "//button[@id='btnCizgiEkle']")
    public WebElement cizgiEkleBtn;

    @FindBy(id = "map")
    public WebElement haritayatikla;

    @FindBy(xpath = "//button[@id='cizimOzellikleriniAc']")
    public WebElement  cizimOzellikleriniAc;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/span[1]")
    public WebElement  panelKapat;

    @FindBy(xpath = "//button[@id='cizimleriTemizle']")
    public WebElement  cizimleriTemizle;


    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.green.button")
    public WebElement  evet;





//    @FindBy(xpath = "//input[@id='editor-xCoord']")
//    public WebElement koordinatxBtn;
//
//    @FindBy(xpath = "//input[@id='editor-yCoord']")
//    public WebElement koordinatyBtn;





//
//    @FindBy(xpath = "//button[contains(text(),'Koordinata Git')]")
//    public WebElement koordinataGitBtn;




    @Test
    public void testCizimleriTemizle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(cizimAraclariBtn));
        cizimAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizgiEkleBtn));
        cizgiEkleBtn.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();

        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(50, 0).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, 100).release().perform();
        builder2.doubleClick().perform();


        Fwait.until(ExpectedConditions.visibilityOf(panelKapat));
        panelKapat.click();


        Fwait.until(ExpectedConditions.visibilityOf(cizimOzellikleriniAc));
        cizimOzellikleriniAc.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();
        Thread.sleep(3000);



        Fwait.until(ExpectedConditions.visibilityOf(panelKapat));
        panelKapat.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizimleriTemizle));
        cizimleriTemizle.click();


        Fwait.until(ExpectedConditions.visibilityOf(evet));
        evet.click();

        Thread.sleep(3000);
















//        Fwait.until(ExpectedConditions.visibilityOf(nokta1));
//        nokta1.click();
//        nokta1.getLocation();
//        Thread.sleep(3000);





//        Fwait.until(ExpectedConditions.visibilityOf(koordinatxBtn));
//        koordinatxBtn.click();
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(koordinatyBtn));
//        koordinatyBtn.click();






        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
