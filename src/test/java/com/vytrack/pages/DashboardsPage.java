package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardsPage {

    public DashboardsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Dashboards')]")
    public WebElement Dashboards;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//span[.='Manage Dashboards']")
    public WebElement ManageDashboards;

    @FindBy(className = "oro-subtitle")
    public WebElement DashBoardsageName;






}
