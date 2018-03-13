package com.example.shankar.myapplication;

import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
Button b1;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 =(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
    }
    public void click(View view){

        String t3= t1.getText().toString();


        if(t3.equals("")){
            Toast.makeText(this, "plzz fill", Toast.LENGTH_SHORT).show();
        }
        else {

            t2.setText(t3);



            //Toast.makeText(this, "data saves", Toast.LENGTH_SHORT).show();
        }


    }
}
