package pseudonerd;

import java.util.Scanner;

public class NonUniqueNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0, c = n;
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j] && a[i] != 0) {
                    if (c == n) {
                        c = i;
                        b[j] = 0;
                    }
                }
            }
            b[i] = 1;
            b[c] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (b[i] == 0) {
                sum -= a[i];
            } else {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
