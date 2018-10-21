package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondFloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_floor);
        ButterKnife.bind(this);
    }

    Intent pindah;

    @OnClick({R.id.btnFinishSecond, R.id.btnNextSecond})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFinishSecond:
                pindah = new Intent(this, PuasActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnNextSecond:
                pindah = new Intent(this, ThirdFloorActivity.class);
                startActivity(pindah);
                finish();
                break;
        }
    }
}
