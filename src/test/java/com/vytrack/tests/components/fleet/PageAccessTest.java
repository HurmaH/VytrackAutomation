package com.vytrack.tests.components.fleet;

import com.vytrack.utilities.Browser;
import com.vytrack.utilities.TestBase;
import org.testng.annotations.Test;

public class PageAccessTest extends TestBase {

    @Test
    public void vehicleContractStoreManager() {
//        1. Login to Vytrack as a store manager
        pages.login().login("storemanager202", "UserUser123");

//        2. Verify that you can access Vehicle contracts page
        Browser.hover(pages.fleet().Fleet);
        pages.fleet().VehiclesContracts.click();
        softAssert.assertTrue(pages.fleet().FleetPageName.isDisplayed());
    }

    @Test
    public void vehicleContractSalesManager() {
//        1. Login to Vytrack as a sales manager
        pages.login().login("salesmanager265", "UserUser123");
//        2. Verify that you can access Vehicle contracts page
        Browser.hover(pages.fleet().Fleet);
        pages.fleet().VehiclesContracts.click();
        softAssert.assertTrue(pages.fleet().FleetPageName.isDisplayed());
    }

    @Test
    public void vehicleContractDriver() {
//        1. Login to Vytrack as a driver
        pages.login().login("user168", "UserUser123");

//        2. Verify that you cannot access Vehicle contracts page
        Browser.hover(pages.fleet().Fleet);
        pages.fleet().VehiclesContracts.click();

//        3. Message You do not have permission to perform this action. should be displayed
        softAssert.assertTrue(pages.fleet().VehicleContractError.isDisplayed());
    }
}
