package testAutomations.seleniumTests.KatmanKontroluServiskatmanlari;

import org.junit.Test;
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

    @FindBy(css = "#root > div > div:nth-child(3) > div.tool-menu > div:nth-child(5) > div > div > div.layers-section > div > div > div.ui.bottom.attached.segment.active.tab > div > div > div.rc-tree-list > div > div > div > div.rc-tree-treenode.rc-tree-treenode-switcher-open.rc-tree-treenode-selected.rc-tree-treenode-leaf-last > span.rc-tree-checkbox")
    public WebElement istasyonlarBtn;




//
//    @FindBy(css ="#root > div > div:nth-child(3) > div.tool-menu > div:nth-child(5) > div > div > div.layers-section > div > div > div.ui.bottom.attached.segment.active.tab > div > div > div.rc-tree-list > div > div > div > div:nth-child(9) > span.rc-tree-checkbox")
//    public WebElement istasyonlarBtn;



    @Test
    public void testServiskatmanlariistasyonlar() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(katmanKontroluBtn));
        katmanKontroluBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(sekmeAcBtn2));
        sekmeAcBtn2.click();
        Thread.sleep(3000);
//

        Fwait.until(ExpectedConditions.visibilityOf(istasyonlarBtn));
        istasyonlarBtn.click();
        Thread.sleep(3000);




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
