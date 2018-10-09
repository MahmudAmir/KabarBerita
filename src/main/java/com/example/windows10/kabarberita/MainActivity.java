package com.example.windows10.kabarberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, BeritaSatu.class);
        startActivity(intent);
    }
    public void sendMessag(View view) {
        Intent intent = new Intent(this, BeritaDua.class);
        startActivity(intent);
    }
    public void sendMessa(View view) {
        Intent intent = new Intent(this, BeritaTiga.class);
        startActivity(intent);
    }
}
