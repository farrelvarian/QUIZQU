package com.example.gadingarya.quizqu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubBerita3 extends AppCompatActivity {
    public static final String buttonkembali3 = "buttonkembali3";
    public static final String previouspage3 = "buttonpreviouspage3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_berita3);
    }
    public void kembaliPortal3(View view) {
        Intent intent = new Intent(this, PortalBerita.class);
        startActivity(intent);
    }
    public void lembarSebelumnya3(View view) {
        Intent intent = new Intent(this, SubBerita2.class);
        startActivity(intent);
    }
}
