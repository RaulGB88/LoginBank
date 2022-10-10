package com.practicas.pmdm.actividad4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLogin(View view) {

        //Button page = (Button) view.findViewById(R.id.btnLogin);

        Intent pageReturned = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(pageReturned);
    }

}