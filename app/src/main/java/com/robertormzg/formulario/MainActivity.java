package com.robertormzg.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button botonSiguiente;
    EditText etNombre, etFecha, etTel, etCorreo, etDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonSiguiente = (Button) findViewById(R.id.btnSiguiente);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etFecha = (EditText) findViewById(R.id.etFecha);
        etTel = (EditText) findViewById(R.id.etTelefono);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        etDesc = (EditText) findViewById(R.id.etDescripcion);

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ConfirmacionActivity.class);
                i.putExtra("nom", etNombre.getText().toString());
                i.putExtra("fec", etFecha.getText().toString());
                i.putExtra("tel", etTel.getText().toString());
                i.putExtra("cor", etCorreo.getText().toString());
                i.putExtra("des", etDesc.getText().toString());
                startActivity(i);
            }
        });
    }

}