
package testAutomations.seleniumTests.HaritaAraclari;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class haritaAraclariGridler extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]/i[1]")
    public WebElement haritaAraclariBtn;

    @FindBy(xpath = "//button[@id='3DerED50']")
    public WebElement  Ed50Grid3Der;

    @FindBy(xpath = "//button[@id='3DerITRF']")
    public WebElement ıtrfGrid3Der;

    @FindBy(xpath = "//button[@id='6DerITRF']")
    public WebElement ıtrfGrid6Der;

    @FindBy(xpath = "//button[@id='6DerED50']")
    public WebElement Ed50Grid6Der;

    @FindBy(xpath = "//button[@id='Wgs84']")
    public WebElement Wgs84;




    @Test
    public void testharitaAraclariGridler() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(haritaAraclariBtn));
        haritaAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(Ed50Grid3Der));
        Ed50Grid3Der.click();

        Fwait.until(ExpectedConditions.visibilityOf(ıtrfGrid3Der));
        ıtrfGrid3Der.click();

        Fwait.until(ExpectedConditions.visibilityOf(ıtrfGrid6Der));
        ıtrfGrid6Der.click();

        Fwait.until(ExpectedConditions.visibilityOf(Ed50Grid6Der));
        Ed50Grid6Der.click();

        Fwait.until(ExpectedConditions.visibilityOf(Wgs84));
        Wgs84.click();
        Wgs84.click();
        Thread.sleep(3000);





        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
