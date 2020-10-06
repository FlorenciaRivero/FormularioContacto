package com.florencia.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity<btnEdit> extends AppCompatActivity {

    Button btn;
    EditText et;
    EditText et2;
    String st;
    String st2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonSiguiente);
        et = findViewById(R.id.editTextName);
        et2 = findViewById(R.id.editTextMail);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PantallaConfirmacion.class);

                st = et.getText().toString();
                st2 = et2.getText().toString();

                intent.putExtra("Value",st);
                intent.putExtra("Mail", st2);
                startActivity(intent);
                finish();
            }
        });

    }


    public void sendFeedback(View view) {
        //Do click handling here

    }

}