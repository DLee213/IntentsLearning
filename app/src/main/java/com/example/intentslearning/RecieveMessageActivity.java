package com.example.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {

    private TextView textViewDisplayMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);

        textViewDisplayMessage = findViewById(R.id.textview_receivemessage_displaymsg);
        textViewDisplayMessage.setText(getIntent().getStringExtra(SendMessagesActivity.EXTRA_SENT_MESSAGE));
    }
}
