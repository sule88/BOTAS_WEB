package testAutomations.seleniumTests.DigerAraclar;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class EkrandanSeçimVerileriGetir extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[7]")
    public WebElement digerAraclarBtn;

    @FindBy(xpath = "//button[@id='btnAlandakiVerileriGetir']")
    public WebElement alandakiVerileriGetir;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]")
    public WebElement gorunurAlan;

    @FindBy(id = "map")
    public WebElement haritayatikla;

    @FindBy(id = "editor-name")
    public WebElement metinadiimlec;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/label[1]")
    public WebElement katmanlar;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]")
    public WebElement sekmeAc;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[3]")
    public WebElement mevcutdgbh;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[4]/i[1]")
    public WebElement cizimAraclariBtn;

    @FindBy(xpath = "//button[@id='btnAlanEkle']")
    public WebElement alanEkleBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement ekrandanSecim;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[8]/button[5]/i[1]")
    public WebElement AlandakiVerileriGetir;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/canvas[1]")
    public WebElement map;
//
//    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[6]/div[2]/div[1]/button[1]")
//    public WebElement excel;
//

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[4]/div[1]")
    public WebElement uygula;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement alanciz;






    @Test
    public void testEkrandanSeçimVerileriGetir() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }


        Fwait.until(ExpectedConditions.visibilityOf(katmanlar));
        katmanlar.click();

        Fwait.until(ExpectedConditions.visibilityOf(sekmeAc));
        sekmeAc.click();

        Fwait.until(ExpectedConditions.visibilityOf(mevcutdgbh));
        mevcutdgbh.click();
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(digerAraclarBtn));
        digerAraclarBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(alandakiVerileriGetir));
        alandakiVerileriGetir.click();




        Fwait.until(ExpectedConditions.visibilityOf(alanciz));
        alanciz.click();

        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, 300).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(300, 0).release().perform();
        builder2.doubleClick().perform();




        Fwait.until(ExpectedConditions.visibilityOf(ekrandanSecim));
        ekrandanSecim.click();

        Fwait.until(ExpectedConditions.visibilityOf(map));
        map.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


        Fwait.until(ExpectedConditions.visibilityOf(uygula));
        uygula.click();
        Thread.sleep(10000);
//
//        Fwait.until(ExpectedConditions.visibilityOf(excel));
//        excel.click();






        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}