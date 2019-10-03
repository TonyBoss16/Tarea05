package com.example.tarea05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejecutar_segundo_activity (View view) {

        EditText cuadro_nombre = (EditText) findViewById(R.id.edt_name);

        Intent i = new Intent(this, SegundoActivity.class);

        i.putExtra("nombre",""+cuadro_nombre.getText() );
        //i.putExtra("nombre2","Soy Anthony");

        startActivity(i);
    }
}
