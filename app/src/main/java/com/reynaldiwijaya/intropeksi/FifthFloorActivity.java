package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FifthFloorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_floor);
        ButterKnife.bind(this);
    }

    Intent pindah;

    @OnClick({R.id.btnFinishFifth, R.id.btnNextFifth})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFinishFifth:
                pindah = new Intent(this,PuasActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnNextFifth:
                pindah = new Intent(this,SixthFloorActivity.class);
                startActivity(pindah);
                finish();
                break;
        }
    }
}
