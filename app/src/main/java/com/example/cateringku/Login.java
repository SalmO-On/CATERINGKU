package com.example.cateringku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void onClickGoToForgetPassword(View view) {
        Intent forget = new Intent(Login .this, ForgetPassword.class );
        startActivity(forget);
    }

    public void onClickGoToSignUp(View view) {
        Intent regist = new Intent(Login .this, SignUp.class );
        startActivity(regist);
    }

    public void LoginMainMenu(View view) {
        Intent login = new Intent(Login .this, MainActivity.class );
        startActivity(login);
    }
}
