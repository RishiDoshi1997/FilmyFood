package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class admin extends AppCompatActivity {

    EditText username, password;

    ImageView btnLogin;
    String correct_username = "Admin";
    String correct_password = "Password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 // Validate Inputs
                if(TextUtils.isEmpty(username.getText().toString())||TextUtils.isEmpty(password.getText().toString()))
                {
                    Toast.makeText(admin.this,"Empty Inputs", Toast.LENGTH_LONG).show();
                }else if(username.getText().toString().equals(correct_username)){
                    //check password
                    if(password.getText().toString().equals(correct_password)){
                        Toast.makeText(admin.this,"Admin LoggedIn", Toast.LENGTH_LONG).show();
                        Intent intentLoadadmin = new Intent(admin.this,adminview.class);
                        startActivity(intentLoadadmin);
                    }else{
                        Toast.makeText(admin.this,"Invalid Username/Password", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(admin.this,"Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}