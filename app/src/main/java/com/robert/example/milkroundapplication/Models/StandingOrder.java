package com.robert.example.milkroundapplication.Models;


/**
 * Created by Robert on 25/08/2015.
 */
public class StandingOrder {

    //Instance variables
    private String standingOrderProductName;
    private int standingOrderMon;
    private int standingOrderTue;
    private int standingOrderWed;
    private int standingOrderThu;
    private int standingOrderFri;
    private int standingOrderSat;
    private int standingOrderSun;
    private int standingOrderAmount;
    private Customer standingOrderCustomer;

    /*
Constructor
Creates StandingOrder with specified instance variables
 */
    public StandingOrder(String productName, Customer customer){
        standingOrderProductName = productName;
        standingOrderCustomer = customer;
    }

    /*
    Constructor
    Creates StandingOrder with specified instance variables
    */
    public StandingOrder(String productName, int mon, int tue, int wed, int thu, int fri, int sat, int sun, int amount, Customer customer){
        standingOrderProductName = productName;
        standingOrderMon = mon;
        standingOrderTue = tue;
        standingOrderWed = wed;
        standingOrderThu = thu;
        standingOrderFri = fri;
        standingOrderSat = sat;
        standingOrderSun = sun;
        standingOrderAmount = amount;
        standingOrderCustomer = customer;
    }

    /*
    Constructor
    Creates StandingOrder with empty constructor
    */
    public StandingOrder(){

    }

    //Getters and setters


    public String getStandingOrderProductName() {
        return standingOrderProductName;
    }

    public void setStandingOrderProductName(String standingOrderProductName) {
        this.standingOrderProductName = standingOrderProductName;
    }

    public int getStandingOrderMon() {
        return standingOrderMon;
    }

    public void setStandingOrderMon(int standingOrderMon) {
        this.standingOrderMon = standingOrderMon;
    }

    public int getStandingOrderTue() {
        return standingOrderTue;
    }

    public void setStandingOrderTue(int standingOrderTue) {
        this.standingOrderTue = standingOrderTue;
    }

    public int getStandingOrderWed() {
        return standingOrderWed;
    }

    public void setStandingOrderWed(int standingOrderWed) {
        this.standingOrderWed = standingOrderWed;
    }

    public int getStandingOrderThu() {
        return standingOrderThu;
    }

    public void setStandingOrderThu(int standingOrderThu) {
        this.standingOrderThu = standingOrderThu;
    }

    public int getStandingOrderFri() {
        return standingOrderFri;
    }

    public void setStandingOrderFri(int standingOrderFri) {
        this.standingOrderFri = standingOrderFri;
    }

    public int getStandingOrderSat() {
        return standingOrderSat;
    }

    public void setStandingOrderSat(int standingOrderSat) {
        this.standingOrderSat = standingOrderSat;
    }

    public int getStandingOrderSun() {
        return standingOrderSun;
    }

    public void setStandingOrderSun(int standingOrderSun) {
        this.standingOrderSun = standingOrderSun;
    }

    public int getStandingOrderAmount() {
        return standingOrderAmount;
    }

    public void setStandingOrderAmount(int standingOrderAmount) {
        this.standingOrderAmount = standingOrderAmount;
    }

    public Customer getStandingOrderCustomer() {
        return standingOrderCustomer;
    }

    public void setStandingOrderCustomer(Customer standingOrderCustomer) {
        this.standingOrderCustomer = standingOrderCustomer;
    }
}

