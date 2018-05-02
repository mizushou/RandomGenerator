package sample;

public class Driver {

    public static void main(String[] args) {
        RandomGenerator rg = new RandomGenerator();
        // 100 - 999 (3digits)
        System.out.println(rg.generateRandomInt(900) + 100);

        // a - z
        System.out.println(rg.generateRandomAlphabet());

    }
}
