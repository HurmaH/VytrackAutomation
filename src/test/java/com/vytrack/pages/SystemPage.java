package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemPage {

    public SystemPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(className = "oro-subtitle")
    public WebElement SystemPageName;

}
