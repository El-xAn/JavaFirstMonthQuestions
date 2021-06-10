package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("1. boluneni ve boleni daxil etmek " +
                    "\n2. 2e bolunenler" +
                    "\n3. cixish");

            int choice = s.nextInt();
            if (choice == 1) {
                Scanner sdd = new Scanner(System.in);
                System.out.println("boluneni daxil edin");
                int divised = sdd.nextInt();

                Scanner sdr = new Scanner(System.in);
                System.out.println("boleni daxil edin");
                int divisor = sdr.nextInt();

                System.out.println("bolunenler");

                divideBy(divised, divisor);
                exit = true;
            } else if (choice == 2) {
                Scanner s2 = new Scanner(System.in);
                System.out.println("ededi daxil edin");
                int value = s2.nextInt();

                System.out.println("2e bolunenler");

                divideBy2(value);
                exit = true;
            } else if (choice == 3) {
                System.out.println("bizi secdiyiniz ucun tesekkur edirik!");
                exit = false;
            }
        } while (exit);


    }

    public static void divideBy(int divisible, int divideBy) {
        for (int i = 0; i <= divisible; i++) {
            if (i % divideBy == 0) {
                System.out.println(i);
            }
        }
    }

    public static void divideBy2(int divisible) {
        divideBy(divisible, 2);
    }
}
