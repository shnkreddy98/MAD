package com.example.lemuel;

import androidx.annotation.NonNull;
import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;
import java.util.Map;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.lemuel.NAME";
    public static final String EXTRA_USN = "com.example.lemuel.USN";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editName = (EditText) findViewById(R.id.editText6);
        EditText editUSN = (EditText) findViewById(R.id.editText7);
        String Name = editName.getText().toString();
        String USN = editUSN.getText().toString();

        intent.putExtra(EXTRA_NAME, Name);
        intent.putExtra(EXTRA_USN, USN);
        startActivity(intent);// Do something in response to button
    }

}
