package com.example.imm.citi.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.imm.citi.R;
import com.example.imm.citi.technicalClasses.Registration;

public class RegistrationActivity extends SuperRegRes {

    Toolbar t;
    Registration reg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("Sign Up");

        t = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(t);

        btnSignup = (Button) findViewById(R.id.btnRegSubmit);
        btnSignup.setOnClickListener(clickListener);

        btnClear = (Button) findViewById(R.id.btnRegClear);
        btnClear.setOnClickListener(clickListener);

        edtEmail = (EditText) findViewById(R.id.textEmailAddress);
        edtPwd1 = (EditText) findViewById(R.id.eTxtPwd1);
        edtPwd2 = (EditText) findViewById(R.id.eTxtPwd2);
    }


    private View.OnClickListener clickListener = new View.OnClickListener() {


        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.btnRegSubmit:
                    if(credentialsCorrect()) {
                        reg = new Registration(edtEmail.getText().toString(), edtPwd1.getText().toString(),regRes);
                        reg.verifyRegistrationInput();
                    }
                    break;
                case R.id.btnRegClear:
                    edtEmail.setText("");
                    edtPwd1.setText("");
                    edtPwd2.setText("");
            }
        }
    };
}
