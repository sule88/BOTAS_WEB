package testAutomations.seleniumTests.AramaYap;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class HgmArama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[3]/i[1]")
    public WebElement Aramayap;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/button[5]/i[1]")
    public WebElement HgmAramayap;

    @FindBy(xpath = "//input[@id='combo-box-demo']")
    public WebElement Aramayapyazınız;

    @FindBy(xpath = "//div[contains(text(),'Kapat')]")
    public WebElement Aramayapkapat;





    @Test
    public void testHgmArama() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(Aramayap));
        Aramayap.click();

        Fwait.until(ExpectedConditions.visibilityOf(HgmAramayap));
        HgmAramayap.click();

        Fwait.until(ExpectedConditions.visibilityOf(Aramayapyazınız));
        Aramayapyazınız.click();
        Aramayapyazınız.sendKeys("Ankara");
        Thread.sleep(3000);
        Aramayapyazınız.sendKeys(Keys.ARROW_DOWN);
        Aramayapyazınız.sendKeys(Keys.ENTER);






        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
