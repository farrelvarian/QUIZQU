package com.example.gadingarya.quizqu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PortalBerita extends AppCompatActivity {

    public static final String button1 = "sendBerita";
    public static final String button2 = "sendBerita2";
    public static final String button3 = "sendBerita3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal_berita);
    }

    /** Called when the user taps the Send button */
    public void sendBerita(View view) {
        Intent intent = new Intent(this, SubBerita1.class);
        startActivity(intent);
    }
    public void sendBerita2(View view) {
        Intent intent = new Intent(this, SubBerita2.class);
        startActivity(intent);
    }
    public void sendBerita3(View view) {
        Intent intent = new Intent(this, SubBerita3.class);
        startActivity(intent);
    }
}
