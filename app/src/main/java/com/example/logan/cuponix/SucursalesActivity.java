package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class SucursalesActivity extends AppCompatActivity {

    ListView Sucursales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);
        setTitle("Sucursales");

        Sucursales = (ListView) findViewById(R.id.listaSucursales);
    }
}
