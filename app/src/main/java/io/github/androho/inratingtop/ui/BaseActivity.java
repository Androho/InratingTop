package io.github.androho.inratingtop.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import io.github.androho.inratingtop.R;

public class BaseActivity extends AppCompatActivity {
    public Toolbar mActionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActionBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mActionBar);
    }
}
