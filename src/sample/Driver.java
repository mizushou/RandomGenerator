package sample;

public class Driver {

    public static void main(String[] args) {
        RandomIntGenerator rg = new RandomIntGenerator();
        // 100 - 999 (3digits)
        System.out.println(rg.generateRandomInt(900) + 100);

        // a - z
        System.out.println(rg.generateRandomAlphabet());

    }
}
