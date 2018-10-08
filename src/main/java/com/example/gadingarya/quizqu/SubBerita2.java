package com.example.gadingarya.quizqu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubBerita2 extends AppCompatActivity {
    public static final String buttonkembali2 = "buttonkembali2";
    public static final String nextpage2 = "buttonnextpage2";
    public static final String previouspage2 = "buttonpreviouspage2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_berita2);
    }
    public void kembaliPortal2(View view) {
        Intent intent = new Intent(this, PortalBerita.class);
        startActivity(intent);
    }
    public void lembarSelanjutnya2(View view) {
        Intent intent = new Intent(this, SubBerita3.class);
        startActivity(intent);
    }
    public void lembarSebelumnya2(View view) {
        Intent intent = new Intent(this, SubBerita1.class);
        startActivity(intent);
    }
}
