package com.stod.money;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {

    private final List<Currency> currencies;

    public CurrencyAdapter(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_currency, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Currency currency = currencies.get(position);

        holder.flag.setImageResource(currency.flagId);
        holder.symbolTextView.setText(currency.symbol);
        holder.rateTextView.setText(currency.rate + "");

    }

    @Override
    public int getItemCount() {

        return currencies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView flag;
        final TextView symbolTextView;
        final TextView rateTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flagImageView);
            symbolTextView = itemView.findViewById(R.id.symbolTextView);
            rateTextView = itemView.findViewById(R.id.rateTextView);

        }
    }
}
