package com.example.mathieu.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_listeCourse extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listecourse);

        Button btnBack= findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnAjoutArticle= findViewById(R.id.buttonAjoutArticle);
        btnAjoutArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_ajoutArticle.class);
                startActivity(intent);
            }
        });

        Button btnVoirListe= findViewById(R.id.buttonVoirListeCourse);
        btnVoirListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_voirListe.class);
                startActivity(intent);
            }
        });
    }
}
