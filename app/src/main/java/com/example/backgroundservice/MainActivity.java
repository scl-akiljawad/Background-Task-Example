package com.example.backgroundservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextInput = findViewById(R.id.inputText);
    }

    public void startService(View view){
        String input = editTextInput.getText().toString();

        Intent serviceIntent = new Intent(this,AppService.class);
        serviceIntent.putExtra("inputExtra",input);

        startService(serviceIntent);
    }

    public void stopService(View view){
        Intent serviceIntent = new Intent(this,AppService.class);
        stopService(serviceIntent);
    }
}
