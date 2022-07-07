package testAutomations.seleniumTests.YoneticiPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class RoleekleeditRolüsil extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/*[1]")
    public WebElement yonetimButonu;

    @FindBy(xpath = "//div[contains(text(),'Yönetici Paneli')]")
    public WebElement yoneticiPanelButonu;

    @FindBy(xpath = "//span[contains(text(),'Rol İşlemleri')]")
    public WebElement Rolislemleri;

    @FindBy(xpath = "//tbody/tr[9]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement editBtn;

//    @FindBy(xpath = "//body/div[9]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/input[1]")
//    public WebElement roladigiriniz;

    @FindBy(xpath = "//a[contains(text(),'Sistem Yetkileri')]")
    public WebElement Sistemyetkileri;


//    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.content > div > div.ui.black.bottom.attached.segment.active.tab > div > div.rc-tree-list > div > div > div > div:nth-child(33) > span.rc-tree-checkbox")
//    public WebElement olcumaraclari;

    @FindBy(xpath = "//button[contains(text(),'Rolü Sil')]")
    public WebElement rolüsil;






    @Test
    public void testRoleekleeditRolüsil() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(editBtn));
        editBtn.click();


//        Fwait.until(ExpectedConditions.visibilityOf(roladigiriniz));
//        roladigiriniz.click();
//        roladigiriniz.sendKeys("Admin");

        Fwait.until(ExpectedConditions.visibilityOf(Sistemyetkileri));
        Sistemyetkileri.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(olcumaraclari));
//        olcumaraclari.click();

        Fwait.until(ExpectedConditions.visibilityOf(rolüsil));
        rolüsil.click();




//
//        Fwait.until(ExpectedConditions.visibilityOf(aktif));
//        aktif.click();















        Thread.sleep(30000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}


