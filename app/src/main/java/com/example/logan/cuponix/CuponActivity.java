package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CuponActivity extends AppCompatActivity {

    ListView cupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupon);
        setTitle("Mi cupón");

        cupon = (ListView) findViewById(R.id.listaCupon);


    }
}
