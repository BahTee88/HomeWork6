package com.example.homework_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvWelcome, tvEnter, tvRegister, tvForget, tvClick;
    private EditText edEmail, edPassword;
    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvWelcome = findViewById(R.id.U_wel);
        tvEnter = findViewById(R.id.tv_enter);
        tvRegister = findViewById(R.id.tv_register);
        tvForget = findViewById(R.id.tv_forget);
        tvClick = findViewById(R.id.tv_click);
        edEmail = findViewById(R.id.ed_email);
        edPassword = findViewById(R.id.ed_password);
        btnEnter = findViewById(R.id.btn_enter);

        edPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edPassword.getText().toString().isEmpty()) {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edEmail.getText().toString().isEmpty()) {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    btnEnter.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edEmail.getText().toString().equals("admin") && edPassword.getText().toString().equals("password")) {
                    edEmail.setVisibility(View.GONE);
                    edPassword.setVisibility(View.GONE);
                    tvEnter.setVisibility(View.GONE);
                    tvRegister.setVisibility(View.GONE);
                    tvClick.setVisibility(View.GONE);
                    btnEnter.setVisibility(View.GONE);
                    tvForget.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}