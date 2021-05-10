import java.io.FileInputStream;
import java.util.Scanner;

class Solution5 {
    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("res/210510_5input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int normalNumCnt = 0;
            int length = sc.nextInt();
            int[] ia = new int[length];
            for (int i = 0; i < length; i++) {
                ia[i] = sc.nextInt();
            }
            for (int j = 1; j < length - 1; j++) {
                if ((ia[j - 1] < ia[j] && ia[j] < ia[j + 1]) || (ia[j - 1] > ia[j] && ia[j] > ia[j + 1])) {
                    normalNumCnt++;
                }
            }
            System.out.println("#" + test_case + " " + normalNumCnt);
        }
    }
}