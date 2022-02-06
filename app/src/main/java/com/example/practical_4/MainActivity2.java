package com.example.practical_4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        String name = getIntent().getStringExtra("Name");
        TextView t=(TextView) findViewById(R.id.tv1);
        t.setText(name);
    }
    public void b1OnClick(View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}