package com.example.assignment_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

  //  @Override
    EditText ed1,ed2,ed4;
   // TextView txt1,txt2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1=(EditText) findViewById(R.id.txt);
        ed2=(EditText) findViewById(R.id.phn);

        ed4=(EditText) findViewById(R.id.date);
      // txt1.getText();
        String inp=String.valueOf(ed1.getText());
        ed1.setText(inp);
        String inp1=String.valueOf(ed2.getText());
        ed2.setText(inp1);
        //String inp2=String.valueOf(ed3.getText());
        //ed3.setText(inp);
        String inp3=String.valueOf(ed4.getText());
        ed4.setText(inp3);
        //txt1.setText(txt1.getText());
    }
    public void book(View view){
        Toast t;
        t=Toast.makeText(this,"Your appointment is booked",Toast.LENGTH_SHORT);
        t.show();
        startActivity(new Intent(getApplicationContext(),MainActivity3.class));
    }
}