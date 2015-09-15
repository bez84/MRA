package com.robert.example.milkroundapplication.Models;

/**
 * Created by Robert on 25/08/2015.
 */
public class WeeklyOrder {

    //Instance variables
    private String weeklyOrderProductName;
    private int weeklyOrderMon;
    private int weeklyOrderTue;
    private int weeklyOrderWed;
    private int weeklyOrderThu;
    private int weeklyOrderFri;
    private int weeklyOrderSat;
    private int weeklyOrderSun;
    private int weeklyOrderAmount;
    private Customer weeklyOrderCustomer;

    /*
Constructor
Creates WeeklyOrder with specified instance variables
 */
    public WeeklyOrder(String productName, Customer customer){
        weeklyOrderProductName = productName;
        weeklyOrderCustomer = customer;
    }

    /*
    Constructor
    Creates WeeklyOrder with specified instance variables
    */
    public WeeklyOrder(String productName, int mon, int tue, int wed, int thu, int fri, int sat, int sun, int amount, Customer customer){
        weeklyOrderProductName = productName;
        weeklyOrderMon = mon;
        weeklyOrderTue = tue;
        weeklyOrderWed = wed;
        weeklyOrderThu = thu;
        weeklyOrderFri = fri;
        weeklyOrderSat = sat;
        weeklyOrderSun = sun;
        weeklyOrderAmount = amount;
        weeklyOrderCustomer = customer;
    }

    /*
    Constructor
    Creates StandingOrder with empty constructor
    */
    public WeeklyOrder(){

    }

    //Getters and setters

    public String getWeeklyOrderProductName() {
        return weeklyOrderProductName;
    }

    public void setWeeklyOrderProductName(String weeklyOrderProductName) {
        this.weeklyOrderProductName = weeklyOrderProductName;
    }

    public int getWeeklyOrderMon() {
        return weeklyOrderMon;
    }

    public void setWeeklyOrderMon(int weeklyOrderMon) {
        this.weeklyOrderMon = weeklyOrderMon;
    }

    public int getWeeklyOrderTue() {
        return weeklyOrderTue;
    }

    public void setWeeklyOrderTue(int weeklyOrderTue) {
        this.weeklyOrderTue = weeklyOrderTue;
    }

    public int getWeeklyOrderWed() {
        return weeklyOrderWed;
    }

    public void setWeeklyOrderWed(int weeklyOrderWed) {
        this.weeklyOrderWed = weeklyOrderWed;
    }

    public int getWeeklyOrderThu() {
        return weeklyOrderThu;
    }

    public void setWeeklyOrderThu(int weeklyOrderThu) {
        this.weeklyOrderThu = weeklyOrderThu;
    }

    public int getWeeklyOrderFri() {
        return weeklyOrderFri;
    }

    public void setWeeklyOrderFri(int weeklyOrderFri) {
        this.weeklyOrderFri = weeklyOrderFri;
    }

    public int getWeeklyOrderSat() {
        return weeklyOrderSat;
    }

    public void setWeeklyOrderSat(int weeklyOrderSat) {
        this.weeklyOrderSat = weeklyOrderSat;
    }

    public int getWeeklyOrderSun() {
        return weeklyOrderSun;
    }

    public void setWeeklyOrderSun(int weeklyOrderSun) {
        this.weeklyOrderSun = weeklyOrderSun;
    }

    public int getWeeklyOrderAmount() {
        return weeklyOrderAmount;
    }

    public void setWeeklyOrderAmount(int weeklyOrderAmount) {
        this.weeklyOrderAmount = weeklyOrderAmount;
    }

    public Customer getWeeklyOrderCustomer() {
        return weeklyOrderCustomer;
    }

    public void setWeeklyOrderCustomer(Customer weeklyOrderCustomer) {
        this.weeklyOrderCustomer = weeklyOrderCustomer;
    }
}
