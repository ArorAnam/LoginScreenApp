package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    EditText getConfPassword;
    EditText mTextEmail;
    Button mButtonRegister;
    TextView mTextViewLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mTextUsername = (EditText) findViewById(R.id.editTextUsername);
        mTextPassword = (EditText) findViewById(R.id.editTextPassword);
        getConfPassword = (EditText) findViewById(R.id.editTextRePassword);
        mTextEmail = (EditText) findViewById(R.id.editTextEmail);
        mButtonRegister = (Button) findViewById(R.id.editRegister);
        mTextViewLogin = (TextView) findViewById(R.id.back2login);
        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(LoginIntent);
            }
        });
    }
}
