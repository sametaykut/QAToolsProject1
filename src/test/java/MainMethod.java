import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMethod extends BasePage {

    Xpath xpath;
    public By input = By.xpath("//*[@id=\"userName\"]");

    public MainMethod(WebDriver driver) {
        super(driver);
        this.xpath=new Xpath(driver);
    }

    public void type_text(){
        //click(xpath.input);
        //type(xpath.input,"Bilgisayar");
       // click(xpath.search_icon);
        driver.findElement(input).click();
        driver.findElement(input).sendKeys("samet");


    }

}
