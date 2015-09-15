package com.robert.example.milkroundapplication.Helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Robert on 14/09/2015.
 */
public class DBAdapter {

    private static final  String TAG = "My activity";

    Context context;

    private SQLiteDatabase db; // a reference to the database manager class.

    public final String DB_NAME = "tm470.db"; // the name of our database
    private final int DB_VERSION = 1; // the version of the database

    //Customer Table and columns
    public static final String TABLE_CUSTOMERS = "customers_tbl";
    public static final String ID_CUSTOMERS = "_id";
    public static final String FIRSTNAME_CUSTOMERS = "customer_firstname";
    public static final String SURNAME_CUSTOMERS = "customer_surname";
    public static final String EMAIL_CUSTOMERS = "customer_email";
    public static final String ADDRESS1_CUSTOMERS = "customer_address1";
    public static final String ADDRESS2_CUSTOMERS = "customer_address2";
    public static final String ADDRESS3_CUSTOMERS = "customer_address3";
    public static final String TOWN_CUSTOMERS = "customer_town";
    public static final String CITY_CUSTOMERS = "customer_city";
    public static final String POSTCODE_CUSTOMERS = "customer_postcode";
    public static final String HOMEPHONE_CUSTOMERS = "customer_homephone";
    public static final String MOBILENUMBER_CUSTOMERS = "customer_mobilenumber";
    public static final String AMOUNTOWING_CUSTOMERS = "customer_amountowing";

    public static final String[] ALL_CUSTOMERS = new String[]{ID_CUSTOMERS, ADDRESS1_CUSTOMERS};
    public static final String[] ALL_CUSTOMERS_FOR_UPDATE = new String[]{ID_CUSTOMERS,FIRSTNAME_CUSTOMERS, SURNAME_CUSTOMERS,
            EMAIL_CUSTOMERS, ADDRESS1_CUSTOMERS,ADDRESS2_CUSTOMERS, ADDRESS3_CUSTOMERS, TOWN_CUSTOMERS, CITY_CUSTOMERS,
            POSTCODE_CUSTOMERS,HOMEPHONE_CUSTOMERS,MOBILENUMBER_CUSTOMERS};
    public static final String[] ALL_CUSTOMERS_FOR_COLLECTING_MONIES = new String []{ID_CUSTOMERS, ADDRESS1_CUSTOMERS,
            AMOUNTOWING_CUSTOMERS};




    //Product table and columns
    public static final String TABLE_PRODUCTS = "product_tbl";
    public static final String ID_PRODUCTS = "_id";
    public static final String NAME_PRODUCTS = "product_name";
    public static final String PRICE_PRODUCTS = "product_price";
    public static final String NOTES_PRODUCTS = "product_notes";

    public static final String[] ALL_PRODUCTS = new String[]{ID_PRODUCTS, NAME_PRODUCTS};
    public static final String[] ALL_PRODUCTS_FOR_UPDATE = new String[]{ID_PRODUCTS, NAME_PRODUCTS, PRICE_PRODUCTS, NOTES_PRODUCTS};


    //Payment table and columns
    public static final String TABLE_PAYMENT = "payment_tbl";
    public static final String ID_PAYMENT = "_id";
    public static final String METHOD_PAYMENT = "payment_method";
    public static final String AMOUNTPAID_PAYMENT = "payment_amountpaid";
    public static final String DATE_PAYMENT = "payment_date";
    public static final String CUSTOMER_PAYMENT = "payment_customer";


    //Collecting Session table and columns
    public static final String TABLE_COLLECTING_SESSION = "collectingsession_tbl";
    public static final String ID_COLLECTINGSESSION = "_id";
    public static final String CASH_COLLECTINGSESSION = "collectingsession_cash";
    public static final String CHEQUE_COLLECTINGSESSION = "collectingsession_cheque";
    public static final String CARD_COLLECTINGSESSION = "collectingsession_card";
    public static final String DISPUTES_COLLECTINGSESSION = "collectingsession_disputes";
    public static final String TOTAL_COLLECTINGSESSION = "collectingsession_total";
    public static final String DATE_COLLECTINGSESSION = "collectingsession_date";



    //Standing Order table and columns
    public static final String TABLE_STANDINGORDER = "standingorder_tbl";
    public static final String ID_STANDINGORDER = "_id";
    public static final String PRODUCTNAME_STANDINGORDER = "sorder_productname";
    public static final String MON_STANDINGORDER = "sorder_mon";
    public static final String TUE_STANDINGORDER = "sorder_tue";
    public static final String WED_STANDINGORDER = "sorder_wed";
    public static final String THU_STANDINGORDER = "sorder_thu";
    public static final String FRI_STANDINGORDER = "sorder_fri";
    public static final String SAT_STANDINGORDER = "sorder_sat";
    public static final String SUN_STANDINGORDER = "sorder_sun";
    public static final String AMOUNT_STANDINGORDER = "sorder_amount";
    public static final String CUSTOMER_STANDINGORDER = "sorder_customer";


    public static final String [] ALL_WEEK_OWING = new String[]{AMOUNT_STANDINGORDER, CUSTOMER_STANDINGORDER};



