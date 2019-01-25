package com.gavhane.b.vivek.agecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import  java.lang.String;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    TextView t1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.editText);
        t1 = (TextView) findViewById(R.id.textView);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                String sDate = String.valueOf(c.get(Calendar.YEAR));
                String BdayYear = e1.getText().toString();

                int n1 = Integer.parseInt(sDate);
                int n2 = Integer.parseInt(BdayYear);

                int Age = n1-n2;
                String AgeString = String.valueOf(Age);
                t1.setText( AgeString);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                t1.setText("");
            }
        });


    }
}
