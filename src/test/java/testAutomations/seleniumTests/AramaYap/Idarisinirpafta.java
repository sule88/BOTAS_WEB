package testAutomations.seleniumTests.AramaYap;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Idarisinirpafta extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[3]/i[1]")
    public WebElement aramaYapButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/button[4]/i[1]")
    public WebElement idariSinirPaftaAramaButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/i[1]")
    public WebElement ilSeciniz;

    @FindBy(xpath = "//span[contains(text(),'Ankara')]")
    public WebElement ilsecimi;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/i[1]")
    public WebElement ilceSeciniz;

    @FindBy(xpath = "//span[contains(text(),'Çankaya')]")
    public WebElement ilceSecimi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/i[1]")
    public WebElement mahalleseciniz;

    @FindBy(xpath = "//span[contains(text(),'Alacaatlı')]")
    public WebElement mahallesecimi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
    public WebElement paftasecimi;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
    public WebElement paftasecimyeri;

    @FindBy(xpath = "//button[contains(text(),'Pafta Bul')]")
    public WebElement paftabulbutonu;





    @Test
    public void testIdarisinirpafta() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(aramaYapButonu));
        aramaYapButonu.click();
        System.out.println("Arama yap butonu tıklandı.");

        Fwait.until(ExpectedConditions.visibilityOf(idariSinirPaftaAramaButonu));
        idariSinirPaftaAramaButonu.click();
        Logger.info("İdarisınırpafta butonu tıklandı");

        Fwait.until(ExpectedConditions.visibilityOf(ilSeciniz));
        ilSeciniz.click();
        Logger.info("İlSeçiniz butonu tıklandı");

        Fwait.until(ExpectedConditions.visibilityOf(ilsecimi));
        ilsecimi.click();
        Logger.info("İlSeçimi yapıldı.");



        Fwait.until(ExpectedConditions.visibilityOf(ilceSeciniz));
        ilceSeciniz.click();
        Logger.info("İlceSeçiniz butonu tıklandı");


        Fwait.until(ExpectedConditions.visibilityOf(ilceSecimi));
        ilceSecimi.click();
        Logger.info("İlceSeçimi yapıldı.");

        Fwait.until(ExpectedConditions.visibilityOf(mahalleseciniz));
        mahalleseciniz.click();
        Logger.info("Mahalle seçiniz butonu tıklandı.");

        Fwait.until(ExpectedConditions.visibilityOf(mahallesecimi));
        mahallesecimi.click();
        Logger.info("Mahalle seçimi yapıldı.");

        Fwait.until(ExpectedConditions.visibilityOf(paftasecimi));
        paftasecimi.click();
        Logger.info("Pafta seçimi yapıldı.");

        Fwait.until(ExpectedConditions.visibilityOf(paftasecimyeri));
        paftasecimyeri.click();
        Logger.info("Pafta seçim yerine  tıklandı.");
        paftasecimyeri.clear();
        paftasecimyeri.sendKeys("Q43b09a3d");


        Fwait.until(ExpectedConditions.visibilityOf(paftabulbutonu));
        paftabulbutonu.click();
        Logger.info("Pafta bul butonu tıklandı.");









        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}