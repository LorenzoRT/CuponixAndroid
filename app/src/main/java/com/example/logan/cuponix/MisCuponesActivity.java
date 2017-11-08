package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MisCuponesActivity extends AppCompatActivity {

    ListView misCupones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_cupones);
        setTitle("Mis cupones");

        misCupones = (ListView) findViewById(R.id.listaMisCupones);

    }
}
