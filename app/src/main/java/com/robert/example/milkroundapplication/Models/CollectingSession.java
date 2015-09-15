package com.robert.example.milkroundapplication.Models;

import java.util.Date;

/**
 * Created by Robert on 13/09/2015.
 */
public class CollectingSession {

    //Instance variables
    private Date theDate;
    private float cash;
    private float cheque;
    private float card;
    private float disputes;
    private float totalCollected;

    public Date getTheDate() {
        return theDate;
    }

    public void setTheDate(Date theDate) {
        this.theDate = theDate;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public float getCheque() {
        return cheque;
    }

    public void setCheque(float cheque) {
        this.cheque = cheque;
    }

    public float getCard() {
        return card;
    }

    public void setCard(float card) {
        this.card = card;
    }

    public float getTotalCollected() {
        return totalCollected;
    }

    public void setTotalCollected(float totalCollected) {
        this.totalCollected = this.getCash() + this.getCard() + this.getCheque() + this.getDisputes();
    }

    public float getDisputes() {
        return disputes;
    }

    public void setDisputes(float disputes) {
        this.disputes = disputes;
    }
}
