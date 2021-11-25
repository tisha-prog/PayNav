package com.project.paynav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_home);


    }

    public void goTo(View view) {

        //for account
        Intent i = new Intent(this,Account.class);
        startActivity(i);
    }
}