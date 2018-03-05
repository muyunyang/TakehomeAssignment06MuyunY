package com.example.android.takehomeassignment06_muyuny;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText amountText;
    private EditText taxText;
    private EditText tipText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickSubmit(View view) {
        Intent intent = new Intent(this, activity_second.class);

        amountText=findViewById(R.id.amount_field);
        String amounttxt=amountText.getText().toString();
        double amount=Double.parseDouble(amounttxt);
        taxText=findViewById(R.id.taxPercentage_field);
        String taxtxt=taxText.getText().toString();
       double tax=Double.parseDouble(taxtxt);
        tipText=findViewById(R.id.tipPercentage_field);
        String tiptxt=tipText.getText().toString();
       double tip=Double.parseDouble(tiptxt);


       Receipt newReceipt=new Receipt(amount,tax,tip);
        intent.putExtra(Keys.RECEIPT_KEY,newReceipt);
        startActivity(intent);
    }
}
