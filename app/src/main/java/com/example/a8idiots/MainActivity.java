package com.example.a8idiots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    Button enter;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.eweight);
        height = findViewById(R.id.edtheight);
        enter = findViewById(R.id.btnenter);
        txt = findViewById(R.id.txtanswer);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                float w = Float.parseFloat(weight.getText().toString());
                float h = Float.parseFloat(height.getText().toString());


                float ans = (w / ((h)*(h))) * 10000;

                txt.setText(""+ans);

            }
        });



    }
}