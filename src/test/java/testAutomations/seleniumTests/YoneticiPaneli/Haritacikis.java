package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Haritacikis extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//button[contains(text(),'Çıkış')]")
    public WebElement cikisButonu;



    @Test
    public void testHaritacikis() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(yonetimButonu));
        yonetimButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(yoneticiPanelButonu));
        yoneticiPanelButonu.click();


        Thread.sleep(5000);
        Fwait.until(ExpectedConditions.visibilityOf(cikisButonu));
        cikisButonu.click();






        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


