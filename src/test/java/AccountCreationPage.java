import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class AccountCreationPage {
    String email = AccountCreationActions.getEmail();
    Random random = new Random();

    @Step("insert random address")
    public void randomAddress() {
        Driver.webDriver.findElement(By.id("email_create")).sendKeys(email);
    }

    @Step("select random value from dropdown by id <id>")
    public void selectRandomValueFromDropdown(String id) {
        List<WebElement> itemsInDropdown = Driver.webDriver.findElements(By.xpath("//*[@id='" + id + "']/child::*"));
        if (id == "days") {
            itemsInDropdown.get(random.nextInt(28) + 1).click();
        } else {
            itemsInDropdown.get(random.nextInt(itemsInDropdown.size() - 1) + 1).click();
        }
    }

    @Step("check email address")
    public void checkEmailAddress() {
        Assertions.assertThat(Driver.webDriver.findElement(By.id("email")).getAttribute("value")).isEqualTo(email);
    }

    @Step("check order reference")
    public void checkOrderReference() {
        String orderDetails=Driver.webDriver.findElement(By.xpath("//*[@id='center_column']/div")).getText();
        BasicSteps basicSteps = new BasicSteps();
        basicSteps.clickLink("Back to orders");
        String orderReference=Driver.webDriver.findElement(By.className("color-myaccount")).getText();
        Assertions.assertThat(orderDetails).contains(orderReference);

    }
}
