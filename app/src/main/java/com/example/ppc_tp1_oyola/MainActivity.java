package com.example.ppc_tp1_oyola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, ChangeTextActivity.class);
        startActivity(intent);
        Intent intento = getIntent();
        String message = intento.getStringExtra(ChangeTextActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);
    }

}
