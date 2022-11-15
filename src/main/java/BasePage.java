import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) // Constructor oluşturuldu. Başka classlarda bu durum kullanılacak
    {
        this.driver = driver;
    }

    public WebElement find (By locator)  // Click sendkey gibi fonksiyonlarda ilk olarak elementi bulmak için bu method yazıldı
    {
    return driver.findElement(locator);
    }

    public void click (By locator)       // Elementin olduğu kısma tıklamak için bu method yazıldı
    {
        find(locator).click();
    }

    public void type(By locator,String product)
    {

        find(locator).sendKeys(product);
    }
}
