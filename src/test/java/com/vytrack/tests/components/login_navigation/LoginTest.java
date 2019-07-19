package com.vytrack.tests.components.login_navigation;

import com.vytrack.utilities.Browser;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

import static com.vytrack.utilities.AppConstants.LOGIN_PAGE_TITLE;
import static com.vytrack.utilities.AppConstants.STM_USERNAME;

public class LoginTest extends TestBase {

    @Test
    public void positive() {
//        1. Login to Vytrack as a store manager
        pages.login().login("storemanager202", "UserUser123");

//        2. Verify name of the store manager is displayed on top right
        String storeManagerName = pages.general().userName.getText();
        softAssert.assertEquals(STM_USERNAME, storeManagerName);

//        3. Verify Dashboad page is open
        softAssert.assertTrue(pages.dashboards().DashBoardsageName.isDisplayed());

//        4. Log out
        pages.general().logout();

//        5. Login to Vytrack as a sales manager
        pages.login().login("salesmanager265", "UserUser123");

//        6. Verify Dashboad page is open
        softAssert.assertTrue(pages.dashboards().DashBoardsageName.isDisplayed());

//        7. A different name should be displayed on top right
        String salesManagerName = pages.general().userName.getText();
        softAssert.assertNotEquals(STM_USERNAME, salesManagerName);

//        8. Log out
        pages.general().logout();

//        9. Login to Vytrack as a driver
        pages.login().login("user168", "UserUser123");

//        10. Verify Dashboad/Quick Launchpad page is open
        softAssert.assertTrue(pages.dashboards().DashBoardsageName.isDisplayed());

//        11. A different name should be displayed on top right
        String driverName = pages.general().userName.getText();
        softAssert.assertNotEquals(STM_USERNAME, driverName);

    }


    @Test
    public void negative() {

//        1. Open Vytrack login page
//        2. Enter valid username and invalid password information
//        3. Click login
        pages.login().login("user168", "UserUser");


//        4. Message Invalid user name or password. should be displayed
        softAssert.assertTrue(pages.login().errorMessage.isDisplayed());

//        5. Page title and url should be same
        softAssert.assertEquals(LOGIN_PAGE_TITLE, Driver.getDriver().getTitle());
        softAssert.assertEquals(ConfigurationReader.getProperty("url"), Driver.getDriver().getCurrentUrl());

    }
}
