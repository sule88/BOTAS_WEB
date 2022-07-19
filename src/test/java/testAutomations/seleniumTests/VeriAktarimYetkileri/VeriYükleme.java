package testAutomations.seleniumTests.VeriAktarimYetkileri;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class VeriYükleme extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;


    @FindBy(xpath = "//div[contains(text(),'Veri Aktarımı Yetkileri')]")
    public WebElement veriaktarimyetkileribtn;

//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]")
//    public WebElement durumdegistirbtn;

    @FindBy(xpath = "//input[@id='user-role-autocomplete']")
    public WebElement kullaniciseciniz;
//
//    @FindBy(css = "#confirm_panel_accordion > div.content.active > div > div > div > div:nth-child(1) > div:nth-child(2) > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button > span.MuiIconButton-label > i")
//    public WebElement paylaşimiincele;

    @FindBy(xpath = "//a[contains(text(),'Tablo Yetkileri')]")
    public WebElement tabloyetkileribtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]")
    public WebElement aramasatiribtn;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
    public WebElement tabloyetkisisec;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]")
    public WebElement tabloyetkisieklebtn;


    @FindBy(xpath = "//span[contains(text(),'Rma')]")
    public WebElement rmasec;









    @FindBy(id = "map")
    public WebElement harita;




    @FindBy(id = "btnBilgiAl")
    public WebElement bilgiAl;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/label[1]/span[1]")
    public WebElement katmanKontroluBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]")
    public WebElement sekmeAcBtn1;



    @FindBy(css =" #root > div > div:nth-child(3) > div.tool-menu > div:nth-child(5) > div > div > div.layers-section > div > div > div.ui.bottom.attached.segment.active.tab > div > div > div.rc-tree-list > div > div > div > div:nth-child(1) > span.rc-tree-checkbox")
    public WebElement botasDogalgazhattiBtn;





    @Test
    public void testVeriYükleme() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(yonetimButonu));
        yonetimButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf((veriaktarimyetkileribtn)));
        veriaktarimyetkileribtn.click();





        Fwait.until(ExpectedConditions.visibilityOf(kullaniciseciniz));
        kullaniciseciniz.sendKeys("botas");
        kullaniciseciniz.sendKeys(Keys.ARROW_DOWN);
        kullaniciseciniz.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

//
//        Fwait.until(ExpectedConditions.visibilityOf((durumdegistirbtn)));
//        durumdegistirbtn.click();






//
//        Fwait.until(ExpectedConditions.visibilityOf((tabloyetkileribtn)));
//        tabloyetkileribtn.click();
//
//
//        Fwait.until(ExpectedConditions.visibilityOf((aramasatiribtn)));
//        aramasatiribtn.click();
//
//
//        Fwait.until(ExpectedConditions.visibilityOf((tabloyetkisisec)));
//        tabloyetkisisec.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf((rmasec)));
//        rmasec.click();
//
//
//        Fwait.until(ExpectedConditions.visibilityOf((tabloyetkisieklebtn)));
//        tabloyetkisieklebtn.click();








//
//        Fwait.until(ExpectedConditions.visibilityOf(paylaşimiincele));
//        paylaşimiincele.click();

//
//        Fwait.until(ExpectedConditions.visibilityOf(katmanKontroluBtn));
//        katmanKontroluBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(sekmeAcBtn1));
//        sekmeAcBtn1.click();
//        Thread.sleep(3000);
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(botasDogalgazhattiBtn));
//        botasDogalgazhattiBtn.click();
//        Thread.sleep(3000);
//
//
//        Fwait.until(ExpectedConditions.visibilityOf(tumunugorbtn));
//        tumunugorbtn.click();

//
//        try {
//            bilgiAl.click();
//            harita.click();
//        } catch (Exception e) {
//            Logger.warn("Olimpos hattından bilgi alınamadı..");
//        }
//
//        Thread.sleep(3000);




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


