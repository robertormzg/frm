package com.robertormzg.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente, btnFecha;
    EditText etNombre, etFecha, etTel, etCorreo, etDesc;
    int dia, mes, anyo;
    DatePickerDialog datePickerDialog;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        btnFecha = (Button) findViewById(R.id.btnFecha);
        etNombre = (EditText) findViewById(R.id.etNombre);
        etFecha = (EditText) findViewById(R.id.etFecha);
        etTel = (EditText) findViewById(R.id.etTelefono);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        etDesc = (EditText) findViewById(R.id.etDescripcion);

        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calendar = Calendar.getInstance();
                dia = calendar.get(Calendar.DAY_OF_MONTH);
                mes = calendar.get(Calendar.MONTH);
                anyo = calendar.get(Calendar.YEAR);

                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                etFecha.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                            }
                        }, anyo, mes, dia);
                datePickerDialog.show();
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
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