package com.kytom.clase02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.calcula);
        dato = (EditText) findViewById(R.id.dato);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.parseInt(dato.getText().toString());
                Toast.makeText(MainActivity.this,"Resultado :" + factorial(numero), Toast.LENGTH_LONG).show();

            }
        });
    }

        public int factorial (int numero){
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
             factorial = factorial * i;
        }
        return factorial;

    }
}