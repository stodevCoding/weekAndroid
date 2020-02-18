package com.stod.money.api;

import com.stod.money.Currency;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ExchangeApi {

    @GET("lastet")
    Call<RatesWrapper> getCurrencies();
}
