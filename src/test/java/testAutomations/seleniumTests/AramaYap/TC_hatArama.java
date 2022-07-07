package testAutomations.seleniumTests.AramaYap;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

/**
 * @author Emre Örs
 * @Date 25.04.2022
 */
public class TC_hatArama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[3]/i[1]")
    public WebElement aramaYapBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/button[1]/i[1]")
    public WebElement hatAramaBtn;

    @FindBy(id = "combo-box-demo")
    public WebElement hatAramaInput;


    @FindBy(id = "combo-box-demo-option-2")
    public WebElement hatListe2;


    @FindBy(id = "map")
    public WebElement harita;


    @FindBy(id = "btnBilgiAl")
    public WebElement bilgiAl;


    @FindBy(xpath = "//span[contains(text(),'chevron_right')]")
    public WebElement NesneDetay;








    @Test
    public void testTC_HatArama() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(aramaYapBtn));


        try {
            aramaYapBtn.click();
        } catch (Exception e) {
            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(hatAramaBtn));


        try {
            hatAramaBtn.click();
        } catch (Exception e) {
            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(hatAramaInput));


        try {
            hatAramaInput.clear();
            hatAramaInput.click();
            hatAramaInput.sendKeys("Ankara");
        } catch (Exception e) {
            Logger.warn("Input doldurulamadı.");
        }


        Fwait.until(ExpectedConditions.visibilityOf(hatListe2));


        try {
            hatListe2.click();
        } catch (Exception e) {
            Logger.warn("Listedeki üçüncü hat gelmedi.");
        }

        Thread.sleep(3000);

        try {
            bilgiAl.click();
            harita.click();
        } catch (Exception e) {
            Logger.warn("Listedeki üçüncü hat gelmedi.");
        }


        Fwait.until(ExpectedConditions.visibilityOf(NesneDetay));


        try {
            NesneDetay.click();
        } catch (Exception e) {
            Logger.warn("Detay gelmedi.");
        }



//        String bodyText = driver.findElement(By.tagName("body")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}