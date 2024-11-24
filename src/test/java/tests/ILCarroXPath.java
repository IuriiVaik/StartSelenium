package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();
    @Test
    public void typeRegForm() {
        driver.get("https://ilcarro.web.app/registration?url=%2Fsearch");


        WebElement inputName = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
        inputName.sendKeys("Iurii");


        WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        inputLastName.sendKeys("Vaikhanskyi");


        WebElement inputEmail = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        inputEmail.sendKeys("my_email@mail.com");


        WebElement inputPassword = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        inputPassword.sendKeys("Password123!");


        WebElement btnIagree = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        btnIagree.click();


        WebElement btnRegistration = driver.findElement(By.xpath("//button[@type='submit']"));
        btnRegistration.click();
    }

}
