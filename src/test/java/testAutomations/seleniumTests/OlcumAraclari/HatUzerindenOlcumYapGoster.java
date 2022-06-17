package testAutomations.seleniumTests.OlcumAraclari;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class HatUzerindenOlcumYapGoster extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[5]")
    public WebElement olcumAraclariBtn;

    @FindBy(xpath = "//button[@id='btnHatUzerindenOlcumYap']")
    public WebElement hatUzerindenOlcumYap;

    @FindBy(id = "map")
    public WebElement haritayatikla;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/label[1]")
    public WebElement katmanlar;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]")
    public WebElement sekmeAc;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[3]")
    public WebElement mevcutdgbh;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]")
    public WebElement yakinlastir;

    @FindBy(xpath = "//div[contains(text(),'Seçim Yap')]")
    public WebElement secimYap;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]")
    public WebElement goster;



    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[6]/button[1]")
    public WebElement ilknokta;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/canvas[1]")
    public WebElement noktayibul;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[8]/button[1]")
    public WebElement sonnokta;







    @Test
    public void testHatUzerindenOlcumYap() throws Exception {
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

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();

        Fwait.until(ExpectedConditions.visibilityOf(yakinlastir));
        yakinlastir.click();


        Fwait.until(ExpectedConditions.visibilityOf(olcumAraclariBtn));
        olcumAraclariBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(hatUzerindenOlcumYap));
        hatUzerindenOlcumYap.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


        Fwait.until(ExpectedConditions.visibilityOf(secimYap));
        secimYap.click();

        Fwait.until(ExpectedConditions.visibilityOf(goster));
        goster.click();

        Fwait.until(ExpectedConditions.visibilityOf(ilknokta));
        ilknokta.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();

        Fwait.until(ExpectedConditions.visibilityOf(noktayibul));
        noktayibul.click();

        Thread.sleep(3000);




        Actions builder1 = new Actions(driver);
        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(100, 0).release().perform();
        builder1.click().perform();



        Fwait.until(ExpectedConditions.visibilityOf(sonnokta));
        sonnokta.click();

        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
        haritayatikla.click();


















//        Fwait.until(ExpectedConditions.visibilityOf(cizgiEkleBtn));
//        cizgiEkleBtn.click();

//
//        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
//        haritayatikla.click();



//        Fwait.until(ExpectedConditions.visibilityOf(cizim));
//        cizim.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(cizim));
//        cizim.click();






//
//        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
//        haritayatikla.click();
//
//        Fwait.until(ExpectedConditions.visibilityOf(haritayatikla));
//        haritayatikla.click();


//        Actions builder1 = new Actions(driver);
//        builder1.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, -200).release().perform();
//        builder1.click().perform();
//
//
//        Actions builder2 = new Actions(driver);
//        builder2.moveToElement(haritayatikla).clickAndHold().moveByOffset(-200, 0).release().perform();
//        builder2.doubleClick().perform();



//
//        Fwait.until(ExpectedConditions.visibilityOf(cizgiEkleBtn));
//        cizgiEkleBtn.click();



        Thread.sleep(3000);








//        Actions builder3 = new Actions(driver);
//        builder3.moveToElement(haritayatikla).clickAndHold().moveByOffset(0, -200).release().perform();
//        builder3.click().perform();
//
//
//        Actions builder4 = new Actions(driver);
//        builder4.moveToElement(haritayatikla).clickAndHold().moveByOffset(-200, 0).release().perform();
//        builder4.doubleClick().perform();
//






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
