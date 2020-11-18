package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private String frameBottom = "frame-bottom";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameText(){
        driver.switchTo().frame(frameTop);
        driver.switchTo().frame(frameLeft);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(frameBottom);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getFrameText(){
        return driver.findElement(body).getText();
    }
}
