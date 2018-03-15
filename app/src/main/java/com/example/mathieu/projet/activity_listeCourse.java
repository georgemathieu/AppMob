package com.example.mathieu.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;


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

        Button btnViderListe= findViewById(R.id.buttonFaireCourse);
        btnViderListe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference ref = MainActivity.db.getReference("Coloc").child("Article");
                ref.removeValue();
                Toast.makeText(v.getContext(),"La liste de course a été vidée",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
