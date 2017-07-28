package com;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Coin> coins = ImmutableList.of(
                new Coin(50),
                new Coin(50),
                new Coin(50),
                new Coin(40),
                new Coin(50),
                new Coin(50),
                new Coin(50),
                new Coin(50)
        );

        CalculateWeightCoin calculateWeightCoin = new CalculateWeightCoin();
        Optional<Coin> coin = calculateWeightCoin.getFakeCoin(coins);
        if (coin.isPresent()) {
            System.out.println("The fake coin is coin with weight " + coin.get().getWeightCoin());
        }else {
            System.out.println("All coins have equal weight.No fake coin!");
        }
    }
}
