package com.anhtester.Bai5_Locators.XpathTuongDoi;

public class LocatorsCRM {
    //Trang Login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotpw = "//a[contains(@href, 'forgot_password')]";
    public static String checkboxRemember = "//input[@id='remember']";

    //Trang Dashboard
    public static String menuDashboard= "//ul[@id='side-menu']//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//ul[@id='side-menu']//span[normalize-space()='Customers']";
    public static String menuProjects = "//ul[@id='side-menu']//span[normalize-space()='Projects']";
    public static String menuTasks = "//ul[@id='side-menu']//span[normalize-space()='Tasks']";

    //Trang Customers List
    public static String buttonAddNewCustomer= "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomers= "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[normalize-space()='Import Customers']/following-sibling::a[normalize-space()='Contacts']";
    //Cách 2 của buttonContacts:  //a[contains(@href,'all_contacts')]
    public static String headerCustomersPage = "//h4[normalize-space()='Customers Summary']";
    public static String inputSearchCustomer = "//div[@id='clients_filter']//input";
    // //div[@id='clients_filter']/descendant::input

    //Trand Add new customers
    public static String inputCompany = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhoneNumber = "//input[@id='phonenumber']";
    public static String inputWebsite= "//input[@id='website']";
    public static String dropdownGroups = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroup = "//div[@app-field-wrapper ='groups_in[]']//input[@type='search']";
    //Cách 2 của inputGroups //button[@data-id='groups_in[]']/following-sibling::div//input
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//div[@app-field-wrapper ='default_currency']//input[@type='search']";
    public static String dropdownLanguage = "//button[@data-id='default_language']";

    public static String textareaAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputSearchCountry= "//div[@app-field-wrapper ='country']//input[@type='search']";
    public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact']";
    public static String buttonSave = "//button[normalize-space()='Save and create contact']//following-sibling::button";

    public static String headerProjectsPage = "//h4[normalize-space()='Projects Summary']";
    public static String inputSearchProject = "//div[@id='projects_filter']/descendant::input";
    public static String buttonAddNewProject= "//a[@data-title='Gantt']//preceding::a[normalize-space()='New Project']";

    //Trang Projects
    public static String inputProjectName = "//label[@for='name']//following-sibling::input";
    public static String dropdownCustomer = "//button[@data-id='clientid']";
    public static String inputSearchCustomerProject = "//button[@data-id='clientid']/following-sibling::div//input";
    public static String checkboxCalculateProgress = "//label[normalize-space()='Calculate progress through tasks']/parent::div//input";
    public static String sliderProẹctProgress = "//label//span[@class='label_progress']/following::input[@name='progress']";
    public static String dropdownBillingType = "//button[@data-id='billing_type']";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
    public static String inputEstHour= "//input[@id='estimated_hours']";
    public static String dropdownMembers = "//button[@data-id='project_members[]']";
    public static String buttonSelectall = "";
    public static String buttonDeselectall = "";
    public static String inputSearchMember = "//button[@data-id='project_members[]']//following-sibling::div//input";
    public static String inputStartDate = "//input[@id='start_date']";
    public static String iconCalendarStartDate = "//input[@id='start_date']/following-sibling::div//i";
    public static String inputDeadline = "//input[@id='deadline']";
    public static String calendarDeadline = "//input[@id='deadline']/following-sibling::div//i";

    public static String inputTextAreaDescription = "//iframe[@id='description_ifr']";
    public static String checkboxSendProjectCreatedEmail = "//label[normalize-space()='Send project created email']/preceding-sibling::input";
    public static String buttonSaveProject = "//button[normalize-space()='Save']";
    public static String tabProjectSettings = "//a[normalize-space()='Project Settings']";



    /*
    public static String = "";
    public static String = "";
    public static String = "";
    public static String = "";
    public static String = "";
    public static String = "";

    //Xpath của trang Login
logo
//img[@alt='Perfex CRM | Anh Tester Demo']

titleLogin
//h1[normalize-space()='Login']

//label[normalize-space()='Email Address']

//input[@id='email']
//label[normalize-space()='Email Address']/following-sibling::input

//label[normalize-space()='Password']
//label[contains(text(),'Password')]

//input[@id='password']
//label[contains(text(),'Password')]/following-sibling::input

//div[@class='checkbox checkbox-inline']/child::input[@type='checkbox']
//label[normalize-space()='Remember me']

//button[normalize-space()='Login']
//a[normalize-space()='Forgot Password?']
//a[contains(@href, 'forgot_password')]

//div[@class='form-group']

    //Xpath của menu Customer
//a[@href='https://crm.anhtester.com/admin/clients']

//ul[@id='side-menu']/descendant::li[@class='menu-item-customers active']
(//ul[@id='side-menu']/descendant::li[@class='menu-item-customers active'])/child::a

    //Xpath của Form_NewCustomer

*/


}
