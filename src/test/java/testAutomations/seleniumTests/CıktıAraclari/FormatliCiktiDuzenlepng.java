package testAutomations.seleniumTests.CıktıAraclari;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class FormatliCiktiDuzenlepng extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[8]")
    public WebElement CiktiAraclari;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[7]/button[2]/i[1]")
    public WebElement FormatliCiktiDuzenle;

    @FindBy(css = "body > div.ol-ext-print-dialog.ol-ext-dialog.ol-visible > form > div.ol-content > div.ol-print-param > ul > li.ol-legend > label")
    public WebElement lejant;

    @FindBy(css = "body > div.ol-ext-print-dialog.ol-ext-dialog.ol-visible > form > div.ol-content > div.ol-print-param > ul > li:nth-child(8) > label")
    public WebElement etiket;

    @FindBy(css = "body > div.ol-ext-print-dialog.ol-ext-dialog.ol-visible > form > div.ol-content > div.ol-print-param > ul > li:nth-child(9) > label")
    public WebElement opsiyoneletiket;

    @FindBy(xpath = "//body[1]/div[3]/form[1]/div[2]/div[1]/ul[1]/li[10]/select[1]")
    public WebElement farkliKaydet;

    @FindBy(xpath = "//body/div[3]/form[1]/div[2]/div[1]/ul[1]/li[10]/select[1]/option[2]")
    public WebElement png;














    @Test
    public void testFormatliCiktiDuzenle() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }



        Fwait.until(ExpectedConditions.visibilityOf(CiktiAraclari));
        CiktiAraclari.click();

        Fwait.until(ExpectedConditions.visibilityOf(FormatliCiktiDuzenle));
        FormatliCiktiDuzenle.click();

        Fwait.until(ExpectedConditions.visibilityOf(lejant));
        lejant.click();

        Fwait.until(ExpectedConditions.visibilityOf(etiket));
        etiket.click();

        Fwait.until(ExpectedConditions.visibilityOf(opsiyoneletiket));
        opsiyoneletiket.click();


        Fwait.until(ExpectedConditions.visibilityOf(farkliKaydet));
        farkliKaydet.click();
//        farkliKaydet.sendKeys(Keys.DOWN);
//        farkliKaydet.sendKeys(Keys.ENTER);

        Fwait.until(ExpectedConditions.visibilityOf(png));
        png.click();













        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}