package com.vytrack.pages;

import com.vytrack.utilities.Browser;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralPage {

    public GeneralPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "dropdown-toggle")
    public WebElement userName;


    public WebElement MyUser;

    public WebElement MyConfiguration;

    @FindBy (xpath = "//a[.='My Calendar']")
    public WebElement MyCalendar;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement Logout;

    public void logout(){
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10 );
//        userName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Logout']")));
        Browser.wait(5);
        userName.click();
        Logout.click();
    }

}
