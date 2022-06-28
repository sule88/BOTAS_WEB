package testAutomations.seleniumTests.OlcumAraclari;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class AlanOlcmeAraci extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[5]")
    public WebElement olcumAraclariBtn;

    @FindBy(xpath = "//button[@id='btnAlanOlcmeAraci']")
    public WebElement alanOlcmeAraci;

    @FindBy(id = "map")
    public WebElement haritayatikla;






    @Test
    public void testAlanOlcmeAraci() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(olcumAraclariBtn));
        olcumAraclariBtn.click();


        Fwait.until(ExpectedConditions.visibilityOf(alanOlcmeAraci));
        alanOlcmeAraci.click();



        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();

        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(300, 0).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, 300).release().perform();
        builder2.doubleClick().perform();




        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();
        Thread.sleep(3000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
