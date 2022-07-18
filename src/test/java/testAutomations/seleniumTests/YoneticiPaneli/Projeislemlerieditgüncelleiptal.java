package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Projeislemlerieditgüncelleiptal extends testAutomations.TestBase {
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


    @FindBy(xpath = "//input[@id='editor-project-name']")
    public WebElement projeadigir;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.red.button")
    public WebElement iptal;




    @Test
    public void testProjeislemlerieditgüncelleiptal() throws Exception {
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


        Fwait.until(ExpectedConditions.visibilityOf(projeadigir));
        projeadigir.click();
        projeadigir.sendKeys("ALMETAL1");
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(iptal));
        iptal.click();




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


