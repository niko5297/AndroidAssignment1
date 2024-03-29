package com.example.hovedmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button knap1;
    Button knap2;
    Button søg, søg2;
    ImageView billede;
    TextView overskrift;
    TextView tekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        knap1 = findViewById(R.id.indstillinger);
        knap2 = findViewById(R.id.vejledning);
        billede = findViewById(R.id.billede);
        overskrift = findViewById(R.id.overskrift);
        tekst = findViewById(R.id.tekst);
        billede.setImageResource(R.drawable.icon);
        søg = findViewById(R.id.søg);
        søg2 = findViewById(R.id.søg2);

        knap1.setOnClickListener(this);
        knap2.setOnClickListener(this);
        søg.setOnClickListener(this);
        søg2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == knap1){
            tekst.setText("Indstillinger");


        }
        if (view == knap2){
            tekst.setText("Vejledning");


        }

        if (view == søg){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://javabog.dk"));
            startActivity(intent);


        }

        if (view == søg2){
            Intent i = new Intent(this, WebActivity.class);
            startActivity(i);


        }

    }
}
