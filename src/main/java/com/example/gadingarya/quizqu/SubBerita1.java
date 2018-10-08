package com.example.gadingarya.quizqu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SubBerita1 extends AppCompatActivity {
    public static final String buttonkembali = "buttonkembali";
    public static final String nextpage = "buttonnextpage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_berita1);
    }
    public void kembaliPortal(View view) {
        Intent intent = new Intent(this, PortalBerita.class);
        startActivity(intent);
    }
    public void lembarSelanjutnya(View view) {
        Intent intent = new Intent(this, SubBerita2.class);
        startActivity(intent);
    }
}
