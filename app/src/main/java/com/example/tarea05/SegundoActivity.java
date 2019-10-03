package com.example.tarea05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_activity);

        Bundle datos = getIntent().getExtras();

        String nombre = datos.getString("nombre");

        TextView texto_resultado = (TextView) findViewById(R.id.tv_nombre);

        texto_resultado.setText(""+nombre);
    }

    public void mostrar_datos (View view) {


    }
}
