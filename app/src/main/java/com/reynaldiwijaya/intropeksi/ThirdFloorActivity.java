package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThirdFloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_floor);
        ButterKnife.bind(this);
    }

    Intent pindah;

    @OnClick({R.id.btnFinishThird, R.id.btnNextThird})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFinishThird:
                pindah = new Intent(this,PuasActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnNextThird:
                pindah = new Intent(this,FourthFloorActivity.class);
                startActivity(pindah);
                finish();
                break;
        }
    }
}
