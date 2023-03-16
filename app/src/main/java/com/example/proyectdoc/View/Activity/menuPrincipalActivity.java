package com.example.proyectdoc.View.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectdoc.DTO.DocumentDTO;
import com.example.proyectdoc.DTO.UserDataDTO;
import com.example.proyectdoc.Manager.Impl.ServiceManagerImpl;
import com.example.proyectdoc.Manager.ServiceManager;
import com.example.proyectdoc.R;
import com.example.proyectdoc.View.Design.DocItem;

public class menuPrincipalActivity extends AppCompatActivity {

    private TextView cedula, nombre;
    private LinearLayout listDocs;
    private ImageView foto;
    private Button addDoc, sharedDoc;
    private ServiceManager manager;
    private UserDataDTO user;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_menu_layout);

        manager = new ServiceManagerImpl();
        user = manager.obtenerDatosUsuario(getIntent().getExtras().getString("usuario"));

        cedula = findViewById(R.id.cedula);
        nombre = findViewById(R.id.name);
        listDocs = findViewById(R.id.list_docs);
        addDoc = findViewById(R.id.add_doc);
        sharedDoc = findViewById(R.id.shared_doc);
        foto = findViewById(R.id.foto);

        setWidgets();

        //
        DocumentDTO doc1 = new DocumentDTO();
        doc1.setDocumentName("Cedula");
        DocItem cedula = new DocItem(getLayoutInflater(), listDocs, this, doc1);
        DocumentDTO doc2 = new DocumentDTO();
        doc2.setDocumentName("Hoja de Vida");
        DocItem cv = new DocItem(getLayoutInflater(), listDocs, this, doc2);
        listDocs.addView(cedula.getView());
        listDocs.addView(cv.getView());
        DocumentDTO doc3 = new DocumentDTO();
        doc3.setDocumentName("Carnet de Salud");
        DocItem salud = new DocItem(getLayoutInflater(), listDocs, this, doc3);
        DocumentDTO doc4 = new DocumentDTO();
        doc4.setDocumentName("Antecedentes Judiciales");
        DocItem antJud = new DocItem(getLayoutInflater(), listDocs, this, doc2);
        listDocs.addView(salud.getView());
        listDocs.addView(antJud.getView());
        //

        addDoc.setOnClickListener(v -> {
            Intent intent = new Intent(this, addDocsActivity.class);
            startActivity(intent);
        });

        sharedDoc.setOnClickListener(z -> {
            Intent intent = new Intent(this, sharedDocsActivity.class);
            startActivity(intent);
        });

        foto.setOnClickListener(w -> {
            Intent intent = new Intent(this, perfilActivity.class);
            startActivity(intent);
        });
    }

    public void setWidgets(){
        nombre.setText(user.getNombre());
        cedula.setText("C.C " + user.getCedula());
    }

    public void setDocuments(){

    }

}
