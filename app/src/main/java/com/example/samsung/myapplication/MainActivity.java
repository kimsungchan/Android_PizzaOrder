package com.example.samsung.myapplication;

import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        rg=(RadioGroup)findViewById(R.id.RadioGroup);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        i=(ImageView)findViewById(R.id.imageView);
        b=(Button)findViewById(R.id.button);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                 if(r1.isChecked()){
                     i.setImageResource(R.drawable.piccle);
                 }
                else if(r2.isChecked()){
                     i.setImageResource(R.drawable.sorce);
                 }
            }
        });

         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                  int pizza = Integer.parseInt(e1.getText().toString());
                  int spaghetti = Integer.parseInt(e2.getText().toString());
                  int salad = Integer.parseInt(e3.getText().toString());

                  double total = ((16000*pizza)+(11000*spaghetti)+(4000*salad));
                 if(c.isChecked())
                     total -= total*0.7;
                 t1.setText("주문개수 :" +(pizza+spaghetti+salad));
                 t2.setText("주문금액 :" +total);
                 if(r1.isChecked()){
                     t3.setText("피클입니다.");
                 }
                 else if(r2.isChecked()){
                     t3.setText("소스입니다.");
                 }
             }
         });
    }
}
