package com;

import com.google.common.base.Optional;
import java.util.List;

public class CalculateWeightCoin {

    public static final int ALLOWABLE_NUMBER_OF_COINS = 8;

    public Optional<Coin> getFakeCoin(List<Coin> coins) {
        validate(coins);
        int firstGroupWeight = countWeightCoins(coins.subList(0, 3));
        int secondGroupWeight = countWeightCoins(coins.subList(3, 6));
        if (firstGroupWeight > secondGroupWeight) {
            return Optional.of(coins.get(0).findOneFakeCoinOfThree(coins.get(3), coins.get(4), coins.get(5)));
        }
        if (firstGroupWeight < secondGroupWeight) {
            return Optional.of(coins.get(0).findOneFakeCoinOfThree(coins.get(0), coins.get(1), coins.get(2)));
        }
        if (firstGroupWeight == secondGroupWeight) {
            if (coins.get(6).getWeightCoin() > coins.get(7).getWeightCoin()) {
                return Optional.of(coins.get(7));
            }
            return Optional.of(coins.get(6));
        }
        return Optional.absent();
    }

    public void validate(List<Coin> coins) {
        if (coins.size() != ALLOWABLE_NUMBER_OF_COINS) {
            throw new IllegalArgumentException("In the method is transferred an inadmissible number of coins!");
        }
    }

    public int countWeightCoins(List<Coin> coins) {
        int countWeight = 0;
        for (Coin coin : coins) {
            countWeight += coin.getWeightCoin();
        }
        return countWeight;
    }
}
