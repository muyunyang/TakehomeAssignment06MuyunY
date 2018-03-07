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
        double total=amount*(1+tax)+amount*tip;
      displayMessage="Total: "+amount+"\n20"+"Sales Tax: "+tax+"\n"+"Tip: "+tip+"\n"+"Grand Total:"+total;

        newtxt.setText(displayMessage);

    }
}
