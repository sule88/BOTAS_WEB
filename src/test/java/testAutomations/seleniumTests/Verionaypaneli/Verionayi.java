package testAutomations.seleniumTests.Verionaypaneli;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Verionayi extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;


    @FindBy(xpath = "//div[@id='veri-onay-paneli']")
    public WebElement verionaypanelibtn;

    @FindBy(css = "#confirm_panel_accordion > div.title > div > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-3 > i")
    public WebElement asbuiltoku;
//
//    @FindBy(css = "#confirm_panel_accordion > div.content.active > div > div > div > div:nth-child(1) > div:nth-child(2) > div > div > div > div > div > div > table > tbody > tr:nth-child(1) > td.MuiTableCell-root.MuiTableCell-body.MuiTableCell-paddingNone > div > button > span.MuiIconButton-label > i")
//    public WebElement paylaşimiincele;

    @FindBy(css = "#confirm_panel_accordion > div.content.active > div > div > div > div:nth-child(1) > div.extra.content > div > div > div:nth-child(1) > button")
    public WebElement tumunugorbtn;


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

     @FindBy(css = "#root > div > div:nth-child(3) > div.tool-menu > div:nth-child(5) > div > div > div.layers-section > div > div > div.ui.bottom.attached.segment.active.tab > div > div > div.rc-tree-list > div > div > div > div.rc-tree-treenode.rc-tree-treenode-switcher-close.rc-tree-treenode-leaf-last > span.rc-tree-checkbox")
    public WebElement botasIstasyonlar;

    @FindBy(css = ("#jsPanel-1 > div.jsPanel-hdr.jsPanel-hdr-dark > div.jsPanel-headerbar > div.jsPanel-controlbar > button.jsPanel-btn.jsPanel-btn-minimize.jsPanel-btn-md"))
    public  WebElement gapat;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
    public WebElement info;




    @Test
    public void testVerionayi() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(yonetimButonu));
        yonetimButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(verionaypanelibtn));
        verionaypanelibtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(asbuiltoku));
        asbuiltoku.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(paylaşimiincele));
//        paylaşimiincele.click();


        Fwait.until(ExpectedConditions.visibilityOf(katmanKontroluBtn));
        katmanKontroluBtn.click();

//        Fwait.until(ExpectedConditions.visibilityOf(sekmeAcBtn1));
//        sekmeAcBtn1.click();
//        Thread.sleep(3000);

//
//        Fwait.until(ExpectedConditions.visibilityOf(botasDogalgazhattiBtn));
//        botasDogalgazhattiBtn.click();
//        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(botasIstasyonlar));
        botasIstasyonlar.click();
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(tumunugorbtn));
        tumunugorbtn.click();
        Thread.sleep(2000);
        gapat.click();
        Thread.sleep(1000);


        try {
            bilgiAl.click();
            harita.click();
        } catch (Exception e) {
            Logger.warn("Olimpos hattından bilgi alınamadı..");
        }

        Fwait.until(ExpectedConditions.visibilityOf(info));


        String bodyText = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains("tesis"));

        Thread.sleep(3000);




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


