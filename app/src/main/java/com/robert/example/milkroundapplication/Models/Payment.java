package com.robert.example.milkroundapplication.Models;


/**
 * Created by Robert on 25/08/2015.
 */
public class Payment {

    //Instance variables
    private String paymentMethod;
    private int amountPaid;
    private String datePaid;
    private Customer paymentCustomer;

    /*
    Constructor
    Creates Payment with specified instance variables
     */
    public Payment(String method, int amount, String date, Customer customer){
        paymentMethod = method;
        amountPaid = amount;
        datePaid = date;
        paymentCustomer = customer;
    }


    /*
    Constructor
    Creates Payment with empty constructor
     */
    public Payment(){

    }

    //Getters and setters

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public Customer getPaymentCustomer() {
        return paymentCustomer;
    }

    public void setPaymentCustomer(Customer paymentCustomer) {
        this.paymentCustomer = paymentCustomer;
    }
}
