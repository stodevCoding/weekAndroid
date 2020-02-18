package com.stod.money;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.stod.money.api.ExchangeApi;
import com.stod.money.api.RatesData;
import com.stod.money.api.RatesWrapper;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyListActivity extends AppCompatActivity {

    private List<Currency> currencies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_list);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.exchangeratesapi.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ExchangeApi api = retrofit.create(ExchangeApi.class);

        Call<RatesWrapper> call = api.getCurrencies();
        call.enqueue(new Callback<RatesWrapper>() {
            @Override
            public void onResponse(Call<RatesWrapper> call, Response<RatesWrapper> response) {
                RatesData body = response.body().rates;
                Log.i("CurrencyListActivity", ""+ body);

                currencies.add(new Currency(R.drawable.us_flag, body.USD, "$"));
            }

            @Override
            public void onFailure(Call<RatesWrapper> call, Throwable t) {
                Log.e("CurrencyListActivity", "", t);

            }
        });


        List<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency(R.drawable.japan_flag, 118.59f,"Y"));
        currencies.add(new Currency(R.drawable.uk_flag, 0.83f,"£"));
        currencies.add(new Currency(R.drawable.us_flag, 1.08f,"$"));
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
