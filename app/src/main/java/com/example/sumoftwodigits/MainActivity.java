package com.example.sumoftwodigits;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView1;
    EditText editText1,editText2;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.t2);
        editText1 = findViewById(R.id.e1);
        editText2 = findViewById(R.id.e2);
        button = findViewById(R.id.sumBtn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        int num1,num2,total;

        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        total=num1+num2;
        textView1.setText("Sum Is : "+total);

    }
}