// package com.automation;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;

// public class Main {

//     public static void main(String[] args) throws Exception {

//         ChromeOptions options = new ChromeOptions();

//         // Connect with already opened Chrome
//         options.setExperimentalOption("debuggerAddress", "localhost:9222");

//         WebDriver driver = new ChromeDriver(options);

//         System.out.println("LinkedIn Connected Successfully");

//         JobSearch.searchJobs(driver);
//         driver.quit();
//     }
// }

package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) throws Exception {

        ChromeOptions options = new ChromeOptions();

        // Connect with already opened Chrome
        options.setExperimentalOption(
                "debuggerAddress",
                "localhost:9222");

        WebDriver driver = new ChromeDriver(options);

        System.out.println(
                "LinkedIn Connected Successfully");

        JobSearch.searchJobs(driver);

        driver.quit();
    }
}