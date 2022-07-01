package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class KullaniciEkle extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Kullanıcılar')]")
    public WebElement kullanıcıButonu;

    @FindBy(xpath = "//button[contains(text(),'Kullanıcı Ekle')]")
    public WebElement kullanıcıEkleButonu;


    @FindBy(xpath = "//body/div[10]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement İsimtext;











    @Test
    public void testSilEvet() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(kullanıcıButonu));
        kullanıcıButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(kullanıcıEkleButonu));
        kullanıcıEkleButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(İsimtext));
        İsimtext.click();



        Thread.sleep(30000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


