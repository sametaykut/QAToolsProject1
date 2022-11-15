import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun extends BaseTest {

    WebDriver driver;
    MainMethod mainMethod=new MainMethod(driver);

    public By input = By.xpath("//*[@id=\"userName\"]");

    @Test
    public void Test(){

      //  driver.findElement(input).click();
        //Thread.sleep(5000);



        //driver.findElement(input).click();
        //driver.findElement(input).sendKeys("samet");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        mainMethod.type_text();

    }




}
