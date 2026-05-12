package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkedInLogin {

    public static void login(WebDriver driver) throws InterruptedException {

        // Open LinkedIn login page
        driver.get("https://www.linkedin.com/login");

        // Wait
        Thread.sleep(3000);

        // Enter email
        WebElement email = driver.findElement(By.id("username"));
        email.sendKeys("gautami.kahar@gmail.com");

        // Enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Gau@2005");

        // Click login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();

        // Wait after login
        Thread.sleep(5000);

        System.out.println("LinkedIn Login Successful");

    }
}