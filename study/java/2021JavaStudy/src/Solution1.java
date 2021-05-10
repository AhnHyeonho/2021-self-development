
import java.io.FileInputStream;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        System.setIn(new FileInputStream("res/210510_1input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int gap = sc.nextInt() - sc.nextInt();
            if (gap > 0) {
                System.out.println("#" + test_case + " >");
            } else if(gap < 0) {
                System.out.println("#" + test_case + " <");
            } else {
                System.out.println("#" + test_case + " =");
            }
        }
    }
}