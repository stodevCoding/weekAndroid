package com.stod.money;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_list);

        List<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));

        CurrencyAdapter adapter = new CurrencyAdapter(currencies);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}
