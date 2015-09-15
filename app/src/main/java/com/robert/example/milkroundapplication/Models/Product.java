package com.robert.example.milkroundapplication.Models;

/**
 * Created by Robert on 25/08/2015.
 */
public class Product {

    //Instance variables
    private String productName;
    private int productPrice;
    private String productNotes;

    /*
    Constructor
    Creates Product with specified instance variables
     */
    public Product(String name, int price, String notes){
        productName = name;
        productPrice = price;
        productNotes = notes;
    }

    /*
    Constructor
    Creates Product with specified instance variables
     */
    public Product(String name, int price){
        productName = name;
        productPrice = price;
    }

    /*
    Constructor
    Creates Product with empty constructor
     */
    public Product(){

    }



    //Getters and setters for Product instance variables

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductNotes() {
        return productNotes;
    }

    public void setProductNotes(String productNotes) {
        this.productNotes = productNotes;
    }
}


