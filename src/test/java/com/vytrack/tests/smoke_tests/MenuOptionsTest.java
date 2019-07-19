package com.vytrack.tests.smoke_tests;


import com.vytrack.utilities.Browser;
import com.vytrack.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.vytrack.utilities.AppConstants.*;

public class MenuOptionsTest extends TestBase {

    @Test
    public void driverTest() {
        //    1. Login to Vytrack as a driver
        pages.login().login("user168", "UserUser123");

        Browser.wait(3);
        //2. Navigate to Fleet à Vehicles, verify page title Car - Entities - System - Car - Entities - System, page name All Cars (updated)
        Browser.hover(pages.fleet().Fleet);
        pages.fleet().Vehicles.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), D_FLEET_VEHICLES_PAGE_TITLE);
        softAssert.assertEquals(pages.fleet().FleetPageName.getText(), D_FLEET_VEHICLES_PAGE_NAME);

        //3. Navigate to Customers à Accounts, verify page title Accounts - Customers, verify page name Accounts
        Browser.hover(pages.customers().Customers);
        pages.customers().Accounts.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), D_CUSTOMERS_ACCOUNTS_PAGE_TITLE);
        softAssert.assertEquals(pages.customers().CustomersPageName.getText(), D_CUSTOMERS_ACCOUNTS_PAGE_NAME);

        //4. Navigate to Customers à Contacts, verify page title Contacts - Customers, verify page name Contacts (updated)
        Browser.hover(pages.customers().Customers);
        pages.customers().Contacts.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), D_CUSTOMERS_CONTACTS_PAGE_TITLE);
        softAssert.assertEquals(pages.customers().CustomersPageName.getText(), D_CUSTOMERS_CONTACTS_PAGE_NAME);

        //5. Navigate to Activities à Calendar Events, verify page title Calendar Events - Activities, page name Calendar Events
        Browser.hover(pages.activities().Activities);
        pages.activities().CalendarEvents.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), D_ACTIVITIES_PAGE_TITLE);
        softAssert.assertEquals(pages.activities().ActivitiesPageName.getText(), D_ACTIVITIES_PAGE_NAME);

        softAssert.assertAll();


    }

    @Test
    public void storeManagerTest() {
        //    1. Login to Vytrack as a store manager
        pages.login().login("storemanager202", "UserUser123");

        Browser.wait(3);
// 2. Navigate to Dashboards à Dashboard, verify page title Dashboard - Dashboards, verify page name Dashboard
        Browser.hover(pages.dashboards().Dashboards);
        pages.dashboards().Dashboard.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), DASHBOARDS_DASHBOARD_PAGE_TITLE);
        softAssert.assertEquals(pages.dashboards().DashBoardsageName.getText(), DASHBOARDS_DASHBOARD_PAGE_NAME);

        //3. Navigate to Fleet à Vehicles, verify page title All - Car - Entities - System - Car - Entities - System, page name All Cars (updated)
        Browser.hover(pages.fleet().Fleet);
        pages.fleet().Vehicles.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), STM_FLEET_VEHICLES_PAGE_TITLE);
        softAssert.assertEquals(pages.fleet().FleetPageName.getText(), STM_FLEET_VEHICLES_PAGE_NAME);

        //4. Navigate to Customers à Accounts, verify page title All - Accounts - Customers, verify page name Accounts
        Browser.hover(pages.customers().Customers);
        pages.customers().Accounts.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), STM_CUSTOMERS_ACCOUNTS_PAGE_TITLE);
        softAssert.assertEquals(pages.customers().CustomersPageName.getText(), STM_CUSTOMERS_ACCOUNTS_PAGE_NAME);

        //5. Navigate to Customers à Contacts, verify page title All - Contacts - Customers, verify page name Contacts (updated)
        Browser.hover(pages.customers().Customers);
        pages.customers().Contacts.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), STM_CUSTOMERS_CONTACTS_PAGE_TITLE);
        softAssert.assertEquals(pages.customers().CustomersPageName.getText(), STM_CUSTOMERS_CONTACTS_PAGE_NAME);

        // 6. Navigate to Sales à Opportunities, verify page title Open Opportunities - Opportunities - Sales, verify page name Open Opportunities
        Browser.hover(pages.sales().Sales);
        pages.sales().Opportunities.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), STM_SALES_PAGE_TITLE);
        softAssert.assertEquals(pages.sales().SalesPageName.getText(), STM_SALES_PAGE_NAME);


        //7. Navigate to Activities à Calls verify page title All - Calls - Activities, page name All Calls (updated)
        Browser.hover(pages.activities().Activities);
        pages.activities().Calls.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), STM_ACTIVITIES_CALLS_PAGE_TITLE);
        softAssert.assertEquals(pages.activities().ActivitiesPageName.getText(),STM_ACTIVITIES_CALLS_PAGE_NAME);

        //8. Navigate to Activities à Calendar Events, verify page title Calendar Events - Activities, page name All Calendar Events
        Browser.hover(pages.activities().Activities);
        pages.activities().CalendarEvents.click();
        Browser.wait(3);
        softAssert.assertEquals(driver.getTitle(), STM_ACTIVITIES_CE_PAGE_TITLE);
        softAssert.assertEquals(pages.activities().ActivitiesPageName.getText(), STM_ACTIVITIES_CE_PAGE_NAME);

        softAssert.assertAll();
    }
}
