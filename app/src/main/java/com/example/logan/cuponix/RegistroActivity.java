package com.example.logan.cuponix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {

    EditText nombre, apellidos, telefono, correo, direccion, fecha, contrasena, confirmarContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        setTitle("Registro");

        nombre = (EditText) findViewById(R.id.etNombre);
        apellidos = (EditText) findViewById(R.id.etApellidos);
        telefono = (EditText) findViewById(R.id.etTelefono);
        correo = (EditText)findViewById(R.id.etCorreo);
        direccion = (EditText) findViewById(R.id.etDireccion);
        fecha = (EditText) findViewById(R.id.etFechaNacimiento);
        contrasena = (EditText) findViewById(R.id.etContrasena);
        confirmarContrasena = (EditText) findViewById(R.id.etConfirmarContrasena);
    }
}
