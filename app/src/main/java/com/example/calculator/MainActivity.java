package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edittextone;
    private EditText edittexttwo;
    private TextView btnresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittextone = (EditText) findViewById(R.id.edittextone);
        edittexttwo = (EditText) findViewById(R.id.edittexttwo);
        btnresult = (TextView) findViewById(R.id.btnresult);

    }
    public void btnadd(View view)
    {
        int n1 = Integer.parseInt(edittextone.getText().toString());
        int n2 = Integer.parseInt(edittexttwo.getText().toString());
        int sum  = n1 + n2;
        btnresult.setText(String.valueOf(sum));
    }
    public void btnsub(View view)
    {
        int n1 = Integer.parseInt(edittextone.getText().toString());
        int n2 = Integer.parseInt(edittexttwo.getText().toString());
        int sum = n1 - n2;
        btnresult.setText(String.valueOf(sum));
    }
    public void btnmul(View view)
    {
        int n1 = Integer.parseInt(edittextone.getText().toString());
        int n2 = Integer.parseInt(edittexttwo.getText().toString());
        int sum = n1 * n2;
        btnresult.setText(String.valueOf(sum));
    }
    public void btndiv(View view)
    {
        int n1 = Integer.parseInt(edittextone.getText().toString());
        int n2 = Integer.parseInt(edittexttwo.getText().toString());
        int sum = n1 / n2;
        btnresult.setText(String.valueOf(sum));

    }
}