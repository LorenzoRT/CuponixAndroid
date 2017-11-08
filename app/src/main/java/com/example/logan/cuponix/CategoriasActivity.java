package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CategoriasActivity extends AppCompatActivity {

    ListView categorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        setTitle("Categorías");

        categorias = (ListView) findViewById(R.id.listaCategorias);
    }
}
