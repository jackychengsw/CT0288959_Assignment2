package com.example.jacky.ct0288959_a2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText sgd = (EditText) findViewById(R.id.editText1);
        ImageButton twButton = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton usButton = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton cnButton = (ImageButton) findViewById(R.id.imageButton3);
        final TextView result = (TextView) findViewById(R.id.textView);

        twButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double SGD = Double.parseDouble(sgd.getText().toString());
                double NTD = SGD * 22.18;
                result.setText(String.format("%.2f NTD", NTD));
            }
        });

        usButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double SGD = Double.parseDouble(sgd.getText().toString());
                double USD = SGD * 0.73;
                result.setText(String.format("%.2f USD", USD));
            }
        });

        cnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double SGD = Double.parseDouble(sgd.getText().toString());
                double CAD = SGD * 0.93;
                result.setText(String.format("%.2f CAD", CAD));
            }
        });
    }
}
