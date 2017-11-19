package com.uady.jorge_cano.serviciosatualcance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.uady.jorge_cano.serviciosatualcance.dao.UserDataSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        String name = ((EditText) findViewById(R.id.register_name)).getText().toString();
        String email = ((EditText) findViewById(R.id.register_email)).getText().toString();
        String phone = ((EditText) findViewById(R.id.register_phone)).getText().toString();
        String address = ((EditText) findViewById(R.id.register_address)).getText().toString();
        String password = ((EditText) findViewById(R.id.register_password1)).getText().toString();

        if( areTextFieldsEmpty() ){
            Toast.makeText(
                    getApplicationContext(),
                    "Aún hay campos por completar.",
                    Toast.LENGTH_SHORT
            ).show();
        }
        else if( !isEmailFormatValid(email) ){
            Toast.makeText(
                    getApplicationContext(),
                    "No es un correo electrónico válido.",
                    Toast.LENGTH_SHORT
            ).show();
        }
        else if( isEmailRegistered(email) ){
            Toast.makeText(
                    getApplicationContext(),
                    "No se pudo hacer el registro. El correo electrónico ya existe.",
                    Toast.LENGTH_SHORT
            ).show();
        }
        else if( isPasswordValid() ) {
            //registrar en base de datos
            UserDataSource userDataSource = new UserDataSource(getApplicationContext());
            userDataSource.open();
            userDataSource.insertUser(name, email, phone, address, password);
            userDataSource.close();

            Toast.makeText(getApplicationContext(), "Usuario registrado.",Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(
                    getApplicationContext(),
                    "No se pudo hacer el registro. Contraseña incorrecta.",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    private boolean isEmailFormatValid(String email){

        Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(email);
        return matcher.find();
    }

    private boolean isEmailRegistered(String email){

        UserDataSource userDataSource = new UserDataSource(getApplicationContext());
        userDataSource.open();
        boolean isUserRegistered = userDataSource.isEmailRegistered(email);
        userDataSource.close();

        return isUserRegistered;
    }

    private boolean isPasswordValid(){

        String password1 = ((EditText) findViewById(R.id.register_password1)).getText().toString();
        String password2 = ((EditText) findViewById(R.id.register_password2)).getText().toString();

        return password1.compareTo(password2) == 0;
    }

    private boolean areTextFieldsEmpty(){

        String name = ((EditText) findViewById(R.id.register_name)).getText().toString();
        String email = ((EditText) findViewById(R.id.register_email)).getText().toString();
        String phone = ((EditText) findViewById(R.id.register_phone)).getText().toString();
        String address = ((EditText) findViewById(R.id.register_address)).getText().toString();
        String password1 = ((EditText) findViewById(R.id.register_password1)).getText().toString();
        String password2 = ((EditText) findViewById(R.id.register_password2)).getText().toString();

        return name.compareTo("") == 0 ||
                email.compareTo("") == 0 ||
                phone.compareTo("") == 0 ||
                address.compareTo("") == 0 ||
                password1.compareTo("") == 0 ||
                password2.compareTo("") == 0;
    }
}
