package testAutomations.seleniumTests.Katmankontrolüarama;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Arama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/label[1]/span[1]")
    public WebElement katmanKontroluBtn;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement aramaBtn;

//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[3]")
//    public WebElement tumnesnelerimBtn;
//
//    @FindBy(xpath = "//span[contains(text(),'Çizgi ekle 3')]")
//    public WebElement nesnekenarcubugu;
//
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")
//    public WebElement paylas;
//
//    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.green.button")
//    public WebElement kodukopyala;







//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[3]")
//    public WebElement botasDogalgazhattiBtn;


    @Test
    public void testArama() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(katmanKontroluBtn));
        katmanKontroluBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(aramaBtn));
        aramaBtn.click();
        aramaBtn.sendKeys("Deplase");

//        Fwait.until(ExpectedConditions.visibilityOf(tumnesnelerimBtn));
//        tumnesnelerimBtn.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(nesnekenarcubugu));
//        nesnekenarcubugu.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(paylas));
//        paylas.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(kodukopyala));
//        kodukopyala.click();
//









        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
