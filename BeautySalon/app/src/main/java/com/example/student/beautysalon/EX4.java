package com.example.student.beautysalon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EX4 extends AppCompatActivity {
    Button btn5;
    EditText ed1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
        btn5=(Button)findViewById(R.id.btn5);
        ed1=(EditText)findViewById(R.id.ed1);
        text1=(TextView)findViewById(R.id.text1);
    }
}
