package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText edtName;
    private EditText edtPass;

    public  void login(View view){
        Log.i("Login", "Login start");
        Log.d("Username", edtName.getText().toString());
        Log.d("Password", edtPass.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        edtName = findViewById(R.id.edtName);
        edtPass = findViewById(R.id.edtPass);

//    public void login(View view) {
//        EditText usernameEditText = findViewById((R.id.usernameEditText));
//        EditText passwordEditText = findViewById((R.id.passwordEditText));
//        Log.i("Info", "Login starting");
//        Log.i("Username", usernameEditText.getText().toString());
//        Log.i("Password", passwordEditText.getText().toString());
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
   }
}