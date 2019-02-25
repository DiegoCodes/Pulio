package com.diegocodes.pulio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);
    }

    public void P1(View view) {
        openPopup("Disponibilidad de Auto");
    }
      public void P2(View view) {
        openPopup("Lugares de Salida");
    }
      public void P3(View view) {
        openPopup("Lugares de Llegada");
    }
      public void P4(View view) {
        openPopup("Horario de Trabajo");
    }

    public void openPopup(String title){
        popup_detalle p = new popup_detalle();
        p.setTitle(title);
        p.show(getSupportFragmentManager(),"hello");
    }
    public void NextScreen(View v){
        Intent intent = new Intent(this,RegistroRutasActivity.class);
        startActivity(intent);
    }
}
