package com.example.ppc_tp1_oyola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ChangeTextActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ppc_tp1_oyola.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_text);
        // Get the Intent that started this activity and extract the string

        Intent intent = getIntent();
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
       // String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }
}
