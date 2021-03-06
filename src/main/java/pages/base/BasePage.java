package pages.base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariable.EXPLICITLY_WAIT;

// создаём базовую страницу от которой будут наследоваться остальные страницы
public class BasePage {

    protected WebDriver driver; //инициализация браузера
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    @Step("Открыть страницу {url}")
    public void open(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICITLY_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

}
