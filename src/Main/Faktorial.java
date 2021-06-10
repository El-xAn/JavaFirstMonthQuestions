package Main;

public class Faktorial {
    public static void main(String[] args) {
        int value = 5;
        int temp = 1;

//        while (value > 0) {
//            temp *= value;
//            value--;
//        }

//        for (int i = 1; i <= value; i++) {
//            temp *= i;
//        }
        System.out.println(temp);
        System.out.println(fak(value));
    }

    public static int fak(int n) {
        if (n == 0)
            return 1;
        else
            return (n * fak(n - 1));
    }
}
