package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables

    private EditText numero1;//variable edittext1
    private EditText numero2;//variable edittext2
    private TextView Resultado;//variable resultado
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //identificadores

        numero1= (EditText) findViewById(R.id.txtnumero1);
        numero2= (EditText) findViewById(R.id.txtnumero2);
        Resultado= (TextView) findViewById(R.id.txtresultado);

    }

    //metodo suma
    public void suma(View view){
        String valor1= numero1.getText().toString();//capturando el dato ingresado
        String valor2= numero2.getText().toString();

        //convertir los datos capturados
        if(validar()) {
            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);

            int suma = numero1 + numero2;//suma de valor 1 + valor2

            String resultado = String.valueOf(suma);//salida string suma
            Resultado.setText(resultado);
        }
    }

    //metodo resta
    public void resta(View view){
        if(validar()) {
            String valor1 = numero1.getText().toString();//capturando el dato ingresado
            String valor2 = numero2.getText().toString();

            //convertir los datos capturados

            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);

            int resta = numero1 - numero2;//suma de valor 1 + valor2

            String resultado = String.valueOf(resta);//salida string suma
            Resultado.setText(resultado);
        }
    }

    //metodo multiplicacion
    public void multiplicacion(View view){
        if(validar()) {
            String valor1 = numero1.getText().toString();//capturando el dato ingresado
            String valor2 = numero2.getText().toString();

            //convertir los datos capturados

            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);

            int multiplicacion = numero1 * numero2;//suma de valor 1 + valor2

            String resultado = String.valueOf(multiplicacion);//salida string suma
            Resultado.setText(resultado);
        }
    }

    //metodo division
    public void division(View view){
        if(validar()) {
            String valor1 = numero1.getText().toString();//capturando el dato ingresado
            String valor2 = numero2.getText().toString();

            //convertir los datos capturados

            int numero1 = Integer.parseInt(valor1);
            int numero2 = Integer.parseInt(valor2);

            if (numero2 != 0) {
                int division = numero1 / numero2;//suma de valor 1 + valor2
                String resultado = String.valueOf(division);//salida string suma
                Resultado.setText(resultado);
            } else {
                Resultado.setText("Error");
            }
        }

    }

    public boolean validar(){
        boolean retorno= true;

        String c1 = numero1.getText().toString();
        String c2 = numero2.getText().toString();

        if ((c1.isEmpty())){
            numero1.setError("El campo 1 no puede estar vacio");
            retorno =false;
        }
        if ((c2.isEmpty())){
            numero2.setError("El campo 2 no puede estar vacio");
            retorno = false;
        }
        return retorno;
    }
}