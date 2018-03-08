package com.example.mathieu.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class activity_ajoutArticle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutarticle);

        Button btnBack= findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_listeCourse.class);
                startActivity(intent);
            }
        });

        Button btnAjoutArticleValider= findViewById(R.id.buttonAjoutArticleValider);
        btnAjoutArticleValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView message = findViewById(R.id.editTextNomArticle);
                String nomArticle = message.getText().toString();

                TextView messageq = findViewById(R.id.editTextQuantiteArticle);
                int qArticle = Integer.parseInt(messageq.getText().toString());

                Map<String, Article> art = new HashMap<>();
                art.put("article", new Article(nomArticle,qArticle));
                
                //MainActivity.db.child("Coloc").setValue(art);

               // Toast.makeText(v.getContext(),"L'article a bien été ajouté",Toast.LENGTH_SHORT).show();

                /*Intent intent = new Intent(v.getContext(), activity_listeCourse.class);
                startActivity(intent);*/
            }
        });

    }
}
