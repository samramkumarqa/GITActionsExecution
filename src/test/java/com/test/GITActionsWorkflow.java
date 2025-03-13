package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GITActionsWorkflow {

	@Test
	public void sampleTest() {
		// Set ChromeDriver path
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/ramkumars/eclipse-workspace/GITActions/src/test/java/ChromeDriver/chromedriver");
        // Set ChromeOptions for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run Chrome in headless mode
        options.addArguments("--no-sandbox");  // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resources issue

        // Initialize WebDriver with headless mode
        WebDriver driver = new ChromeDriver(options);

        // Open a website
        driver.get("https://www.google.com");

        // Print the title
        System.out.println("Page Title: " + driver.getTitle());

        // Quit browser
        driver.quit();
	}

}
