package com.example.gamefirst;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class firstpa extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpas);
        Button firstbutton = (Button) findViewById(R.id.firstbutton);
        firstbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        firstbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(firstpa.this , MainActivity.class);
                startActivity(i);
            }
        });
    }
}
