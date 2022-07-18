package testAutomations.seleniumTests.Altpanel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class olcekDegistir extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(css = "#root > div > div:nth-child(3) > div.bottomSide > div.bottom-scale > div > div.divider.text")
    public WebElement olcektikla;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[4]/div[3]/div[1]/div[2]/div[10]/span[1]")
    public WebElement olcekdegistir;





    @Test
    public void testDereceninOndaligi() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(olcektikla));
        olcektikla.click();

        Fwait.until(ExpectedConditions.visibilityOf(olcekdegistir));
        olcekdegistir.click();






        String bodyText = driver.findElement(By.tagName("body")).getText();
       // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}