package com;

public class Main {

    public static void main(String[] args) {
        CalculateWeightCoin calculateWeightCoin = new CalculateWeightCoin();

        Coin coin1 = new Coin(1, 50);
        Coin coin2 = new Coin(2, 50);
        Coin coin3 = new Coin(3, 50);
        Coin coin4 = new Coin(4, 40);
        Coin coin5 = new Coin(5, 50);
        Coin coin6 = new Coin(6, 50);
        Coin coin7 = new Coin(7, 50);
        Coin coin8 = new Coin(8, 50);

        int firstGropeWeight = calculateWeightCoin.countWeightCoins(coin1, coin2, coin3);
        int secondGropeWeight = calculateWeightCoin.countWeightCoins(coin4, coin5, coin6);

        try {
            if (firstGropeWeight > secondGropeWeight) {
                int idFakeCoin = calculateWeightCoin.findOneFakeCoinOfThree(coin4, coin5, coin6);
                System.out.println("Fake coin is coin with id " + idFakeCoin);
            }
            if (firstGropeWeight < secondGropeWeight) {
                int idFakeCoin = calculateWeightCoin.findOneFakeCoinOfThree(coin1, coin2, coin3);
                System.out.println("Fake coin is coin with id " + idFakeCoin);
            }
            if (firstGropeWeight == secondGropeWeight) {
                int idFakeCoin = calculateWeightCoin.findOneFakeCoinOfTwo(coin7, coin8);
                System.out.println("Fake coin is coin with id " + idFakeCoin);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
