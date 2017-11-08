package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class EmpresasActivity extends AppCompatActivity {

    ListView empresas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresas);
        setTitle("Empresas");

        empresas = (ListView) findViewById(R.id.listaEmpresas);
    }
}
