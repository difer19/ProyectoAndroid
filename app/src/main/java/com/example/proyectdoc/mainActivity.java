package com.example.proyectdoc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.proyectdoc.Manager.Impl.ServiceManagerImpl;
import com.example.proyectdoc.Manager.ServiceManager;
import com.example.proyectdoc.View.Activity.menuPrincipalActivity;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class mainActivity extends AppCompatActivity {

    private TextView idUserTV, passwordTV;
    private Button login, register;
    private ServiceManager manager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        manager = new ServiceManagerImpl();

        idUserTV = findViewById(R.id.user_name);
        passwordTV = findViewById(R.id.password);
        login = findViewById(R.id.login_button);
        register = findViewById(R.id.register_button);

        login.setOnClickListener(v -> {
            if (!idUserTV.getText().toString().isEmpty() && !passwordTV.getText().toString().isEmpty()){
                if(autentificacion(idUserTV.getText().toString(), passwordTV.getText().toString()) == 1){
                    Intent intent = new Intent(this, menuPrincipalActivity.class);
                    intent.putExtra("usuario", idUserTV.getText().toString());
                    startActivity(intent);
                }else if (autentificacion(idUserTV.getText().toString(), passwordTV.getText().toString()) == 2){
                    mostrarErrorPasswordIncorrecta();
                }else{
                    mostrarErrorUsuarioNoExiste();
                }
            }
        });

        register.setOnClickListener(x -> {
            Uri uri = Uri.parse("https://candid-mousse-d87cec.netlify.app/");
            Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent2);
        });

    }

    public int autentificacion(String idUser, String password){
        return manager.autentificacion(idUser, password);
    }

    public void mostrarErrorPasswordIncorrecta(){
        new SweetAlertDialog(mainActivity.this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error")
                .setContentText("Contraseña incorrecta")
                .show();
    }

    public void mostrarErrorUsuarioNoExiste(){
        new SweetAlertDialog(mainActivity.this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error")
                .setContentText("El usuario no existe")
                .show();
    }
}
