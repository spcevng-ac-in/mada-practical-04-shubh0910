package com.example.practical_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button2OnClick(View view){

        EditText et=(EditText) findViewById(R.id.edit_text1);
        String name=et.getText().toString();

        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("Name",name);
        startActivity(i);
    }

}
