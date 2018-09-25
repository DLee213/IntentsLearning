package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessagesActivity extends AppCompatActivity {

    private Button buttonSendMessage;
    private Button buttonShare;
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
        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // make an intent with the desired action
                Intent intentShare = new Intent(Intent.ACTION_SEND);
                //set the data type of the stuff we're packaging away
                intentShare.setType("text/plain");
                // put the extra with the message
                intentShare.putExtra(EXTRA_SENT_MESSAGE, editTextMessage.getText().toString());
                //launch the activity
                startActivity(intentShare);
            }
        });
    }

    private void wireWidgets() {
        buttonSendMessage = findViewById(R.id.button_sendmessage_send);
        editTextMessage = findViewById(R.id.edittext_sendmessage_msg);
        buttonShare = findViewById(R.id.buttton_sendmessage_sharebutton);
    }































}
