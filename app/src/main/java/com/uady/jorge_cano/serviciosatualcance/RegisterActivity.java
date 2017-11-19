package com.uady.jorge_cano.serviciosatualcance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.uady.jorge_cano.serviciosatualcance.dao.UserDataSource;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_registerView);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void registerUser(View view){

        if( isPasswordValid() && !areTextFieldsEmpty() ) {
            //registrar en base de datos
            EditText email = (EditText) findViewById(R.id.register_email);
            EditText password = (EditText) findViewById(R.id.register_password1);

            UserDataSource userDataSource = new UserDataSource(getApplicationContext());
            userDataSource.open();
            userDataSource.insertUser(email.getText().toString(), password.getText().toString());
            userDataSource.close();

            Toast.makeText(getApplicationContext(), "Usuario registrado.",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(
                    getApplicationContext(),
                    "No se pudo hacer el registro.",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    private boolean isPasswordValid(){

        EditText password1 = (EditText) findViewById(R.id.register_password1);
        String passwordText1 = password1.getText().toString();
        EditText password2 = (EditText) findViewById(R.id.register_password2);
        String passwordText2 = password2.getText().toString();

        return passwordText1.compareTo(passwordText2) == 0;
    }

    private boolean areTextFieldsEmpty(){

        EditText email = (EditText) findViewById(R.id.register_email);
        EditText password1 = (EditText) findViewById(R.id.register_password1);
        EditText password2 = (EditText) findViewById(R.id.register_password2);

        return email.getText().toString().compareTo("") == 0 ||
                password1.getText().toString().compareTo("") == 0 ||
                password2.getText().toString().compareTo("") == 0;
    }
}
