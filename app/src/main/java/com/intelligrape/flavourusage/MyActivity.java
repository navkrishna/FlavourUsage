package com.intelligrape.flavourusage;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        TextView tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvInfo.setText("Build Flavour: " + Consts.type);
    }

}
