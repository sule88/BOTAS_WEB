package testAutomations.seleniumTests.Sagtikislevleri;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class Yükseklikbilgisial extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;
    @FindBy(xpath = "//div[@class='ol-ctx-menu-container ol-unselectable']")
    public WebElement sagtik;

    @FindBy(id = "map")
    public WebElement map;

    @FindBy(xpath = "//span[contains(text(),'Yükseklik Bilgisi Al')]")
    public WebElement yükseklikbilgisi;

    @Test
    public void testYükseklikbilgisial() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI2);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }


        try {
            Fwait.until(ExpectedConditions.visibilityOf(map));
            actions.contextClick(map).perform(); //actions'u TestBase.java içerisinde 61. satırda tanımladım oradan çağırıyoruz
        } catch (Exception e) {
            Logger.warn("sag tık  tıklanmadı.");
        }

        //sonraki classlarda actions. diye başladığınızda actions altındaki fonskiyonları kullanabilirsiniz double click vb. gibi fonskiyonlar
        Fwait.until(ExpectedConditions.visibilityOf(yükseklikbilgisi));
        yükseklikbilgisi.click();
        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
