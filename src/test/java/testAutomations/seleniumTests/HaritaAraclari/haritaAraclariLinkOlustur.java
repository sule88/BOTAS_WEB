package testAutomations.seleniumTests.HaritaAraclari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class haritaAraclariLinkOlustur extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]/i[1]")
    public WebElement haritaAraclariBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[9]/button[5]/i[1]")
    public WebElement haritaLinkOlusturBtn;

    @FindBy(xpath = "//button[contains(text(),'Kopyala')]")
    public WebElement kopyalaBtn;





    @Test
    public void testharitaAraclariLinkOlustur() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(haritaAraclariBtn));


        try {
            haritaAraclariBtn.click();
        } catch (Exception e) {
            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
        }




        try {
            haritaLinkOlusturBtn.click();
        } catch (Exception e) {
            Logger.warn("Haritayı link oluştur  butonuna tıklanmadı.");
        }


        try {
            kopyalaBtn.click();
        } catch (Exception e) {
            Logger.warn("Haritada kopyala butonuna tıklanmadı.");
        }





        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}