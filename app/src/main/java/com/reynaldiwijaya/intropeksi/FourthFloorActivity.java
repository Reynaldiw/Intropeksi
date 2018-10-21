package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FourthFloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_floor);
        ButterKnife.bind(this);
    }

    Intent pindah;

    @OnClick({R.id.btnFinishFourth, R.id.btnNextFourth})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFinishFourth:
                pindah = new Intent(this,PuasActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnNextFourth:
                pindah = new Intent(this,FifthFloorActivity.class);
                startActivity(pindah);
                finish();
                break;
        }
    }
}
