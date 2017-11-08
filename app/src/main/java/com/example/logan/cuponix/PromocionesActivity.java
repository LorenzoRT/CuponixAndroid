package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PromocionesActivity extends AppCompatActivity {

    ListView promociones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);
        setTitle("Promociones");

        promociones = (ListView) findViewById(R.id.listaPromociones);
    }
}
