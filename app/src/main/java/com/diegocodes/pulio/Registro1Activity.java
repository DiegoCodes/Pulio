package com.diegocodes.pulio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registro1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro1);
    }
    public void NextScreen(View v){
        Intent intent = new Intent(this,Registro2Activity.class);
        startActivity(intent);
    }
}
