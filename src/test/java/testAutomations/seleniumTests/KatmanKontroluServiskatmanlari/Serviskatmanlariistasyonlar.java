package testAutomations.seleniumTests.KatmanKontroluServiskatmanlari;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Serviskatmanlariistasyonlar extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/label[1]/span[1]")
    public WebElement katmanKontroluBtn;

    @FindBy(css = "#root > div > div:nth-child(3) > div.tool-menu > div:nth-child(5) > div > div > div.layers-section > div > div > div.ui.bottom.attached.segment.active.tab > div > div > div.rc-tree-list > div > div > div > div.rc-tree-treenode.rc-tree-treenode-switcher-close.rc-tree-treenode-leaf-last > span.rc-tree-switcher.rc-tree-switcher_close")
    public WebElement sekmeAcBtn2;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/span[3]")
    public WebElement istasyonlarBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]/i[1]")
    public WebElement bilgiAl;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]")
    public  WebElement bilgiAlPencere;

    @FindBy(id = ("map"))
    public  WebElement harita;


    @Test
    public void testServiskatmanlariistasyonlar() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        try {

            Fwait.until(ExpectedConditions.visibilityOf(katmanKontroluBtn));
            Thread.sleep(1000);
            katmanKontroluBtn.click();
        }catch (Exception e){

            Logger.warn("Katman kontrol butonu tıklanmadı.");
        }





        Fwait.until(ExpectedConditions.visibilityOf(sekmeAcBtn2));
        sekmeAcBtn2.click();
        Thread.sleep(3000);
//

        Fwait.until(ExpectedConditions.visibilityOf(istasyonlarBtn));
        istasyonlarBtn.click();
        Thread.sleep(3000);
        bilgiAl.click();
        Thread.sleep(1000);
        harita.click();
        Fwait.until(ExpectedConditions.visibilityOf(bilgiAlPencere));

        String bodyText = bilgiAlPencere.getText();
        Assert.assertTrue("Text not found!", bodyText.contains("tesis"));


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
