package com.example.mathieu.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_gestion extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);

        Button btnBack= findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnGestionMembre= findViewById(R.id.buttonGestionMembre);
        btnGestionMembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_gestionMembres.class);
                startActivity(intent);
            }
        });

        Button btnGestionColoc= findViewById(R.id.buttonGestionColoc);
        btnGestionColoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_gestionColoc.class);
                startActivity(intent);
            }
        });
    }
}
