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


public class Mesafeanalizaraci extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[7]")
    public WebElement digerAraclarBtn;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[8]/button[2]")
    public WebElement mesafeAnalizAraci;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[4]/i[1]")
    public WebElement cizimAraclariBtn;

    @FindBy(xpath = "//button[@id='btnAlanEkle']")
    public WebElement alanEkleBtn;

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

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement ekrandanSecim;

    @FindBy(xpath = "//label[contains(text(),'Uzunlukları Haritada Göster')]")
    public WebElement uzunluklariHaritadaGoster;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    public WebElement mesafeGiriniz;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[5]/div[1]/button[1]")
    public WebElement uygula;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[6]/div[2]/div[1]/button[1]")
    public WebElement excel;






    @Test
    public void testMesafeanalizaraci() throws Exception {
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


        Fwait.until(ExpectedConditions.visibilityOf(cizimAraclariBtn));
        cizimAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(alanEkleBtn));
        alanEkleBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();



        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, 200).release().perform();
        builder1.click().perform();


        Actions builder2 = new Actions(driver);
        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(200, 0).release().perform();
        builder2.doubleClick().perform();

        Actions builder3 = new Actions(driver);
        builder3.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, -200).release().perform();
        builder3.doubleClick().perform();






//        Fwait.until(ExpectedConditions.visibilityOf(metinadiimlec));
//        metinadiimlec.click();
//        metinadiimlec.sendKeys("Mesafeanalizaracı");





        Fwait.until(ExpectedConditions.visibilityOf(digerAraclarBtn));
        digerAraclarBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(mesafeAnalizAraci));
        mesafeAnalizAraci.click();

        Fwait.until(ExpectedConditions.visibilityOf(ekrandanSecim));
        ekrandanSecim.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


        Fwait.until(ExpectedConditions.visibilityOf(uzunluklariHaritadaGoster));
        uzunluklariHaritadaGoster.click();

        Fwait.until(ExpectedConditions.visibilityOf(mesafeGiriniz));
        mesafeGiriniz.click();
        mesafeGiriniz.sendKeys("50000");

        Fwait.until(ExpectedConditions.visibilityOf(uygula));
        uygula.click();
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(excel));
        excel.click();




















        String bodyText = driver.findElement(By.tagName("body")).getText();
        // Assert.assertTrue("Text not found!", bodyText.contains("Mevcut Boru Hatları"));




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}