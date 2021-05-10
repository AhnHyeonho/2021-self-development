import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Solution4 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("res/210510_4input.txt"));

        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int sum = 0;
        while(N>0) {
            sum += N%10;
            N=N/10;
        }
        System.out.println(sum);
    }
}