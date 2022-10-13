package com.example.ordermg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.it1);
        c2=findViewById(R.id.it2);
        c3=findViewById(R.id.it3);
        c4=findViewById(R.id.it4);
        c5=findViewById(R.id.it5);
        c6=findViewById(R.id.it6);
        c7=findViewById(R.id.it7);
        c8=findViewById(R.id.it8);
        c9=findViewById(R.id.it9);
        c10=findViewById(R.id.it10);
        b=findViewById(R.id.o);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder s=new StringBuilder();
                int amt=0;

                if(c1.isChecked())
                {
                    s.append("ToothBrush : 50\n\n");
                    amt+=50;
                }

                if(c2.isChecked())
                {
                    s.append("ToothPaste : 60\n\n");
                    amt+=60;
                }

                if(c3.isChecked())
                {
                    s.append("Soap : 30\n\n");
                    amt+=30;
                }

                if(c4.isChecked())
                {
                    s.append("Cold Drink : 20\n\n");
                    amt+=20;
                }

                if(c5.isChecked())
                {
                    s.append("Burger : 40\n\n");
                    amt+=40;
                }

                if(c6.isChecked())
                {
                    s.append("Pizza : 100\n\n");
                    amt+=100;
                }
                if(c7.isChecked())
                {
                    s.append("Hair Clip : 10\n\n");
                    amt+=10;
                }
                if(c8.isChecked())
                {
                    s.append("Cake : 120\n\n");
                    amt+=120;
                }
                if(c9.isChecked())
                {
                    s.append("Perfume : 200\n\n");
                    amt+=200;
                }
                if(c10.isChecked())
                {
                    s.append("Shaving Cream : 250\n\n");
                    amt+=250;
                }

                Toast.makeText(MainActivity.this, "Amount spent:"+amt, Toast.LENGTH_LONG).show();
                String z=s.toString();

                Intent i=new Intent(getApplicationContext(),SecActivity.class);
                i.putExtra("ord",z);
                startActivity(i);
            }
        });

    }
}