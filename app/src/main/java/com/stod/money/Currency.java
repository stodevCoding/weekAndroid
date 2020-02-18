package com.stod.money;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;

public class Currency implements Parcelable {
    @DrawableRes
    final int flagId;
    final float rate;
    final String symbol;

    public Currency(int flagId, float rate, String symbol) {
        this.flagId = flagId;
        this.rate = rate;
        this.symbol = symbol;
    }

    protected Currency(Parcel in) {
        flagId = in.readInt();
        rate = in.readFloat();
        symbol = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(flagId);
        dest.writeFloat(rate);
        dest.writeString(symbol);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Currency> CREATOR = new Creator<Currency>() {
        @Override
        public Currency createFromParcel(Parcel in) {
            return new Currency(in);
        }

        @Override
        public Currency[] newArray(int size) {
            return new Currency[size];
        }
    };
}
