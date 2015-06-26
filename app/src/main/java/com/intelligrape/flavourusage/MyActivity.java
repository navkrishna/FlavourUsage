package com.intelligrape.flavourusage;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        TextView tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvInfo.setText("Build Flavour: " + Consts.type);
        tvInfo.append("\nurl: " + Consts.url);
    }

}
