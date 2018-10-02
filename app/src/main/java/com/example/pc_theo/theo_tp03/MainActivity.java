package com.example.pc_theo.theo_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String message = "Bonjour IF26";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText("Message modifié dans le code Java");

        String message = "Hello if26";
        tx.setText(message);

        Button bt = (Button) findViewById(R.id.bouton);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            } });
    }
}
