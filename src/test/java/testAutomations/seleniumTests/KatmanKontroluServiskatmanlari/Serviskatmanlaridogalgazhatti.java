package testAutomations.seleniumTests.KatmanKontroluServiskatmanlari;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Serviskatmanlaridogalgazhatti extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/label[1]/span[1]")
    public WebElement katmanKontroluBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]")
    public WebElement sekmeAcBtn1;



    @FindBy(css =" #root > div > div:nth-child(3) > div.tool-menu > div:nth-child(5) > div > div > div.layers-section > div > div > div.ui.bottom.attached.segment.active.tab > div > div > div.rc-tree-list > div > div > div > div:nth-child(1) > span.rc-tree-checkbox")
    public WebElement botasDogalgazhattiBtn;






//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[3]")
//    public WebElement botasDogalgazhattiBtn;








    @Test
    public void testServiskatmanlaridogalgazhatti() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(katmanKontroluBtn));
        katmanKontroluBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(sekmeAcBtn1));
        sekmeAcBtn1.click();
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(botasDogalgazhattiBtn));
        botasDogalgazhattiBtn.click();
        Thread.sleep(3000);




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
