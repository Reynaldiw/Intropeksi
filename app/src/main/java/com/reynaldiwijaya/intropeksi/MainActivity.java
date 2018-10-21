package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnStart(View view) {
        Intent pindah = new Intent(this,FirstFloorActivity.class);
        startActivity(pindah);
    }
}

