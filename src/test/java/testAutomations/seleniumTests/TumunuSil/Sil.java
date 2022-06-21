package testAutomations.seleniumTests.TumunuSil;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class Sil extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[8]")
    public WebElement CiktiAraclari;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[7]/button[1]/i[1]")
    public WebElement EkranGoruntusuAl;






    @Test
    public void testSil() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(CiktiAraclari));
        CiktiAraclari.click();

        Fwait.until(ExpectedConditions.visibilityOf(EkranGoruntusuAl));
        EkranGoruntusuAl.click();





















        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}