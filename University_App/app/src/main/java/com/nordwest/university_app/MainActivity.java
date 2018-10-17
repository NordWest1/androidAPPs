 package com.nordwest.university_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    Button _btn_login, _btn_register;
    EditText _Email, _Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _btn_register = findViewById(R.id.btn_registration);
        _btn_login = findViewById(R.id.btn_login);


        _btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.no_access), Toast.LENGTH_LONG).show();
            }
        });

        _btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_register);
            }
        });
    }

//     public void onClick(View view) {
//        setContentView(R.layout.activity_register);
//         Toast.makeText(this, "Registration selected", Toast.LENGTH_LONG).show();
//     }


 }
