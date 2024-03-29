package com.vytrack.pages;

import com.vytrack.utilities.Browser;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage {

   public FleetPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[contains(text(),'Fleet')]")
    public WebElement Fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement Vehicles;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement VehiclesContracts;

    @FindBy(xpath = "//div[contains(text(),'permission')]")
    public WebElement VehicleContractError;

    @FindBy(className = "oro-subtitle")
    public WebElement FleetPageName;



}
