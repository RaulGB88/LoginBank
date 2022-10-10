package com.practicas.pmdm.actividad4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WellActivity extends AppCompatActivity {

    TextView txtUserDNI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);
    }

    public void goHome(View view) {

        Intent pageReturned = new Intent(WellActivity.this, MainActivity.class);
        recieveData();
        startActivity(pageReturned);
    }

    private void recieveData() {
        Bundle extras = getIntent().getExtras();
        String dni = (String) extras.get("dni");

        txtUserDNI = (TextView) findViewById(R.id.txtUserDNI);
        txtUserDNI.setText(dni);
    }

}