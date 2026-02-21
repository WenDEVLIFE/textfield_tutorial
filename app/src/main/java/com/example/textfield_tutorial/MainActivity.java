package com.example.textfield_tutorial;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText usernameField, passwordField;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usernameField = findViewById(R.id.editTextText2);
        passwordField = findViewById(R.id.editTextTextPassword2);

        button  = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            String username = usernameField.getText().toString();
            String password = passwordField.getText().toString();

            if (username.isEmpty() || password.isEmpty()){
                Toast.makeText(MainActivity.this, "Please fill in all the blanks", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Login successful, Welcome User " + username + "Your Password is " + password , Toast.LENGTH_SHORT).show();
            }

        });
    }
}