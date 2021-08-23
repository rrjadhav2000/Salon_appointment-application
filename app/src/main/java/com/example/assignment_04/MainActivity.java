package com.example.assignment_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
    }
    public void next(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity2.class));
    }
    /*public void cake(View view){
       Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);
    }*/

}