package com.florencia.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaConfirmacion extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    String st;
    String st2;
    String st3;
    String st4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_confirmacion);
        tv = findViewById(R.id.myTextView);
        tv2 = findViewById(R.id.myTextView2);
        tv3 = findViewById(R.id.myTextView3);
        tv4 = findViewById(R.id.myTextView4);

        st = getIntent().getExtras().getString("Value");
        st2 = getIntent().getExtras().getString("Mail");
        st3 = getIntent().getExtras().getString("Telefono");
        st4 = getIntent().getExtras().getString("Descripcion");
        tv.setText(st);
        tv2.setText(st2);
        tv3.setText(st3);
        tv4.setText(st4);

        Button btn2 = (Button) findViewById(R.id.buttonEditar);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                Intent btnIntent2 = new Intent (PantallaConfirmacion.this, MainActivity.class);
                startActivity(btnIntent2);
            }
        });


    }
}