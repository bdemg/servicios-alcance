package com.uady.jorge_cano.serviciosatualcance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){

        Intent intent = new Intent(this, StartActivity.class);
        startActivity(intent);
    }

    public void register(View view){

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