    //Weekly Order table and columns
    public static final String TABLE_WEEKLYORDER = "weeklyorder_tbl";
    public static final String ID_WEEKLYORDER = "_id";
    public static final String PRODUCTNAME_WEEKLYORDER = "worder_productname";
    public static final String MON_WEEKLYORDER = "worder_mon";
    public static final String TUE_WEEKLYORDER = "worder_tue";
    public static final String WED_WEEKLYORDER = "worder_wed";
    public static final String THU_WEEKLYORDER = "worder_thu";
    public static final String FRI_WEEKLYORDER = "worder_fri";
    public static final String SAT_WEEKLYORDER = "worder_sat";
    public static final String SUN_WEEKLYORDER = "worder_sun";
    public static final String AMOUNT_WEEKLYORDER = "worder_amount";
    public static final String CUSTOMER_WEEKLYORDER = "worder_customer";

    //Statement to create customer table
    private static final String SQL_CREATE_CUSTOMERS_TABLE = "CREATE TABLE " + TABLE_CUSTOMERS + " (" +
            ID_CUSTOMERS + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            FIRSTNAME_CUSTOMERS + " TEXT, " +
            SURNAME_CUSTOMERS + " TEXT, " +
            EMAIL_CUSTOMERS + " TEXT, " +
            ADDRESS1_CUSTOMERS + " TEXT UNIQUE NOT NULL, " +
            ADDRESS2_CUSTOMERS + " TEXT, " +
            ADDRESS3_CUSTOMERS + " TEXT, " +
            TOWN_CUSTOMERS + " TEXT, " +
            CITY_CUSTOMERS + " TEXT, " +
            POSTCODE_CUSTOMERS + " TEXT, " +
            HOMEPHONE_CUSTOMERS + " TEXT, " +
            MOBILENUMBER_CUSTOMERS + " TEXT, " +
            AMOUNTOWING_CUSTOMERS + " REAL" + ");";


    //Statement to create products table
    private static final String SQL_CREATE_PRODUCTS_TABLE = "CREATE TABLE " + TABLE_PRODUCTS + " (" +
            ID_PRODUCTS + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            NAME_PRODUCTS + " TEXT, " +
            PRICE_PRODUCTS + " REAL, " +
            NOTES_PRODUCTS + " TEXT" + ");";


    //Statement to create payments table
    private static final String SQL_CREATE_PAYMENTS_TABLE = "CREATE TABLE " + TABLE_PAYMENT + " (" +
            ID_PAYMENT + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            METHOD_PAYMENT + " TEXT, " +
            AMOUNTPAID_PAYMENT + " REAL, " +
            DATE_PAYMENT + " TEXT, " +
            CUSTOMER_PAYMENT + " INTEGER, " +
            "FOREIGN KEY (" + CUSTOMER_PAYMENT + ") REFERENCES " + TABLE_CUSTOMERS + "(" + ID_CUSTOMERS + "));";

    //Statements to create collecting session table
    // TODO: 14/09/2015 - add table statements

    //Statement to create standing order table
    private static final String SQL_CREATE_STANDINGORDER_TABLE = "CREATE TABLE " + TABLE_STANDINGORDER + " (" +
            ID_STANDINGORDER + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            PRODUCTNAME_STANDINGORDER + " TEXT, " +
            MON_STANDINGORDER + " INTEGER, " +
            TUE_STANDINGORDER + " INTEGER, " +
            WED_STANDINGORDER + " INTEGER, " +
            THU_STANDINGORDER + " INTEGER, " +
            FRI_STANDINGORDER + " INTEGER, " +
            SAT_STANDINGORDER + " INTEGER, " +
            SUN_STANDINGORDER + " INTEGER, " +
            AMOUNT_STANDINGORDER + " REAL, " +
            CUSTOMER_STANDINGORDER + " TEXT" + ");";
    //"FOREIGN KEY (" + CUSTOMER_STANDINGORDER + ") REFERENCES " + TABLE_CUSTOMERS + "(" + ID_CUSTOMERS + "));";


    //Statement to create weekly order table
    private static final String SQL_CREATE_WEEKLYORDER_TABLE = "CREATE TABLE " + TABLE_WEEKLYORDER + " (" +
            ID_WEEKLYORDER + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            PRODUCTNAME_WEEKLYORDER + " TEXT, " +
            MON_WEEKLYORDER + " INTEGER, " +
            TUE_WEEKLYORDER + " INTEGER, " +
            WED_WEEKLYORDER + " INTEGER, " +
            THU_WEEKLYORDER + " INTEGER, " +
            FRI_WEEKLYORDER + " INTEGER, " +
            SAT_WEEKLYORDER + " INTEGER, " +
            SUN_WEEKLYORDER + " INTEGER, " +
            AMOUNT_WEEKLYORDER + " REAL, " +
            CUSTOMER_WEEKLYORDER + " INTEGER, " +
            "FOREIGN KEY (" + CUSTOMER_WEEKLYORDER + ") REFERENCES " + TABLE_CUSTOMERS + "(" + ID_CUSTOMERS + "));";



}
