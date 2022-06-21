package testAutomations.seleniumTests.TumunuSil;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class SilHayir extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//button[@id='btnHaritayıTemizle']")
    public WebElement tumunuSil;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.red.button")
    public WebElement  hayir;





    @Test
    public void testSilHayir() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(tumunuSil));
        tumunuSil.click();

        Fwait.until(ExpectedConditions.visibilityOf(hayir));
        hayir.click();





















        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}