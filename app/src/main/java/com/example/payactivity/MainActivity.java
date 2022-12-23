package com.example.payactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtGmail;
    private EditText edtPassword;
    private EditText edtCreditCard;

    private String gmail;
    private String password;
    private String creditCardNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtGmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtCreditCard = findViewById(R.id.edtCardNum);
    }

    public void btnOnclickPayment(View view) {
        gmail = edtGmail.getText().toString();
        password = edtPassword.getText().toString();
        creditCardNum = edtCreditCard.getText().toString();
        String str= gmail + password + creditCardNum;
        Toast.makeText(this, "The payment operation successful", Toast.LENGTH_SHORT).show();

    }
}