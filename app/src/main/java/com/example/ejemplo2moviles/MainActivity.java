package com.example.ejemplo2moviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button1);
        myTextView = findViewById(R.id.txtview1);

        myTextView.setText("Este es el ejemplo 2 que rayos");

        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               // myTextView.setText("Ai");
                Intent myIntent = new Intent(MainActivity.this, ChildActivity.class);
                startActivity(myIntent);
            }

        });
    }
}