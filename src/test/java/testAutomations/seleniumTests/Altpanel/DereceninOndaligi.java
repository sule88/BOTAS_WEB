package testAutomations.seleniumTests.Altpanel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class DereceninOndaligi extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//div[contains(text(),'Derecenin Ondalığı')]")
    public WebElement dereceninOndaligi;

    @FindBy(xpath = "//span[contains(text(),'3Der ITRF DOM30')]")
    public WebElement dom;




    @Test
    public void testDereceninOndaligi() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }


        Fwait.until(ExpectedConditions.visibilityOf(dereceninOndaligi));
        dereceninOndaligi.click();

        Fwait.until(ExpectedConditions.visibilityOf(dom));
        dom.click();




        String bodyText = driver.findElement(By.tagName("body")).getText();
       // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}