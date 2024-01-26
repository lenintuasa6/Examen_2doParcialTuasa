package com.example.examen_2doparcialtuasa;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText primerParcialEditText;
    private EditText segundoParcialEditText;
    private EditText presentarPromedioEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primerParcialEditText = findViewById(R.id.primerParcialEditText);
        segundoParcialEditText = findViewById(R.id.segundoParcialEditText);
        presentarPromedioEditText = findViewById(R.id.presentarPromedioEditText);
    }

    public void calcularPromedio(View view) {
        String primerParcialStr = primerParcialEditText.getText().toString();
        String segundoParcialStr = segundoParcialEditText.getText().toString();

        if (!primerParcialStr.isEmpty() && !segundoParcialStr.isEmpty()) {
            double primerParcial = Double.parseDouble(primerParcialStr);
            double segundoParcial = Double.parseDouble(segundoParcialStr);

            double promedio = (primerParcial + segundoParcial) / 2;

            presentarPromedioEditText.setText(String.valueOf(promedio));
        }
    }
}