package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	private static By LoginBtnLoc = By.xpath("//a[@id='login']");
	private static By SignUpBtnLoc = By.xpath("//input[@id='btnsubmit0']");
	private static By enterEmailLoc = By.xpath("//input[@id='ContentPlaceHolder1_TextBox4']");
	private static By reEnterEmailLoc = By.xpath("//input[@id='ContentPlaceHolder1_TextBox8']");
	private static By enterPasswordLoc = By.xpath("//input[@id='ContentPlaceHolder1_TextBox6']");
	private static By reEnterPasswordLoc = By.xpath("//input[@id='ContentPlaceHolder1_TextBox7']");
	private static By SignUpNowBtnLoc = By.xpath("//input[@id='ContentPlaceHolder1_btnsubmit']");
	private static By	SignUpmsgLoc = By.xpath("//div[contains(text(),'Unable To Login')]");
	private static By	invalidmsgLoc = By.xpath("//div[contains(text(),'Please Check The Email: Both The Email Do Not Match.')]");
	
	public static void ClickOnLogin(WebDriver driver) {
		driver.findElement(LoginBtnLoc).click();
	}

	public static void ClickOnSignUp(WebDriver driver) {
		driver.findElement(SignUpBtnLoc).click();
	}

	public static void enterEmailId(WebDriver driver,String mailid) {
		driver.findElement(enterEmailLoc).sendKeys(mailid);
	}

	public static void reEnterEmailId(WebDriver driver,String mailid) {
		driver.findElement(reEnterEmailLoc).sendKeys(mailid);
	}

	public static void enterPassword(WebDriver driver,String password) {
		driver.findElement(enterPasswordLoc).sendKeys(password);
	}

	public static void reEnterPassword(WebDriver driver,String password) {
		driver.findElement(reEnterPasswordLoc).sendKeys(password);
	}
	
	public static void ClickOnSignUpNow(WebDriver driver) {
		driver.findElement(SignUpNowBtnLoc).click();
	}

	public static void signinMessage(WebDriver driver) {
		WebDriverWait  wait= new WebDriverWait (driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(SignUpmsgLoc));
	}

	public static void invalidMessage(WebDriver driver) {
		WebDriverWait  wait= new WebDriverWait (driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(invalidmsgLoc));
	}

}
