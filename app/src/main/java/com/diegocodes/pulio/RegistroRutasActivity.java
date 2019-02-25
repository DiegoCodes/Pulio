package com.diegocodes.pulio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistroRutasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_rutas);
    }
    public void NextScreen(View v){
        Intent intent = new Intent(this,MenuPrincipalActivity.class);
        startActivity(intent);
    }
}
