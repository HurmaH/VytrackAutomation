package com.vytrack.tests.components.activities;

import com.vytrack.utilities.Browser;
import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

public class CalendarEventsTest extends TestBase {

//    Verify repeat options
//    1. Log in as Valid user
//    2. Go to Activities -> Calendar Events
//    3. Click on create new calendar event
//    Click on Repeat checkbox
//    Verify repeat options:
//    Daily
//    Weekly
//    Monthly
//    Yearly
    @Test
    public void verifyRepeatOptions(){

        pages.login().login("storemanager202", "UserUser123"); //1

        Browser.hover(pages.activities().Activities);//2
        pages.activities().CalendarEvents.click();

        pages.activities().CreateCalendarEvent.click();//3

    }

}
