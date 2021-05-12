package day210510;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution2 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("res/210510_2input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int max = -1;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}