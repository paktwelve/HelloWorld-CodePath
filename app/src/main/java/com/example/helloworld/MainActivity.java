package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        //User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.brwn));
            }
        });

        // User can tap a button to change the color of the background view
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // # #cfb2ea - lightpurpl
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightblez));
            }
        });

        //User can tap button to change the text  string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Reset the text to "Hello from Morris!" id - @id/text
                textView.setText("Hello from Morris");

                // 2. Reset the color of the text to original color
                // original text color - brwn, text id - @idt/text
                textView.setTextColor(getResources().getColor(R.color.black));

                //3. Reset the background color
                // original background color - R.color.lightpurpl
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightpurpl));
            }
        });

        // User can tap the "Change text string" button to update the label with the text from the field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change the text view tot what's in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // If the text field is empty , update label with default text string.
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}