package testAutomations.seleniumTests.Uzaklasyakinlas;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class Uzaklasyakinlasbutonlari extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
    public WebElement yakinlas;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/button[2]")
    public WebElement  uzaklas;





    @Test
    public void testUzaklasyakinlasbutonlari() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(yakinlas));
        yakinlas.click();

        Fwait.until(ExpectedConditions.visibilityOf(uzaklas));
        uzaklas.click();





















        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}