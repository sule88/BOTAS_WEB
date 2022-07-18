package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class ProjeislemleriEkle extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Proje İşlemleri')]")
    public WebElement projeİslemleri;

//    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[1]/span[1]/span[1]")
//    public WebElement editBtn;

//    @FindBy(xpath = "//body/div[9]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]")
//    public WebElement roladigiriniz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/button[1]")
    public WebElement Ekle;


    @FindBy(xpath = "//input[@id='add-project-name']")
    public WebElement projeadigir;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.green.button")
    public WebElement ekleYesil;








    @Test
    public void testProjeislemleriEkle() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(projeİslemleri));
        projeİslemleri.click();

//        Fwait.until(ExpectedConditions.visibilityOf(editBtn));
//        editBtn.click();
//

//        Fwait.until(ExpectedConditions.visibilityOf(roladigiriniz));
//        roladigiriniz.click();
//        roladigiriniz.sendKeys("Admin");

        Fwait.until(ExpectedConditions.visibilityOf(Ekle));
        Ekle.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(projeadigir));
        projeadigir.click();
        projeadigir.sendKeys("Test");

        Fwait.until(ExpectedConditions.visibilityOf(ekleYesil));
        ekleYesil.click();






        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


