package testAutomations.seleniumTests.AramaYap;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class GoogleArama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[3]/i[1]")
    public WebElement aramaYapButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/button[3]/i[1]")
    public WebElement googleAramaYapButonu ;


    @FindBy(xpath = "//input[@id='google-searchbox-autocomplete']")
    public WebElement  aramaicerik;



    @Test
    public void testGoogleArama() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(aramaYapButonu));
        aramaYapButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(googleAramaYapButonu));
        googleAramaYapButonu.click();



        Fwait.until(ExpectedConditions.visibilityOf(aramaicerik));
        try {
            aramaicerik.sendKeys("ankara");
        } catch (Exception e) {
            Logger.warn("adres gir");
        }


        Fwait.until(ExpectedConditions.visibilityOf(aramaicerik));
        aramaicerik.click();
        Thread.sleep(2000);
        aramaicerik.sendKeys(Keys.DOWN);
        aramaicerik.sendKeys(Keys.ENTER);








//        try {
//            elementVarName.click();
//        } catch (Exception e) {
//            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
//        }

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}