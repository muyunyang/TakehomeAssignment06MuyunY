package com.example.android.takehomeassignment06_muyuny;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {
    private String displayMessage;
    private TextView newtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Receipt re = (Receipt) intent.getSerializableExtra(Keys.RECEIPT_KEY);
        newtxt= (TextView)findViewById(R.id.Pass_field);

        double amount= re.getAmount();
        double tax=re.getTax();
        double tip=re.getTip();

      displayMessage="Total: "+amount+"\nSales Tax: "+tax+"\nTip: "+tip+"\nGrand Total:"+amount*(1+tax)+amount*tip;

        newtxt.setText(displayMessage);

    }
}
