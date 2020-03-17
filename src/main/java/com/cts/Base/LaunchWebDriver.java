package com.cts.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LaunchWebDriver {

	public   WebDriver driver;

	public static void setup(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");// 60sec for loading
	}

	public void tearDown() throws InterruptedException {
		// Thread.sleep(20000);
		driver.quit();
	}

}

//@Parameters({ "browser" })