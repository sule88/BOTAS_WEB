package testAutomations.seleniumTests.AramaYap;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class FiltreliArama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[3]/i[1]")
    public WebElement aramaYapButonu;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[4]/button[2]/i[1]")
    public WebElement filtreliAramaButonu;

    @FindBy(xpath = "//div[contains(text(),'Tablo Seçiniz')]")
    public WebElement secimYapinizFitreleme;

    @FindBy(xpath = "//span[contains(text(),'Boru')]")
    public WebElement filtreBorusecimi;

    @FindBy(xpath = "//button[@id='search-button-dynamic-query']")
    public WebElement araButonu2;

    @FindBy(xpath= "//body/div[@id='jsPanel-1']/div[1]/div[1]/div[3]/button[4]")
    public WebElement sayfaBuyutİslevi;

    @FindBy(xpath= "//body[1]/div[8]/div[3]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/label[1]")
    public WebElement secimYapButonu;


    //SEÇİM BUTONUNA TIKLAMA İŞLEMİ GERÇEKLEŞTİRİLDİ. HARİTADA GÖR BUTONUNA TIKLANDIKTAN SONRA KONTROL EDİLMESİ GEREKLİ

    @FindBy(xpath = "//button[contains(.,' Haritada Gör')]")
    public WebElement haritadaGorButonu;



    @Test
    public void testFiltreliArama() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(aramaYapButonu));
        aramaYapButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(filtreliAramaButonu));
        filtreliAramaButonu.click();

        Fwait.until(ExpectedConditions.visibilityOf(secimYapinizFitreleme));
        secimYapinizFitreleme.click();

        Fwait.until(ExpectedConditions.visibilityOf(filtreBorusecimi));
        filtreBorusecimi.click();

        Fwait.until(ExpectedConditions.visibilityOf(araButonu2));
        araButonu2.click();

        Thread.sleep(2000);

//        Fwait.until(ExpectedConditions.visibilityOf(sayfaBuyutİslevi));
        sayfaBuyutİslevi.click();
        Thread.sleep(2000);


//        Fwait.until(ExpectedConditions.visibilityOf(secimYapButonu));
//        secimYapButonu.click();

        js.executeScript("document.querySelector('#check_filter_data1').click()");

//        Fwait.until(ExpectedConditions.visibilityOf(secimYapButonu));
//        secimYapButonu.click();


        Fwait.until(ExpectedConditions.visibilityOf(haritadaGorButonu));
        haritadaGorButonu.click();

        Thread.sleep(30000);




        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
