package com.stod.money;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button buttonConvertir = findViewById(R.id.buttonConvertir);
        final Button buttonfinish = findViewById(R.id.buttonfinish);
        final Button buttonAbout = findViewById(R.id.buttonAbout);
        final ImageView uiView = findViewById(R.id.imageView);
        final Button buttonrecycler = findViewById(R.id.buttonrecycler);

        String curency = getCurrency();

        switch (curency) {

            case  "dollar" :
                uiView.setImageResource(R.drawable.us_flag);
                break;
            case "yen" :
                uiView.setImageResource(R.drawable.japan_flag);
                break;
            case "pounds":
                uiView.setImageResource(R.drawable.uk_flag);
                break;
        }


        buttonfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                Log.i("MainActivity", "Click");

                final EditText editTextMontant = findViewById(R.id.editTextMontant);
                final TextView textViewConverti  = findViewById(R.id.textViewConverti);

                String retourAccueil = "Dernière conversion" + editTextMontant.getText().toString() + " -> " + textViewConverti.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("result", retourAccueil);
                setResult(Activity.RESULT_OK, intent);
                finish();

            }

        });

        buttonConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                Log.i("MainActivity", "Click");

                final EditText editTextMontant = findViewById(R.id.editTextMontant);
                final TextView textViewConverti  = findViewById(R.id.textViewConverti);
                String curency = getCurrency();

                switch (curency) {

                    case  "dollar" :
                        textViewConverti.setText(convertInDollar(getStringOfEditText(editTextMontant)).toString() + " $");
                        break;
                    case "yen" :
                        textViewConverti.setText(convertInYen(getStringOfEditText(editTextMontant)).toString() + " ¥");
                        break;
                    case "pounds":
                        textViewConverti.setText(convertInPounds(getStringOfEditText(editTextMontant)).toString() + " £");
                        break;
                    default:
                        textViewConverti.setText("");                }

                }

        });

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View V) {
                Intent intent = new Intent(MainActivity.this, About.class);
                Log.i("About", "Click");
                intent.putExtra("name", "bob");
                intent.putExtra("age", 22);
                intent.putExtra("email", "blabla@bla.com");

                User user = new User("Alice", 22, "bla@bla.com");
                intent.putExtra("user", user);
                startActivity(intent);


            }
        });

    }

    public String getCurrency()

    {
        Intent intent = getIntent();
        String currency = intent.getStringExtra("currency");

        return currency;
    }

    public String getStringOfEditText(EditText txtV) {
        String saisieUtilisateur = txtV.getText().toString();
                return saisieUtilisateur;
    }

    public Double convertInDollar(String myString) {
        double intSaisi = Float.parseFloat(myString);
        double coef = 1.08;
        double montantConverti = intSaisi * coef;
        return montantConverti;

    }

    public Double convertInYen(String myString) {
        double intSaisi = Float.parseFloat(myString);
        double coef = 119.11;
        double montantConverti = intSaisi * coef;
        return montantConverti;

    }

    public Double convertInPounds(String myString) {
        double intSaisi = Float.parseFloat(myString);
        double coef = 0.83;
        double montantConverti = intSaisi * coef;
        return montantConverti;

    }
}
