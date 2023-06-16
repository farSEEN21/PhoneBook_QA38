package manager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator) { wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }

    public void pause(int mils) {
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size() > 0;

    }


    public void isElementAlert() {
        WebDriverWait wait = new WebDriverWait(wd, 15);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
    }
    }