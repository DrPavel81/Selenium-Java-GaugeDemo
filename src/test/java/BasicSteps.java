import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicSteps {
    @Step("go to <site address>")
    public void goToSite(String address) {
        Driver.webDriver.get(address);
    }

    @Step("click hyperlink <link text>")
    public void clickLink(String linkText) {
        Driver.webDriver.findElement(By.partialLinkText(linkText)).click();
    }

    @Step("insert text <text> by id <id>")
    public void insertTextById(String text, String id) {
        Driver.webDriver.findElement(By.id(id)).sendKeys(text);
    }
    @Step("insert text <text> by name <id>")
    public void insertTextByName(String text, String name) {
        Driver.webDriver.findElement(By.name(name)).sendKeys(text);
    }

    @Step("click button by id <button id>")
    public void clickButtonById(String id) {
        Driver.webDriver.findElement(By.id(id)).click();
    }

    @Step("wait until element is present by id <id>")
    public void wait(String id) {
        WebDriverWait wait = new WebDriverWait(Driver.webDriver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }

    @Step("wait <seconds> seconds")
    public void wait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @Step("click button by name <name>")
    public void clickButtonByClassName(String name) {
        Driver.webDriver.findElement(By.name(name)).click();
    }

    @Step("click element by xpath <xpath>")
    public void clickElementByXpath(String xpath) {
        Driver.webDriver.findElement(By.xpath(xpath)).click();
    }

    @Step("clear text by id <id>")
    public void clearTextById(String id) {
        Driver.webDriver.findElement(By.id(id)).clear();
    }

    @Step("move mouse to location by class name <className>")
    public void moveMouseToLocationByClassName(String className) {
        Actions actions = new Actions(Driver.webDriver);
        actions.moveToElement(Driver.webDriver.findElement(By.className(className))).build().perform();

    }

    @Step("focus on frame by tag name <id>")
    public void focusOnFrameByTagName(String id) {
        Driver.webDriver.switchTo().frame(Driver.webDriver.findElement(By.tagName("iframe")));

    }

    @Step("move focus back to main page")
    public void moveFocusBackToMainPage() {
        Driver.webDriver.switchTo().parentFrame();

    }
}
