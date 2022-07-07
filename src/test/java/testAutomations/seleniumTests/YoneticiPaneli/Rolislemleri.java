package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Rolislemleri extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Rol İşlemleri')]")
    public WebElement Rolislemleri;

    @FindBy(xpath = "//button[contains(text(),'Rol ekle')]")
    public WebElement Rolekle;

    @FindBy(xpath = "//body/div[8]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]")
    public WebElement roladigirin;

//    @FindBy(xpath = "//body/div[9]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]")
//    public WebElement aktif;








    @Test
    public void testRolislemleri() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(Rolislemleri));
        Rolislemleri.click();

        Fwait.until(ExpectedConditions.visibilityOf(Rolekle));
        Rolekle.click();

        Fwait.until(ExpectedConditions.visibilityOf(roladigirin));
        roladigirin.click();
        roladigirin.sendKeys("TestAdmin");
//
//        Fwait.until(ExpectedConditions.visibilityOf(aktif));
//        aktif.click();















        Thread.sleep(30000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


