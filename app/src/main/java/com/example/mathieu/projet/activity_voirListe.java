package com.example.mathieu.projet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;

public class activity_voirListe extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voirliste);

        Button btnBack= findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_listeCourse.class);
                startActivity(intent);
            }
        });

        final TextView liste = findViewById(R.id.textViewAffichageListe);
        DatabaseReference ref = MainActivity.db.getReference("Coloc").child("Article");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String res = "";
                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    res += child.getKey().toString() + " " + child.getValue()+"\n";
                }
                liste.setText(res);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //liste.setText(res);
    }

}
