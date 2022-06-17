package testAutomations.seleniumTests.AramaYap;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class AramalariTemizle extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[3]/i[1]")
    public WebElement aramaYapBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/button[6]/i[1]")
    public WebElement AramalariTemizlebtn;

    @FindBy(xpath = "/html/body/div[7]/div/div[2]/div/button[1]")
    public WebElement AramalariTemizlebtnEvet;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > div > button.ui.green.button")
    public WebElement Evet;







    @Test
    public void testAramalariTemizle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(aramaYapBtn));


        try {
            aramaYapBtn.click();
        } catch (Exception e) {
            Logger.warn("Click İşlemi gerçekleşmedi Tıklanamadı.");
        }



        try {
           AramalariTemizlebtn.click();
        } catch (Exception e) {
            Logger.warn("Tıklama işlemi gerçekleşmedi.");
        }

        Thread.sleep(3000);

//        try {
//            AramalariTemizlebtnEvet.click();
//        } catch (Exception e) {
//            Logger.warn(" Evete Tıklama işlemi gerçekleşmedi.");
//        }
//
//        Thread.sleep(3000);
//
        Fwait.until(ExpectedConditions.visibilityOf(Evet));
        Evet.click();






        String bodyText = driver.findElement(By.tagName("body")).getText();
       // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}