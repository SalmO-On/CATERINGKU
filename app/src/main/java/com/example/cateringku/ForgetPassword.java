package com.example.cateringku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        getSupportActionBar().hide();
    }

    public void onClickBackToLogin(View view) {
        Intent bckLogin = new Intent(ForgetPassword.this, Login.class );
        startActivity(bckLogin);
    }
}