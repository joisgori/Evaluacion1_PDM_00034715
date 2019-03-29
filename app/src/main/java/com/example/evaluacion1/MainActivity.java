package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.evaluacion1.utilities.AppConstant.TEXT_EMAIL;
import static com.example.evaluacion1.utilities.AppConstant.TEXT_PR;
import static com.example.evaluacion1.utilities.AppConstant.TEXT_USUARIO;

public class MainActivity extends AppCompatActivity {

    //Defino mis variables...
    private static Button bo_enviar;
    private static EditText mUser, mEmail;
    private static Integer contador;
    private static TextView p1, p2, p3, p4, p5, p6, p7, p8, p9;
    private static LinearLayout l1, l2, l3, l4, l5, l6, l7, l8, l9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bo_enviar = findViewById(R.id.btn_enviar);
        mUser = findViewById(R.id.et_usuario);
        mEmail = findViewById(R.id.et_correo);

        bo_enviar.setOnClickListener(v -> {
            //Creo las variables para el texto...
            String user = mUser.getText().toString();
            String email = mEmail.getText().toString();

            //Suma total de los productos...
            int SumaT = Integer.parseInt(p1.getText().toString()) + Integer.parseInt(p2.getText().toString()) +
                    Integer.parseInt(p3.getText().toString()) + Integer.parseInt(p4.getText().toString()) +
                    Integer.parseInt(p5.getText().toString()) + Integer.parseInt(p6.getText().toString()) +
                    Integer.parseInt(p7.getText().toString()) + Integer.parseInt(p8.getText().toString()) +
                    Integer.parseInt(p9.getText().toString());

            //Creo el intent para el nuevo activity
            Intent mIntent = new Intent(MainActivity.this, Factura.class);

            //Mando los datos con un id...
            mIntent.putExtra(TEXT_USUARIO, user);
            mIntent.putExtra(TEXT_EMAIL, email);
            //Casteo a String :V sumándole solo cadena vacía
            mIntent.putExtra(TEXT_PR, SumaT+"");
            startActivity(mIntent);

        });

        //Creo el evento de los contadores:
        l1 = findViewById(R.id.ly_pr1);
        p1 = findViewById(R.id.pr1);
        l1.setOnClickListener(v -> {
            contador = Integer.parseInt(p1.getText().toString()) + 1;
            p1.setText(Integer.toString(contador));

        });

        //Segundo contador:
        l2 = findViewById(R.id.ly_pr2);
        p2 = findViewById(R.id.pr2);
        l2.setOnClickListener(v -> {
            contador = Integer.parseInt(p2.getText().toString()) + 1;
            p2.setText(Integer.toString(contador));

        });

        //Resto de contadores
        //3
        l3 = findViewById(R.id.ly_pr3);
        p3 = findViewById(R.id.pr3);
        l3.setOnClickListener(v -> {
            contador = Integer.parseInt(p3.getText().toString()) + 1;
            p3.setText(Integer.toString(contador));

        });

        //4
        l4 = findViewById(R.id.ly_pr4);
        p4 = findViewById(R.id.pr4);
        l4.setOnClickListener(v -> {
            contador = Integer.parseInt(p4.getText().toString()) + 1;
            p4.setText(Integer.toString(contador));

        });

        //5
        l5 = findViewById(R.id.ly_pr5);
        p5 = findViewById(R.id.pr5);
        l5.setOnClickListener(v -> {
            contador = Integer.parseInt(p5.getText().toString()) + 1;
            p5.setText(Integer.toString(contador));

        });

        //6
        l6 = findViewById(R.id.ly_pr6);
        p6 = findViewById(R.id.pr6);
        l6.setOnClickListener(v -> {
            contador = Integer.parseInt(p6.getText().toString()) + 1;
            p6.setText(Integer.toString(contador));

        });

        //7
        l7 = findViewById(R.id.ly_pr7);
        p7 = findViewById(R.id.pr7);
        l7.setOnClickListener(v -> {
            contador = Integer.parseInt(p7.getText().toString()) + 1;
            p7.setText(Integer.toString(contador));

        });

        //8
        l8 = findViewById(R.id.ly_pr8);
        p8 = findViewById(R.id.pr8);
        l8.setOnClickListener(v -> {
            contador = Integer.parseInt(p8.getText().toString()) + 1;
            p8.setText(Integer.toString(contador));

        });

        //9
        l9 = findViewById(R.id.ly_pr9);
        p9 = findViewById(R.id.pr9);
        l9.setOnClickListener(v -> {
            contador = Integer.parseInt(p9.getText().toString()) + 1;
            p9.setText(Integer.toString(contador));

        });


    }
}
