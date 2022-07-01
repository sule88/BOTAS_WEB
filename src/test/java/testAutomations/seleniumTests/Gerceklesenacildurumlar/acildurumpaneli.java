package testAutomations.seleniumTests.Gerceklesenacildurumlar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class acildurumpaneli extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//button[@id='gerceklesen-acil-durumlar']")
    public WebElement gerceklesenacildurumBtn;

    @FindBy(xpath ="//div[contains(text(),'Seçiniz')]")
    public WebElement AcildurumturBtn;

    @FindBy(css ="#jsPanel-1-node > div > div > div > div:nth-child(1) > div.four.wide.column > div")
    public WebElement gunlukveriBtn;


    @FindBy(xpath ="//span[contains(text(),'Deprem')]")
    public WebElement deprem;


    @FindBy(css ="#jsPanel-5-node > div > div > div > div:nth-child(2) > div > button")
    public WebElement listele;







    @Test
    public void testacildurumpaneli() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(gerceklesenacildurumBtn));


        try {
            gerceklesenacildurumBtn.click();
        } catch (Exception e) {
            Logger.warn("Acil durum butonu tıklanamadı.");
        }


        try {
            AcildurumturBtn.click();
        } catch (Exception e) {
            Logger.warn("Acil durum tür secimi yapılamadı");
        }
        Thread.sleep(3000);



        try {
            deprem.click();
        } catch (Exception e) {
            Logger.warn("deprem verisi seçilemedi.");
        }



        try {
            gunlukveriBtn.click();
            gunlukveriBtn.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            Logger.warn("Günlük veri miktarı seçilemedi.");
        }



        try {
            listele.click();
        } catch (Exception e) {
            Logger.warn("Veriler listelenmedi.");
        }

        Thread.sleep(3000);










        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}