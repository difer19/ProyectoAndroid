package com.example.proyectdoc.View.Design;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.proyectdoc.DTO.DocumentDTO;
import com.example.proyectdoc.R;
import com.example.proyectdoc.View.Activity.addDocsActivity;
import com.example.proyectdoc.View.Activity.editDocActivity;

public class DocItem {
    private View view;
    private TextView nomDoc;
    private Button edit, delete;

    public DocItem(LayoutInflater inflater, LinearLayout list, Context context, DocumentDTO document){
        view = inflater.inflate(R.layout.item_doc_menu, list, false);

        nomDoc = view.findViewById(R.id.nom_doc);
        edit = view.findViewById(R.id.button2);
        delete = view.findViewById(R.id.button3);

        nomDoc.setText(document.getDocumentName());

        edit.setOnClickListener(v -> {
            Intent intent = new Intent(context, editDocActivity.class);
            context.startActivity(intent);
        });
    }

    public View getView(){
        return view;
    }

}
