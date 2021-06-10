package Main;

public class Reverse {
    public static void main(String[] args) {
        int value = 122;
        int temp = 0;

        while (value > 0) {
            temp *= 10;
            int digit = value % 10;
            value /= 10;
            temp += digit;
        }

        System.out.println(temp);
    }
}
