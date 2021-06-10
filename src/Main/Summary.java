package Main;

public class Summary {
    public static void main(String[] args) {
        int value = 5896;
        int c = 0;

        while (value > 0) {
            int qal = value % 10;
            value = value / 10;
            c++;
//            c += qal;
        }
//        for (int i = value; i > 0; i++) {
//            int qal = value % 10;
//            value = value / 10;
//            c ++;
//        }
        System.out.println(c);
    }
}
