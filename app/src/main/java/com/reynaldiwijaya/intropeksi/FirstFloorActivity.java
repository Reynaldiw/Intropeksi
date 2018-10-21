package com.reynaldiwijaya.intropeksi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FirstFloorActivity extends AppCompatActivity {

    @BindView(R.id.btnFinishFirst)
    Button btnFinishFirst;
    @BindView(R.id.btnNextFirst)
    Button btnNextFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_floor);
        ButterKnife.bind(this);


    }

    Intent pindah;

    @OnClick({R.id.btnFinishFirst, R.id.btnNextFirst})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnFinishFirst:
                pindah = new Intent(this, PuasActivity.class);
                startActivity(pindah);
                break;
            case R.id.btnNextFirst:
                pindah = new Intent(this, SecondFloorActivity.class);
                startActivity(pindah);
                finish();
                break;
        }
    }
}
