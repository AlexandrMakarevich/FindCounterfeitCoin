package com;

import com.google.common.base.Objects;

public class Coin {

    private int weightCoin;
    private int id;

    public Coin(int id, int weightCoin) {
        this.id = id;
        this.weightCoin = weightCoin;
    }

    public int getWeightCoin() {
        return weightCoin;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "weightCoin=" + weightCoin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return weightCoin == coin.weightCoin;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weightCoin);
    }
}
