package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Filtrelemeislemi extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Kullanıcılar')]")
    public WebElement kullaniciButonu;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement idfiltreleme;


    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/div[1]/input[1]")
    public WebElement kullanicifiltrele;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/input[1]")
    public WebElement mailfiltreleme;


    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/input[1]")
    public WebElement durumfiltreleme;

    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/div[1]/input[1]")
    public WebElement onaydurumufiltreleme;






    @Test
    public void testFiltrelemeislemi() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(kullaniciButonu));
        kullaniciButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(idfiltreleme));
        idfiltreleme.click();
        idfiltreleme.sendKeys("372");

        Fwait.until(ExpectedConditions.visibilityOf(kullanicifiltrele));
        kullanicifiltrele.click();
        kullanicifiltrele.sendKeys("deniz");


        Fwait.until(ExpectedConditions.visibilityOf(mailfiltreleme));
        mailfiltreleme.click();
        mailfiltreleme.sendKeys("deniz@hotmail.com");

        Fwait.until(ExpectedConditions.visibilityOf(durumfiltreleme));
        durumfiltreleme.click();
        durumfiltreleme.sendKeys("Aktif");


        Fwait.until(ExpectedConditions.visibilityOf(onaydurumufiltreleme));
        onaydurumufiltreleme.click();
        onaydurumufiltreleme.sendKeys("Onaylandı");

//
//        Fwait.until(ExpectedConditions.visibilityOf(Roller));
//        Roller.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(Sistemkullanicisi));
//        Sistemkullanicisi.click();
//
//        try {
//            Fwait.until(ExpectedConditions.visibilityOf(kullaniciyikaydet));
//        }catch (Exception e){
//            Logger.warn("Kullanıcı kaydedilmedi");
//        }
//        kullaniciyikaydet.click();
//
//
//
//
//
//
//





        Thread.sleep(30000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


