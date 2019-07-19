package com.vytrack.utilities;

import com.vytrack.pages.*;

public class Pages {

    //private variables for each pages
    private LoginPage loginPage;
    private FleetPage fleetPage;
    private CustomersPage customersPage;
    private ActivitiesPage activitiesPage;
    private DashboardsPage dashboardsPage;
    private SalesPage salesPage;
    private GeneralPage generalPage;


    //getter methods of private variables of pages
    public LoginPage login() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public FleetPage fleet(){
        if (fleetPage == null){
            fleetPage = new FleetPage();
        }
        return fleetPage;
    }

    public CustomersPage customers() {
        if (customersPage == null) {
            customersPage = new CustomersPage();
        }
        return customersPage;
    }

    public ActivitiesPage activities() {
        if (activitiesPage == null) {
            activitiesPage = new ActivitiesPage();
        }
        return activitiesPage;
    }

    public DashboardsPage dashboards() {
        if (dashboardsPage == null) {
            dashboardsPage = new DashboardsPage();
        }
        return dashboardsPage;
    }

    public SalesPage sales() {
        if (salesPage == null) {
            salesPage = new SalesPage();
        }
        return salesPage;
    }

    public GeneralPage general (){
        if (generalPage == null){
            generalPage = new GeneralPage();
        }

        return generalPage;
    }
}
