package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();

    @Test
    public void elementsHeaderIlCarro() {
        // Переход на страницу
        driver.navigate().to("https://ilcarro.web.app/search");

        // Ожидание загрузки страницы (временное решение)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Поиск элементов хедера с помощью CSS-селекторов
        List<WebElement> headerElements = driver.findElements(By.cssSelector("header a"));

        // Вывод текста из каждого элемента в консоль
        for (WebElement element : headerElements) {
            System.out.println(element.getText());
        }

        // Завершение работы драйвера
        driver.quit();
    }
}
