package Main;

public class ReverseStraight {
    public static void main(String[] args) {
        String entered = "salas";

        System.out.println(foo(entered));
    }

    public static boolean foo(String entered) {
        for (int i = 0; i < entered.length() / 2; i++) {
            for (int j = entered.length() - 1; j > entered.length() / 2; j--) {
                if (entered.charAt(i) != entered.charAt(j)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
