package com.reynaldiwijaya.intropeksi;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PuasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puas);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnFinishPuas)
    public void onViewClicked() {
        this.finishAffinity();
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}

