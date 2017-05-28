package com.example.alexa.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final EditText simpleEditText = (EditText) findViewById(R.id.editText);
        simpleEditText.setHint("Enter Your Password Here");//display the hint

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Password password = new Password(simpleEditText.getText().toString());
                textView.setVisibility(View.VISIBLE);
                if (password.isValid()) {
                    textView.setText(R.string.goodPassword);
                } else {
                    textView.setText(R.string.notSoGoodPassword);
                }
            }
        });

    }
}
