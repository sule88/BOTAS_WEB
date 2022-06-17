package testAutomations.seleniumTests.CizimYakalama;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class CizimYakala extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[4]/i[1]")
    public WebElement cizimAraclariBtn;

    @FindBy(xpath = "//button[@id='btnCizgiEkle']")
    public WebElement cizgiEkleBtn;

    @FindBy(id = "map")
    public WebElement haritayatikla;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/span[1]/span[1]/*[1]")
    public WebElement panelKapat;

    @FindBy(xpath = "//button[@id='btnCizimYakalama']")
    public WebElement cizimYakala;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/canvas[1]")
    public WebElement cizim;





    @Test
    public void testCizimYakala() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(cizimAraclariBtn));
        cizimAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizgiEkleBtn));
        cizgiEkleBtn.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();

        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, -200).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(-200, 0).release().perform();
        builder2.doubleClick().perform();


        Fwait.until(ExpectedConditions.visibilityOf(panelKapat));
        panelKapat.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizimYakala));
        cizimYakala.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizgiEkleBtn));
        cizgiEkleBtn.click();

        Thread.sleep(3000);



        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();

        Fwait.until(ExpectedConditions.visibilityOf(cizim));
        cizim.click();



        Fwait.until(ExpectedConditions.visibilityOf(cizgiEkleBtn));
        cizgiEkleBtn.click();



        Actions builder3 = new Actions(driver);
        builder3.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, -200).release().perform();
        builder3.click().perform();


        Actions builder4 = new Actions(driver);
        builder4.moveToElement(haritayatikla).clickAndHold().moveByOffset(-200, 0).release().perform();
        builder4.doubleClick().perform();







//
//
//        WebElement canvasElement = driver.findElement(By.id("map"));
//        new Actions(driver).moveToElement(canvasElement, 30, 0).clickAndHold().moveByOffset(0, 100).release().build().perform();
//        Thread.sleep(3000);



//        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
//        haritayatikla.click();




//        builder1.moveByOffset(500,200);
//        builder1.doubleClick().perform();
//        Thread.sleep(3000);





        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
