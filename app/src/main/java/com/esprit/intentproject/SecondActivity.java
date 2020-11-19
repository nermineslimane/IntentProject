package com.esprit.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mResultCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("count", 0);

        mResultCount=(TextView) findViewById(R.id.result_count);
        mResultCount.setText("You counted to "+Integer.toString(intValue)+"!");
        System.out.println(mResultCount);
        System.out.println(intValue);

    }


}