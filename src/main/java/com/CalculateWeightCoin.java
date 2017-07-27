package com;

public class CalculateWeightCoin {

    public int findOneFakeCoinOfTwo(Coin firstCoin, Coin secondCoin) {
        if (firstCoin.getWeightCoin() > secondCoin.getWeightCoin()) {
            return secondCoin.getId();
        }
        if (firstCoin.getWeightCoin() < secondCoin.getWeightCoin()) {
            return firstCoin.getId();
        } else {
            throw new IllegalArgumentException("All coins is equal!");
        }
    }

    public int findOneFakeCoinOfThree(Coin firstCoin, Coin secondCoin, Coin thirdCoin) {
        if (firstCoin.getWeightCoin() > secondCoin.getWeightCoin()) {
            return secondCoin.getId();
        }
        if (firstCoin.getWeightCoin() < secondCoin.getWeightCoin()) {
            return firstCoin.getId();
        } else {
            return thirdCoin.getId();
        }
    }

    public int countWeightCoins(Coin... coins) {
        int countWeight = 0;
        for (Coin coin : coins) {
            countWeight += coin.getWeightCoin();
        }
        return countWeight;
    }
}
