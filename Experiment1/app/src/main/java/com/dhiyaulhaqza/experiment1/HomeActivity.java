package com.dhiyaulhaqza.experiment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        LayoutInflater inflater = getLayoutInflater();
//        inflater.inflate(R.layout.layout_tambahan, (ViewGroup) findViewById(R.id.llhome));
//        LayoutInflater inflater1 = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//        inflater1.inflate(R.layout.layout_tambahan, (ViewGroup) findViewById(R.id.llhome));

        LinearLayout layout = (LinearLayout) findViewById(R.id.llhome);
        View view = inflater.inflate(R.layout.layout_tambahan, (LinearLayout) findViewById(R.id.llhome), false);
        layout.addView(view);
    }
}
