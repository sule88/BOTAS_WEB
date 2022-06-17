package testAutomations.seleniumTests.Aktarimaraclari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class DxfYukleme extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[6]")
    public WebElement Aktarimaraclari;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[6]/button[1]")
    public WebElement dxfYukleme;

    @FindBy(xpath = "//label[contains(text(),'Gözat')]")
    public WebElement gozat;

    @FindBy(xpath = "//div[contains(text(),'Projeksiyon Seçiniz')]")
    public WebElement projeksiyonSeciniz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
    public WebElement dereceninOndalıgı;













    @Test
    public void testDxfYukleme() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(Aktarimaraclari));
        Aktarimaraclari.click();

        Fwait.until(ExpectedConditions.visibilityOf(dxfYukleme));
        dxfYukleme.click();


        Fwait.until(ExpectedConditions.visibilityOf(gozat));
        gozat.click();

        Fwait.until(ExpectedConditions.visibilityOf(projeksiyonSeciniz));
        projeksiyonSeciniz.click();






//
//        WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
//        addFile.sendKeys("/Users/neeraj.kumar/Desktop/c1.jpeg");









        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}