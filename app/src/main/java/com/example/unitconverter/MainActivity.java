package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView convertedValue;
    private EditText number1, number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        convertedValue = findViewById(R.id.convertedValue);
        number2 = findViewById(R.id.number2);
        StringBuilder table = new StringBuilder();

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(number2.getText().toString());

                for (int i = 1; i <=10 ; i++) {
                    int result = number * i;
                    table.append(String.format("%2d x %2d = %2d\n", number, i, result));
                }
                convertedValue.setText(table.toString());
            }
        });
    }
}