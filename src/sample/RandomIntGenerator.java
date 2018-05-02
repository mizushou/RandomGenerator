package sample;

import java.util.Random;

public class RandomIntGenerator {

    private Random randomGenerator;

    public RandomIntGenerator() {
        this.randomGenerator = new Random();
    }

    public int generateRandomInt(int bound) {
        return randomGenerator.nextInt(bound);
    }

    public char generateRandomAlphabet() {
        // 97 - 122
        int n = generateRandomInt(26) + 97;
        return (char) n;
    };


}
