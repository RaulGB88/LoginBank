package com.practicas.pmdm.actividad4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView txtDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goWellcome(View view) {

        String dni = "";

        Intent pageReturned = new Intent(LoginActivity.this, WellActivity.class);
        pageReturned.putExtra("dni", R.id.etDNI);

        startActivity(pageReturned);
    }

    public void goHome(View view) {

        Intent pageReturned = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(pageReturned);
    }

}