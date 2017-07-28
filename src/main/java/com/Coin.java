package com;

import com.google.common.base.Objects;

public class Coin {

    private int weightCoin;

    public Coin(int weightCoin) {
        this.weightCoin = weightCoin;
    }

    public int getWeightCoin() {
        return weightCoin;
    }

    public Coin findOneFakeCoinOfThree(Coin firstCoin, Coin secondCoin, Coin third) {
        int firstCoinWeight = firstCoin.getWeightCoin();
        int secondCoinWeight = secondCoin.getWeightCoin();
        if (firstCoinWeight > secondCoinWeight) {
            return secondCoin;
        }
        if (firstCoinWeight < secondCoinWeight) {
            return firstCoin;
        }
        return third;
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
