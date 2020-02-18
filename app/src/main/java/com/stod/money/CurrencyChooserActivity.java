package com.stod.money;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CurrencyChooserActivity extends AppCompatActivity {

    private static final int REQUEST_A = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_chooser);

        final Button dollar_button = findViewById(R.id.button_dollar);
        final Button yen_button = findViewById(R.id.yen_button);
        final Button pounds_button = findViewById(R.id.pounds_button);



        dollar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                Log.i("CurrencyChooserActivity", "Click");

                Intent intent = new Intent(CurrencyChooserActivity.this, MainActivity.class);

                intent.putExtra("currency", "dollar");
                startActivityForResult(intent, REQUEST_A);

            }
        });

        yen_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                Log.i("CurrencyChooserActivity", "Click");

                Intent intent = new Intent(CurrencyChooserActivity.this, MainActivity.class);
                intent.putExtra("currency", "yen");

                startActivityForResult(intent, REQUEST_A);
            }
        });

        pounds_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                Log.i("CurrencyChooserActivity", "Click");

                Intent intent = new Intent(CurrencyChooserActivity.this, MainActivity.class);
                intent.putExtra("currency", "pounds");

                startActivityForResult(intent, REQUEST_A);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_A) {
            if (resultCode == Activity.RESULT_OK) {
                TextView lastConversion = findViewById(R.id.lastConversion);
                lastConversion.setText(data.getStringExtra("result"));
            }
        }
    }
}
