package com.example.proyectdoc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.proyectdoc.View.Activity.menuPrincipalActivity;

public class mainActivity extends AppCompatActivity {

    private TextView idUserTV, passwordTV;
    private Button login, register;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        idUserTV = findViewById(R.id.user_name);
        passwordTV = findViewById(R.id.password);
        login = findViewById(R.id.login_button);
        register = findViewById(R.id.register_button);

        login.setOnClickListener(v -> {
            if (!idUserTV.getText().toString().isEmpty() && !passwordTV.getText().toString().isEmpty()){
                if(autentificacion(idUserTV.getText().toString(), passwordTV.getText().toString())){
                    Intent intent = new Intent(this, menuPrincipalActivity.class);
                    startActivity(intent);
                }else{

                }
            }
        });

        register.setOnClickListener(x -> {
            Uri uri = Uri.parse("https://candid-mousse-d87cec.netlify.app/");
            Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent2);
        });

    }

    public boolean autentificacion(String idUser, String password){
        return true;
    }
}
