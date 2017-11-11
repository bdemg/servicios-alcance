package com.uady.jorge_cano.serviciosatualcance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.uady.jorge_cano.serviciosatualcance.dao.UserDataSource;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){

        if( isUserRegistered() ){
            Intent intent = new Intent(this, StartActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(
                    getApplicationContext(),
                    "Aún no estás registrado.",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    private boolean isUserRegistered(){

        String email = ((EditText) findViewById(R.id.login_email)).getText().toString();
        String password = ((EditText) findViewById(R.id.login_password)).getText().toString();

        UserDataSource userDataSource = new UserDataSource(getApplicationContext());
        userDataSource.open();
        boolean isUserRegistered = userDataSource.isUserRegistered(email,password);
        userDataSource.close();

        return isUserRegistered;
    }

    public void register(View view){

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
