package com.example.a8idiots;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox read, dance, sleep;
    TextView txt;
    String box = "";
    Button next2;
    RadioGroup gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        read = findViewById(R.id.read);
        dance = findViewById(R.id.dance);
        sleep = findViewById(R.id.sleep);
        txt = findViewById(R.id.text);

        next2 = findViewById(R.id.next);
        gender = findViewById(R.id.gender);


        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //  Check Box

                box = "";

                if (read.isChecked()) {

                    box += "reading";

                }
                if (dance.isChecked()) {

                    box += "dance";



                }
                if (sleep.isChecked()) {

                    box += "sleep";




                }


                Toast.makeText(MainActivity.this, ""+box, Toast.LENGTH_SHORT).show();


                //  Radio Button
                int Gender = gender.getCheckedRadioButtonId();

                RadioButton button = findViewById(Gender);

                Toast.makeText(MainActivity.this, ""+button.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });


    }
}