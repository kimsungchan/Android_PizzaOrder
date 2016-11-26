package com.example.samsung.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3;
    EditText e1,e2,e3;
    CheckBox c;
    RadioGroup rg;
    RadioButton r1,r2;
    ImageView i;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView5);
        t3=(TextView)findViewById(R.id.textView6);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        c=(CheckBox)findViewById(R.id.checkBox);

    }
}
