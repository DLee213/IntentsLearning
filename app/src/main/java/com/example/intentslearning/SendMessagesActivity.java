package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessagesActivity extends AppCompatActivity {

    private Button buttonSendMessage;
    private EditText editTextMessage;

    public static final String EXTRA_SENT_MESSAGE = "themessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_messages);

        wireWidgets();

        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the text from the edittext
                String message = editTextMessage.getText().toString();
                // create an intent
                Intent intentSendMessage = new Intent(SendMessagesActivity.this, RecieveMessageActivity.class);
                // package the text into the intent
                intentSendMessage.putExtra("EXTRA_SENT_MESSAGE", message);
                // start the new activity
                startActivity(intentSendMessage);
            }
        });
    }

    private void wireWidgets() {
        buttonSendMessage = findViewById(R.id.button_sendmessage_send);
        editTextMessage = findViewById(R.id.edittext_sendmessage_msg);
    }































}
