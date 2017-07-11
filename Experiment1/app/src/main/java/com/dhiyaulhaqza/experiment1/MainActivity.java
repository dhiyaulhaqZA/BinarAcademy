package com.dhiyaulhaqza.experiment1;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvNama;
    // kelas menampung object-object
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        Button tombol = new Button(this);
        tombol.setText("Tombol");
        relativeLayout.addView(tombol);
        Button click = (Button) findViewById(R.id.btnClick);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tombol diklik", Toast.LENGTH_SHORT).show();
            }
        };

        tombol.setOnClickListener(listener);
        click.setOnClickListener(listener);
//        tvNama = (TextView) findViewById(R.id.tv_text1);
//        ImageView imgGambar = (ImageView) findViewById(R.id.iv_gambar);
//
//        tvNama.setText("Text dari method onCreate()");
//        tampilkanText();
//        imgGambar.setImageDrawable(getResources().getDrawable(R.drawable.ic_gambar));
//        imgGambar.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_gambar));
    }

    //method atau function tambahan
    public void tampilkanText() {
        Log.d("Text", "dari log");
        tvNama.setText("Text dari method tampilkanText()");
    }
}
