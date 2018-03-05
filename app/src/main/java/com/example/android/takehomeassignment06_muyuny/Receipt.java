package com.example.android.takehomeassignment06_muyuny;

import java.io.Serializable;

/**
 * Created by yangmuyun on 3/4/18.
 */

public class Receipt implements Serializable {
    private double amount;
    private double tax;
    private double tip;


    public Receipt(double amount,double tax,double tip){
        this.amount=amount;
        this.tax=tax;
        this.tip=tip;

    }


    public  double getAmount(){return amount;}
    public  double getTax(){
        return tax;
    }
    public double getTip(){
        return tip;
    }

}
