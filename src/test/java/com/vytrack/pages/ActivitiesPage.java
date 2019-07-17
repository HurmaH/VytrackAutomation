package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivitiesPage {

    public ActivitiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Activities')]")
    public WebElement Activities;

    @FindBy (xpath = "//span[.='Calendar Events']")
    public WebElement CalendarEvents;

    @FindBy (xpath = "//span[.='Calls']")
    public WebElement Calls;

    @FindBy(className = "oro-subtitle")
    public WebElement ActivitiesPageName;


}
