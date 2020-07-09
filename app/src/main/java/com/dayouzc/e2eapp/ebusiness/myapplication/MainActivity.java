package com.dayouzc.e2eapp.ebusiness.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dayouzc.e2eapp.ebusiness.mylibrary.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void OnClick(View view) {

        startActivity(new Intent(this, LoginActivity.class));

    }
}