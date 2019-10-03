package com.example.tarea05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SegundoActivity extends Activity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"el mas bello", "el mejor", "el malo", "el grande", "el que mejor programa" };
    private String edades [] = {   "10",           "15",       "20",       "25",            "30"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundo_activity);

        Bundle datos = getIntent().getExtras();

        String nombre = datos.getString("nombre");

        TextView texto_resultado = (TextView) findViewById(R.id.tv_nombre);

        texto_resultado.setText(""+nombre);

        lv1 = (ListView) findViewById(R.id.lv_cualidades);

        ArrayAdapter <String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_atributos, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                
            }
        });

    }

    public void mostrar_datos (View view) {


    }
}
