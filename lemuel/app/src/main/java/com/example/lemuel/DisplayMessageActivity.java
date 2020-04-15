package com.example.lemuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String usn = intent.getStringExtra(MainActivity.EXTRA_USN);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.textView6);
        TextView textView2 = findViewById(R.id.textView7);
        textView1.setText(name);
        textView2.setText(usn);
    }
}
