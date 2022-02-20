// 1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int f = 0;

        while (n > 0) {
            int cd = n % 10;
            n = n / 10;

            if (cd == d) {
                f++;
            }
        }

        return f;
    }
}
                        
