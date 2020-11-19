package com.esprit.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);

    }

    public void countUp(View view) {

        ++mCount;

        if (mShowCount != null)
        {
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void showToast(View view) {
        CharSequence text = "Hello Toast";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    public void sendCount(View view) {
        Intent intent= new Intent(MainActivity.this,SecondActivity.class).putExtra("count",mCount);
        startActivity(intent);

    }
}