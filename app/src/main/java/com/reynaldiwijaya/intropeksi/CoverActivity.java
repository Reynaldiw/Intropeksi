package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnStartCover)
    public void onViewClicked() {
        Intent pindah = new Intent(this, MainActivity.class);
        startActivity(pindah);
    }
}
