package com.example.mathieu.projet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    public static DatabaseReference db = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnGestion= findViewById(R.id.buttonColoc);
        btnGestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_gestion.class);
                startActivity(intent);
            }
        });

        Button btnGestionCorve= findViewById(R.id.buttonCorve);
        btnGestionCorve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_gestionCorve.class);
                startActivity(intent);
            }
        });

        Button btnListeCourse= findViewById(R.id.buttonCourse);
        btnListeCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), activity_listeCourse.class);
                startActivity(intent);
            }
        });
    }
}
