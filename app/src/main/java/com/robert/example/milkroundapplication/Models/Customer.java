package com.robert.example.milkroundapplication.Models;


import java.util.Set;

/**
 * Created by Robert on 25/08/2015.
 */
public class Customer {

    //Instance  variables
    private String customerFirstName;
    private String customerSurname;
    private String customerEmailAddress;
    private String customerAddress1;
    private String customerAddress2;
    private String customerAddress3;
    private String customerTown;
    private String customerCity;
    private String customerPostcode;
    private String customerHomePhoneNumber;
    private String customerMobilePhoneNumber;
    private Float customerAmountOwing;
    private Set<Payment> customerPaymentSet;
    private StandingOrder customerStandingOrder;



    /*
    Constructor
    Creates Customer with specified instance variables
     */
    public Customer(String address){
        customerAddress1 = address;
    }

    /*
    Constructor
    Creates Customer with empty constructor
    */
    public Customer(){

    }


    //Getters and setters for Customer instance variables


    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerAddress1() {
        return customerAddress1;
    }

    public void setCustomerAddress1(String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public String getCustomerAddress2() {
        return customerAddress2;
    }

    public void setCustomerAddress2(String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public String getCustomerAddress3() {
        return customerAddress3;
    }

    public void setCustomerAddress3(String customerAddress3) {
        this.customerAddress3 = customerAddress3;
    }

    public String getCustomerTown() {
        return customerTown;
    }

    public void setCustomerTown(String customerTown) {
        this.customerTown = customerTown;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerPostcode() {
        return customerPostcode;
    }

    public void setCustomerPostcode(String customerPostcode) {
        this.customerPostcode = customerPostcode;
    }

    public String getCustomerHomePhoneNumber() {
        return customerHomePhoneNumber;
    }

    public void setCustomerHomePhoneNumber(String customerHomePhoneNumber) {
        this.customerHomePhoneNumber = customerHomePhoneNumber;
    }

    public String getCustomerMobilePhoneNumber() {
        return customerMobilePhoneNumber;
    }

    public void setCustomerMobilePhoneNumber(String customerMobilePhoneNumber) {
        this.customerMobilePhoneNumber = customerMobilePhoneNumber;
    }

    public float getCustomerAmountOwing() {
        return customerAmountOwing;
    }

    public void setCustomerAmountOwing(float customerAmountOwing) {
        this.customerAmountOwing = customerAmountOwing;
    }

    public Set<Payment> getCustomerPaymentSet() {
        return customerPaymentSet;
    }

    public void setCustomerPaymentSet(Set<Payment> customerPaymentSet) {
        this.customerPaymentSet = customerPaymentSet;
    }

    public StandingOrder getCustomerStandingOrder() {
        return customerStandingOrder;
    }

    public void setCustomerStandingOrder(StandingOrder customerStandingOrder) {
        this.customerStandingOrder = customerStandingOrder;
    }
}
