package math.iterative;

public class Power {

    private static int powerBD(int base, int power) {
        if (base == 0) {
            return 1;
        }
        int product = base;
        int currentPower = 1;
        while (currentPower * 2 <= power) {
            product *= product;
            currentPower *= 2;
        }
        for (int i = currentPower; currentPower < power; currentPower++) {
            product *= base;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(Power.powerBD(6, 8));
    }

}
