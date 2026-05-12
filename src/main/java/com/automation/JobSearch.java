// package com.automation;

// import java.io.FileWriter;

// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;

// public class JobSearch {

//     public static void searchJobs(WebDriver driver) throws Exception {

//         // Open LinkedIn search page
//         driver.get("https://www.linkedin.com/search/results/content/?keywords=Java%20Developer%20Contract");

//         Thread.sleep(15000);

//         System.out.println("LinkedIn Posts Search Opened");

//         JavascriptExecutor js = (JavascriptExecutor) driver;

//         // Scroll slowly to load posts
//         for (int i = 0; i < 8; i++) {

//             js.executeScript("window.scrollBy(0,1200)");

//             Thread.sleep(4000);
//         }

//         // Extract FULL visible page text using JavaScript
//         String fullText = (String) js.executeScript(
//                 "return document.body.innerText;");

//         System.out.println("\n============= EXTRACTED DATA =============\n");

//         System.out.println(fullText);

//         // Save into file
//         FileWriter fw = new FileWriter("jobs.txt");

//         fw.write(fullText);

//         fw.close();

//         System.out.println("\nData saved successfully into jobs.txt");

//         driver.quit();
//     }
// }

package com.automation;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JobSearch {

    public static void searchJobs(WebDriver driver) throws Exception {

        // Open LinkedIn search page
        driver.get("https://www.linkedin.com/search/results/content/?keywords=Java%20Developer%20Contract");

        Thread.sleep(15000);

        System.out.println("LinkedIn Posts Search Opened");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll slowly to load posts
        for (int i = 0; i < 8; i++) {

            js.executeScript("window.scrollBy(0,1200)");

            Thread.sleep(4000);
        }

        // Extract FULL visible page text
        String fullText = (String) js.executeScript(
                "return document.body.innerText;");

        System.out.println("\n============= EXTRACTED DATA =============\n");

        System.out.println(fullText);

        // Remove duplicate lines
        String[] lines = fullText.split("\n");

        HashSet<String> uniqueLines = new HashSet<>();

        StringBuilder cleanedData = new StringBuilder();

        for (String line : lines) {

            line = line.trim();

            if (!line.isEmpty() && !uniqueLines.contains(line)) {

                uniqueLines.add(line);

                cleanedData.append(line).append("\n");
            }
        }

        // Extract Emails
        Pattern pattern = Pattern.compile(
                "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+");

        Matcher matcher = pattern.matcher(cleanedData.toString());

        System.out.println("\n============= EMAILS FOUND =============\n");

        while (matcher.find()) {

            System.out.println(matcher.group());
        }

        // Save into CSV File
        FileWriter fw = new FileWriter("jobs.csv");

        fw.write("LinkedIn Job Search Data\n");

        fw.write("Generated At: "
                + LocalDateTime.now()
                + "\n\n");

        fw.write(cleanedData.toString());

        fw.close();

        System.out.println("\nData saved successfully into jobs.csv");

        driver.quit();
    }
}