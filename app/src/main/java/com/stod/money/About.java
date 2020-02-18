package com.stod.money;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 0);
        String email = intent.getStringExtra("email");

        User user = intent.getParcelableExtra("user");

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView ageTextView = findViewById(R.id.ageTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);

        nameTextView.setText(user.getName());
        ageTextView.setText(user.getAge()+ "");
        emailTextView.setText(user.getEmail());

    }
}
