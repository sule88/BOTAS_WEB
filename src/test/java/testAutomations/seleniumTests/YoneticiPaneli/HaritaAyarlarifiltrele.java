package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class HaritaAyarlarifiltrele extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Harita Ayarları')]")
    public WebElement haritaAyarlari;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement idfiltreleme;


    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/input[1]")
    public WebElement serviskatmanlari;





    @Test
    public void testHaritaAyarlarikullanicikaydet() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(haritaAyarlari));
        haritaAyarlari.click();

        Fwait.until(ExpectedConditions.visibilityOf(idfiltreleme));
        idfiltreleme.click();
        idfiltreleme.sendKeys("3");

        Fwait.until(ExpectedConditions.visibilityOf(serviskatmanlari));
        serviskatmanlari.click();
        serviskatmanlari.sendKeys("İl");







        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


