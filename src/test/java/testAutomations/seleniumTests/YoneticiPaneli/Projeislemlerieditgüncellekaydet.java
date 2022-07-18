package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Projeislemlerieditgüncellekaydet extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Proje İşlemleri')]")
    public WebElement projeislemleriBtn;


    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement edit;


    @FindBy(xpath = "//button[contains(text(),'Güncelle')]")
    public WebElement güncelle;




    @Test
    public void testProjeislemlerieditgüncellekaydet() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(projeislemleriBtn));
        projeislemleriBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(edit));
        edit.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(güncelle));
        güncelle.click();




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


