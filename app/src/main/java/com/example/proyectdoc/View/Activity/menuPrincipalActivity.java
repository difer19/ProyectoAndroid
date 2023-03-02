package com.example.proyectdoc.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectdoc.R;

public class menuPrincipalActivity extends AppCompatActivity {

    private TextView cedula, nombre;
    private LinearLayout listDocs;
    private ImageView foto;
    private Button addDoc;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_menu_layout);

        cedula = findViewById(R.id.cedula);
        nombre = findViewById(R.id.name);
        listDocs = findViewById(R.id.list_docs);
        addDoc = findViewById(R.id.add_doc);
        foto = findViewById(R.id.foto);

        addDoc.setOnClickListener(v -> {
            Intent intent = new Intent(this, addDocsActivity.class);
            startActivity(intent);
        });
    }

}
