package com.example.ordermg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec);
        t=findViewById(R.id.fo);
        String q=getIntent().getExtras().getString("ord");
        t.setText(q);
    }
}