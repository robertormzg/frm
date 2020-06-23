package com.robertormzg.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionActivity extends AppCompatActivity {

    Button botonEditar;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        botonEditar = (Button) findViewById(R.id.btnEditar);

        TextView tvDatoNombre = (TextView) findViewById(R.id.tvDatoNombre);
        TextView tvDatoFecha = (TextView) findViewById(R.id.tvDatoFecha);
        TextView tvDatoTelefono = (TextView) findViewById(R.id.tvDatoTelefono);
        TextView tvDatoCorreo = (TextView) findViewById(R.id.tvDatoCorreo);
        TextView tvDatoDescripcion = (TextView) findViewById(R.id.tvDatoDescripcion);


        datos = getIntent().getExtras();
        String nombre = datos.getString("nom");
        String fecha = datos.getString("fec");
        String telefono = datos.getString("tel");
        String correo = datos.getString("cor");
        String descripcion = datos.getString("des");

        tvDatoNombre.setText(nombre);
        tvDatoFecha.setText(fecha);
        tvDatoTelefono.setText(telefono);
        tvDatoCorreo.setText(correo);
        tvDatoDescripcion.setText(descripcion);

        botonEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //Intent i = new Intent(ConfirmacionActivity.this, MainActivity.class);
                //startActivity(i);
            }
        });
    }
}