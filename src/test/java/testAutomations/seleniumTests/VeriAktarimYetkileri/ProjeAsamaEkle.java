package testAutomations.seleniumTests.VeriAktarimYetkileri;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class ProjeAsamaEkle extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;


    @FindBy(xpath = "//div[contains(text(),'Veri Aktarımı Yetkileri')]")
    public WebElement veriaktarimyetkileribtn;


    @FindBy(xpath = "//input[@id='user-role-autocomplete']")
    public WebElement kullaniciseciniz;
//
//    @FindBy(css = "#confirm_panel_accordion > div.content.active > div > div > div > div:nth-child(1) > div:nth-child(2) > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button > span.MuiIconButton-label > i")
//    public WebElement paylaşimiincele;

    @FindBy(xpath = "//a[contains(text(),'Proje ve Aşama')]")
    public WebElement projeasama;




    @FindBy(xpath = "//button[contains(text(),'Ekle')]")
    public WebElement Eklebtn;


    @FindBy(xpath = "//div[contains(text(),'Proje Listesi')]")
    public WebElement Projelisteimlec;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/span[1]")
    public WebElement Konyaisparta;


    @FindBy(xpath = "//div[contains(text(),'Aşama Listesi')]")
    public WebElement AsamaListesi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[6]/span[1]")
    public WebElement mevcutBoruhatti;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[1]")
    public WebElement ProjeAsamaYetkisiEkle;










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
    public void testProjeAsamaEkle() throws Exception {
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







        Fwait.until(ExpectedConditions.visibilityOf((projeasama)));
        projeasama.click();




        Fwait.until(ExpectedConditions.visibilityOf((Eklebtn)));
        Eklebtn.click();


        Fwait.until(ExpectedConditions.visibilityOf((Projelisteimlec)));
        Projelisteimlec.click();

        Fwait.until(ExpectedConditions.visibilityOf((Konyaisparta)));
        Konyaisparta.click();

        Fwait.until(ExpectedConditions.visibilityOf((AsamaListesi)));
        AsamaListesi.click();

        Fwait.until(ExpectedConditions.visibilityOf((mevcutBoruhatti)));
        mevcutBoruhatti.click();

        Fwait.until(ExpectedConditions.visibilityOf((ProjeAsamaYetkisiEkle)));
        ProjeAsamaYetkisiEkle.click();















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


